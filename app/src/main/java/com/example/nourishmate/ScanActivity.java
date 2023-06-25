package com.example.nourishmate;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.nourishmate.DatabaseHelper.DatabaseManager;
import com.example.nourishmate.Factory.IntentFactory;
import com.example.nourishmate.Models.AdditivesTags;
import com.example.nourishmate.Models.AlertDialogs;
import com.example.nourishmate.Models.AllergensTags;
import com.example.nourishmate.Models.CaptureAct;
import com.example.nourishmate.Models.CategoriesTags;
import com.example.nourishmate.Models.CountriesTags;
import com.example.nourishmate.Models.Nutriments;
import com.example.nourishmate.Models.Product;
import com.example.nourishmate.Models.ProductRequestResult;
import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanIntentResult;
import com.journeyapps.barcodescanner.ScanOptions;

import org.intellij.lang.annotations.JdkConstants;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import okhttp3.ConnectionSpec;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ScanActivity extends AppCompatActivity {

    Button scanButton;
    private TableLayout table, suggestedTable;
    private TextView productName;
    private ImageView productImage;
    private Map<String, String> imageMapped;
    public static ProductRequestResult productRequestResult;
    private ArrayList<Product> productArrayList;
    private ArrayList<ImageView> imageViewArrayList;
    private Bitmap bmp;
    private Intent intent;
    private Product product;
    ActivityResultLauncher<ScanOptions> activityResultLauncher = registerForActivityResult(new ScanContract(), result -> {
        GetActivityResult(result);
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        setTitle("");
        initControls();

        scanButton.setOnClickListener(v ->
        {
            scanCode();
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.scan_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = IntentFactory.getIntentFactory(item, ScanActivity.this);
        if (intent != null)
            startActivity(intent);
        return true;
    }


    private void initControls() {
        scanButton = findViewById(R.id.Scanbutton);
        productName = findViewById(R.id.ProductName);
        productImage = findViewById(R.id.ProductImage);
        table = findViewById(R.id.ProductTable);
        suggestedTable = findViewById(R.id.SuggestedProduct);
    }

    private void scanCode() {
        if (table.getChildCount() > 0) {
            table.removeAllViews();
        }

        if (suggestedTable.getChildCount() > 0) {
            suggestedTable.removeAllViews();
        }

        ScanOptions scanOptions = new ScanOptions();
        scanOptions.setPrompt("Augmenter les volume pour activer le flash");
        scanOptions.setBeepEnabled(true);
        scanOptions.setOrientationLocked(true);
        scanOptions.setCaptureActivity(CaptureAct.class);
        activityResultLauncher.launch(scanOptions);
    }

    private void GetActivityResult(ScanIntentResult result) {
        if (result.getContents() != null) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    productRequestResult = ProductRequestResult.getProductByCodeScan(result.getContents());
                    if (productRequestResult.getStatus() == 1) {
                        bmp = getImage(productRequestResult.getProduct(), "fr");
                        if (bmp == null) {
                            bmp = getImage(productRequestResult.getProduct(), "en");
                        }
                        if (bmp != null) {
                            getBestProducts(productRequestResult.getProduct());
                            getImageViewArray();
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    productImage.setImageBitmap(bmp);
                                    displayProductInformation(productRequestResult.getProduct());
                                    if (productArrayList != null && productArrayList.size() > 0) {
                                        displayBestProductDatas();
                                    }
                                    if (Login.user != null && Login.user.getLoggedOn())
                                        displayAllergenWarnings(productRequestResult.getProduct());
                                }
                            });
                        }
                    }
                }
            }
            );
            t.start();
        }
    }

    private void displayAllergenWarnings(Product product) {

        String allergens = "";

        for (AllergensTags all : product.getAllergensTags()) {
            if (all.getLabel().split(":")[0].equals("en") || all.getLabel().split(":")[0].equals("fr")){
                if(Login.user.getAllergensTagsCount() > 0){
                    if(Login.user.getAllergensTags().stream().filter(o->o.getLabel().equals(all.getLabel().split(":")[1])).findAny().isPresent()){
                        allergens += Login.user.getAllergensTags().stream().filter(o->o.getLabel().equals(all.getLabel().split(":")[1])).findFirst().get().getLabel() + ", ";
                    }
                }
            }
        }

        if(!allergens.isEmpty() && allergens.length() > 2){
            allergens = allergens.substring(0, allergens.length()-2);
        }
        AlertDialogs.displayInformationToUser( false, true, "allergènes", "présence de substances allergène : " + allergens, Optional.empty(), Optional.empty(), Optional.empty());
    }

    private void displayProductInformation(Product product) {
        productName.setText(product.getProductName());
        populateTableLayout(product);
    }

    private void populateTableLayout(Product product) {
        TableRow row = new TableRow(this);
        row.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);

        row.addView(setHeaderRow("Catégorie"));
        row.addView(setHeaderRow("Description"));
        row.addView(setHeaderRow("Pour 100 g"));

        table.addView(row);
        if (product.getAdditivesN() > 0)
            table.addView(setAdditifRow(product));

        if (product.getNutriments() != null)
            setNutrimentsRows(product);

    }

    private TextView setHeaderRow(String headerName) {
        TextView textView = new Button(this);
        textView.setText(headerName);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(14);
        textView.setPadding(10, 10, 10, 10);

        return textView;
    }

    private TableRow setAdditifRow(Product product) {
        TableRow row = new TableRow(this);
        table.setGravity(Gravity.CENTER_HORIZONTAL);
        row.setLayoutParams(table.getLayoutParams());
        String data = "Additifs";
        row.addView(setColumnValues(data));
        data = product.getAdditivesN() > 0 ? product.getAdditivesN() + " additifs" : "Pas d'additifs";
        row.addView(setColumnValues(data));
        data = "";
        for (AdditivesTags ingredient : product.getAdditivesTags()) {
            if (ingredient.getLabel().startsWith("fr:") || ingredient.getLabel().startsWith("en:"))
                data += ingredient.getLabel().split(":")[1] + "\n";
        }
        row.addView(setColumnValues(data));
        return row;
    }

    private void setNutrimentsRows(Product product) {
        TableRow rowProteine = new TableRow(this);
        TableRow rowEnergyKcal = new TableRow(this);
        TableRow rowSucre = new TableRow(this);
        TableRow rowGrasSature = new TableRow(this);
        TableRow rowSel = new TableRow(this);

        Nutriments p = product.getNutriments();
        String data = "";

        if (p.getProteins100G() > 0) {
            rowProteine.addView(setColumnValues("Protéines"));
            data = p.getProteins100G() < 2 ? "médiocre qualité" :
                    p.getProteins100G() > 2 && p.getProteins100G() < 6 ? "Qualité moyenne" : "Excellente qualité";
            rowProteine.addView(setColumnValues(data));
            rowProteine.addView(setColumnValues(p.getProteins100G() + p.getProteinsUnit()));
            rowProteine.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);
        }

        if (p.getEnergyKcal100G() > 0) {
            rowEnergyKcal.addView(setColumnValues("Calories"));
            data = p.getEnergyKcal100G() < 100 ? "Peu calorique" :
                    p.getEnergyKcal100G() > 100 && p.getEnergyKcal100G() < 250 ? "Apport normal" : "très calorique";
            rowEnergyKcal.addView(setColumnValues(data));
            rowEnergyKcal.addView(setColumnValues(p.getEnergyKcal100G() + p.getEnergyKcalUnit()));
            rowEnergyKcal.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);
        }

        rowSucre.addView(setColumnValues("Sucre"));
        data = p.getSugars100G() == 0 ? "Sans sucre" :
                p.getSugars100G() < 4 ? "Peu sucré" :
                        p.getSugars100G() > 4 && p.getSugars100G() < 10 ? "Apport normal" :
                                "très sucré";
        rowSucre.addView(setColumnValues(data));
        rowSucre.addView(setColumnValues(p.getSugars100G() + p.getSugarsUnit()));
        rowSucre.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);

        rowGrasSature.addView(setColumnValues("Gras saturé"));
        data = p.getSaturatedFat100G() == 0 ? "Aucun impact" :
                p.getSaturatedFat100G() < 5 ? "Faible impact" :
                        p.getSaturatedFat100G() > 5 && p.getSaturatedFat100G() < 10 ? "impact normal" :
                                "Fort impact";
        rowGrasSature.addView(setColumnValues(data));
        rowGrasSature.addView(setColumnValues(p.getSaturatedFat100G() + p.getSaturatedFatUnit()));
        rowGrasSature.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);

        rowSel.addView(setColumnValues("Sel"));
        data = p.getSalt100G() == 0 ? "Aucun impact" :
                p.getSalt100G() < 2 ? "Faible impact" :
                        p.getSalt100G() > 2 && p.getSalt100G() < 5 ? "impact normal" :
                                "Fort impact";
        rowSel.addView(setColumnValues(data));
        rowSel.addView(setColumnValues(p.getSalt100G() + p.getSaltUnit()));
        rowSel.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);

        table.addView(rowProteine);
        table.addView(rowEnergyKcal);
        table.addView(rowSucre);
        table.addView(rowGrasSature);
        table.addView(rowSel);
    }

    private TextView setColumnValues(String data) {
        TextView textView = new Button(this);
        textView.setText(data);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(13);
        textView.setPadding(10, 10, 10, 10);
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        textView.setBackgroundColor(Color.TRANSPARENT);

        return textView;
    }

    private void getBestProducts(Product product) {
        String countryTags = "";
        String categoriesTags = "";

        for (CountriesTags country : product.getCountriesTags()) {
            if (country.getLabel().split(":")[1].equals("france")) {
                countryTags = country.getLabel().split(":")[1];
                break;
            }
        }
        for (CategoriesTags cat : product.getCategoriesTags()) {
            if (cat.getLabel().split(":")[0].equals("fr")) {
                categoriesTags = cat.getLabel().split(":")[1];
                break;
            }
        }

        productArrayList = ProductRequestResult.getBestAlternaviveProducts(product.getCode(), countryTags, categoriesTags);
    }

    private void displayBestProductDatas() {
        TableRow titleRow = new TableRow(this);
        TableRow imageRow = new TableRow(this);

        for (int i = 0; i < productArrayList.size(); i++) {
            product = productArrayList.get(i);
            titleRow.addView(setColumnValues(product.getProductName()));

            ImageView img = imageViewArrayList.get(i);
            img.setId(i);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    product = productArrayList.get(v.getId());
                    intent = new Intent(ScanActivity.this, SuggestedProductDetails.class);
                    intent.putExtra("code", product.getCode());
                    startActivity(intent);
                }
            });
            imageRow.addView(imageViewArrayList.get(i));
        }

        suggestedTable.addView(titleRow);
        suggestedTable.addView(imageRow);
    }

    private void getImageViewArray() {
        imageViewArrayList = new ArrayList<>();
        for (Product product : productArrayList) {
            Bitmap map = getImage(product, "fr");
            if (map == null) {
                map = getImage(product, "en");
            }
            ImageView img = new ImageView(this);
            img.setImageBitmap(map);
            imageViewArrayList.add(img);
        }
    }

    private Bitmap getImage(Product product, String countryCode) {

        if (product.getSelectedImages().getFront().getDisplay().getMappedImageLinkedByLangage().containsKey(countryCode)) {
            String link = product.getSelectedImages().getFront().getDisplay().getMappedImageLinkedByLangage().get(countryCode);
            if (link != null) {
                try {
                    URL url = new URL(link);
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                    httpsURLConnection.setDoInput(true);
                    return BitmapFactory.decodeStream(httpsURLConnection.getInputStream());

                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }
}