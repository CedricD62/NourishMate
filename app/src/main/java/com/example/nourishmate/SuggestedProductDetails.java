package com.example.nourishmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.nourishmate.Models.AdditivesTags;
import com.example.nourishmate.Models.Nutriments;
import com.example.nourishmate.Models.Product;
import com.example.nourishmate.Models.ProductRequestResult;
import com.journeyapps.barcodescanner.ScanIntentResult;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class SuggestedProductDetails extends AppCompatActivity {

    private TextView SuggestedProductName;
    private ImageView SuggestedProductImage;
    private TableLayout SuggestedProductTable;
    private Intent intent;
    private String suggestedProductCode;
    private  Bitmap bmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Détail produit suggéré");
        setContentView(R.layout.activity_suggested_product_details);
        initControls();
        intent = getIntent();
        suggestedProductCode = intent.getStringExtra("code");
        displaySuggestedProduct();
    }

    private void initControls(){
        SuggestedProductTable = findViewById(R.id.SuggestedProductTable);
        SuggestedProductName = findViewById(R.id.SuggestedProductName);
        SuggestedProductImage = findViewById(R.id.SuggestedProductImage);
    }

    private void displaySuggestedProduct() {

            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    ProductRequestResult productRequestResult = ProductRequestResult.getProductByCodeScan(suggestedProductCode);
                    if (productRequestResult.getStatus() == 1) {
                         bmp = getImage(productRequestResult.getProduct(), "fr");
                        if (bmp == null) {
                            bmp = getImage(productRequestResult.getProduct(), "en");
                        }
                        if (bmp != null) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    SuggestedProductImage.setImageBitmap(bmp);
                                    displayProductInformation(productRequestResult.getProduct());
                                }
                            });
                        }
                    }
                }
            }
            );
            t.start();

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

    private void displayProductInformation(Product product) {
        SuggestedProductName.setText(product.getProductName());
        populateTableLayout(product);
    }

    private void populateTableLayout(Product product) {
        TableRow row = new TableRow(this);
        row.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);

        row.addView(setHeaderRow("Catégorie"));
        row.addView(setHeaderRow("Description"));
        row.addView(setHeaderRow("Pour 100 g"));

        SuggestedProductTable.addView(row);
        if (product.getAdditivesN() > 0)
            SuggestedProductTable.addView(setAdditifRow(product));

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
        SuggestedProductTable.setGravity(Gravity.CENTER_HORIZONTAL);
        row.setLayoutParams(SuggestedProductTable.getLayoutParams());
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

        SuggestedProductTable.addView(rowProteine);
        SuggestedProductTable.addView(rowEnergyKcal);
        SuggestedProductTable.addView(rowSucre);
        SuggestedProductTable.addView(rowGrasSature);
        SuggestedProductTable.addView(rowSel);
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