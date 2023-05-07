package com.example.nourishmate;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.nourishmate.Models.CaptureAct;
import com.example.nourishmate.Models.Product;
import com.example.nourishmate.Models.ProductRequestResult;
import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanIntentResult;
import com.journeyapps.barcodescanner.ScanOptions;

public class ScanActivity extends AppCompatActivity {

    Button scanButton;
    private TextView barCode;

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

        scanButton = findViewById(R.id.Scanbutton);
        barCode = findViewById(R.id.BarCode);

        scanButton.setOnClickListener(v ->
        {
            scanCode();
        });

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
                                barCode.setText(productRequestResult.getCode());
                            }
                        });
                    }
                }
            });
            t.start();

        }
    }
}