package com.example.nourishmate.Factory;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;

import androidx.core.app.ActivityCompat;

import com.example.nourishmate.Compare;
import com.example.nourishmate.History;
import com.example.nourishmate.Login;
import com.example.nourishmate.R;
import com.example.nourishmate.ScanActivity;

public class IntentFactory {

    public static Intent getIntentFactory(MenuItem item, Activity activity){
        switch(item.getItemId()){
            case R.id.ScanProduct:
                return new Intent(activity, ScanActivity.class);

            case R.id.CompareProduct:
                return new Intent(activity, Compare.class);

            case R.id.CreacteAccount:
                return new Intent(activity, Login.class);

            case R.id.HistoryProduct:
                return new Intent(activity, History.class);

            default:
                return null;
        }
    }

}
