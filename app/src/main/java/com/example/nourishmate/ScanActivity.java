package com.example.nourishmate;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.nourishmate.Models.CaptureAct;
import com.example.nourishmate.Models.Product;
import com.example.nourishmate.Models.ProductRequestResult;
import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanIntentResult;
import com.journeyapps.barcodescanner.ScanOptions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

public class ScanActivity extends AppCompatActivity {

    Button scanButton;
    private TableLayout table;
    private TextView productName;
    private ImageView productImage;
    private Map<String, String> imageMapped;

    ActivityResultLauncher<ScanOptions> activityResultLauncher = registerForActivityResult(new ScanContract(), result -> {
        /*if(result.getContents() != null){
            AlertDialog.Builder builder = new AlertDialog.Builder(ScanActivity.this);
            builder.setTitle("Result");
            builder.setMessage(result.getContents());
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).show();
        }*/
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

    private void initControls() {
        scanButton = findViewById(R.id.Scanbutton);
        table = findViewById(R.id.tableLayout);
        productName = findViewById(R.id.ProductName);
        productImage = findViewById(R.id.ProductImage);
    }

    private void scanCode() {
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

                                productName.setText(productRequestResult.getProduct().getProductName());

                            }
                        });
                    }
                    if (productRequestResult.getProduct().getSelectedImages().getFront().getSmall().getMappedImageLinkedByLangage().containsKey("fr")) {
                        String link = productRequestResult.getProduct().getSelectedImages().getFront().getSmall().getMappedImageLinkedByLangage().get("fr");
                        if (link != null) {
                            try {
                                URL url = new URL(link);
                                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                                httpsURLConnection.setDoInput(true);
                                Bitmap bmp = BitmapFactory.decodeStream(httpsURLConnection.getInputStream());
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        productImage.setImageBitmap(bmp);
                                    }
                                });
                            } catch (MalformedURLException e) {
                                throw new RuntimeException(e);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            if (productRequestResult.getProduct().getSelectedImages().getFront().getSmall().getMappedImageLinkedByLangage().containsKey("en")) {
                                link = productRequestResult.getProduct().getSelectedImages().getFront().getSmall().getMappedImageLinkedByLangage().get("en");
                                if (link != null) {
                                    try {
                                        URL url = new URL(link);
                                        Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                productImage.setImageBitmap(bmp);
                                            }
                                        });
                                    } catch (MalformedURLException e) {
                                        throw new RuntimeException(e);
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                            }
                        }
                    }
                }
            });
            t.start();

        }
    }
}