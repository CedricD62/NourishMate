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
import com.example.nourishmate.Models.CaptureAct;
import com.example.nourishmate.Models.Nutriments;
import com.example.nourishmate.Models.Product;
import com.example.nourishmate.Models.ProductRequestResult;
import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanIntentResult;
import com.journeyapps.barcodescanner.ScanOptions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

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
    private TableLayout table;
    private TextView productName;
    private ImageView productImage;
    private Map<String, String> imageMapped;

    ActivityResultLauncher<ScanOptions> activityResultLauncher = registerForActivityResult(new ScanContract(), result -> {
        GetActivityResult(result);
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
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
        //table = findViewById(R.id.tableLayout);
        productName = findViewById(R.id.ProductName);
        productImage = findViewById(R.id.ProductImage);
        //categorie = findViewById(R.id.Categorie);
        //quantite = findViewById(R.id.quantite);
        //descriptif = findViewById(R.id.Descriptif);
        table = findViewById(R.id.ProductTable);

    }

    private void scanCode() {
        if (table.getChildCount() > 0) {
            table.removeAllViews();
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
                    ProductRequestResult productRequestResult = ProductRequestResult.getProductByCodeScan(result.getContents());

                    if (productRequestResult != null) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                displayProductInformation(productRequestResult);
                            }
                        });
                    }
                }
            });
            t.start();
        }
    }

    private void displayProductInformation(ProductRequestResult productRequestResult) {
        productName.setText(productRequestResult.getProduct().getProductName());
        populateTableLayout(productRequestResult);
    }

    private void populateTableLayout(ProductRequestResult productRequestResult) {
        TableRow row = new TableRow(this);
        table.setGravity(Gravity.CENTER_HORIZONTAL);
        row.setLayoutParams(table.getLayoutParams());

        row.addView(setHeaderRow("Catégorie"));
        row.addView(setHeaderRow("Description"));
        row.addView(setHeaderRow("Pour 100 g"));

        table.addView(row);
        if (productRequestResult.getProduct().getAdditivesN() > 0)
            table.addView(setAdditifRow(productRequestResult));

        if (productRequestResult.getProduct().getNutriments() != null)
            setNutrimentsRows(productRequestResult);

        DatabaseManager databaseManager = new DatabaseManager(this);
        boolean result = productRequestResult.getProduct().create(databaseManager);

    }

    private TextView setHeaderRow(String headerName) {
        TextView textView = new Button(this);
        textView.setText(headerName);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(14);
        textView.setPadding(10, 10, 10, 10);

        return textView;
    }

    @SuppressLint("SuspiciousIndentation")
    private TableRow setAdditifRow(ProductRequestResult productRequestResult) {
        TableRow row = new TableRow(this);
        table.setGravity(Gravity.CENTER_HORIZONTAL);
        row.setLayoutParams(table.getLayoutParams());
        String data = "Additifs";
        row.addView(setColumnValues(data));
        data = productRequestResult.getProduct().getAdditivesN() > 0 ? productRequestResult.getProduct().getAdditivesN() + " additifs" : "Pas d'additifs";
        row.addView(setColumnValues(data));
        data = "";
        for (AdditivesTags ingredient : productRequestResult.getProduct().getAdditivesTags()) {
            if (ingredient.getLabel().startsWith("fr:") || ingredient.getLabel().startsWith("en:"))
                data += ingredient.getLabel().split(":")[1] + "\n";
        }
        /*for (int i = 0; i < productRequestResult.getProduct().getAdditivesTags().size(); i++) {
            if (productRequestResult.getProduct().getAdditivesTags().(i).startsWith("fr:") || productRequestResult.getProduct().getAdditivesTags().get(i).startsWith("en:"))
                data += productRequestResult.getProduct().getAdditivesTags().get(i).split(":")[1] + "\n";
        }*/
        row.addView(setColumnValues(data));
        return row;
    }

    private void setNutrimentsRows(ProductRequestResult productRequestResult) {
        TableRow rowProteine = new TableRow(this);
        TableRow rowEnergyKcal = new TableRow(this);
        TableRow rowSucre = new TableRow(this);
        TableRow rowGrasSature = new TableRow(this);
        TableRow rowSel = new TableRow(this);

        Nutriments p = productRequestResult.getProduct().getNutriments();
        String data = "";

        if (p.getProteins100G() > 0) {
            rowProteine.addView(setColumnValues("Protéines"));
            data = p.getProteins100G() < 2 ? "médiocre qualité" :
                    p.getProteins100G() > 2 && p.getProteins100G() < 6 ? "Qualité moyenne" : "Excellente qualité";
            rowProteine.addView(setColumnValues(data));
            rowProteine.addView(setColumnValues(p.getProteins100G() + p.getProteinsUnit()));
        }

        if (p.getEnergyKcal100G() > 0) {
            rowEnergyKcal.addView(setColumnValues("Calories"));
            data = p.getEnergyKcal100G() < 100 ? "Peu calorique" :
                    p.getEnergyKcal100G() > 100 && p.getEnergyKcal100G() < 250 ? "Apport normal" : "très calorique";
            rowEnergyKcal.addView(setColumnValues(data));
            rowEnergyKcal.addView(setColumnValues(p.getEnergyKcal100G() + p.getEnergyKcalUnit()));
        }

        rowSucre.addView(setColumnValues("Sucre"));
        data = p.getSugars100G() == 0 ? "Sans sucre" :
                p.getSugars100G() < 4 ? "Peu sucré" :
                        p.getSugars100G() > 4 && p.getSugars100G() < 10 ? "Apport normal" :
                                "très sucré";
        rowSucre.addView(setColumnValues(data));
        rowSucre.addView(setColumnValues(p.getSugars100G() + p.getSugarsUnit()));

        rowGrasSature.addView(setColumnValues("Gras saturé"));
        data = p.getSaturatedFat100G() == 0 ? "Aucun impact" :
                p.getSaturatedFat100G() < 5 ? "Faible impact" :
                        p.getSaturatedFat100G() > 5 && p.getSaturatedFat100G() < 10 ? "impact normal" :
                                "Fort impact";
        rowGrasSature.addView(setColumnValues(data));
        rowGrasSature.addView(setColumnValues(p.getSaturatedFat100G() + p.getSaturatedFatUnit()));

        rowSel.addView(setColumnValues("Sel"));
        data = p.getSaturatedFat100G() == 0 ? "Aucun impact" :
                p.getSaturatedFat100G() < 2 ? "Faible impact" :
                        p.getSaturatedFat100G() > 2 && p.getSaturatedFat100G() < 5 ? "impact normal" :
                                "Fort impact";
        rowSel.addView(setColumnValues(data));
        rowSel.addView(setColumnValues(p.getSalt100G() + p.getSaltUnit()));

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
}