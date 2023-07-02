package com.example.nourishmate.Models;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.nourishmate.Login;
import com.example.nourishmate.PersonnalInformation;

import java.util.Optional;

public class AlertDialogs {

    public static void displayInformationToUser(Boolean isActionDialog, Boolean isOkDialog, String title, String message, Optional<Intent> intentToYesAction, Optional<Intent> intentToNoAction, Optional<Context> activity) {
        if (isActionDialog) {
            actionDialog(title, message, intentToYesAction, intentToNoAction, activity);
        }
        if (isOkDialog) {
            okDialog(title, message, activity);
        }
    }

    private static void actionDialog(String title, String message, Optional<Intent> intentToYesAction, Optional<Intent> intentToNoAction, Optional<Context> activity) {
        AlertDialog.Builder alert = new AlertDialog.Builder(activity.orElse(null));
        alert.setTitle(title);
        alert.setMessage(message);
        alert.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                activity.get().startActivity(intentToYesAction.get());
            }
        });
        alert.setNegativeButton("Non", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(!intentToNoAction.isPresent()){
                    Activity activityInstance = (Activity) activity.get();
                    activityInstance.finish();
                }else{
                    activity.get().startActivity(intentToNoAction.get());
                }
            }
        });
        alert.create().show();
    }

    private static void okDialog(String title, String message, Optional<Context> activity) {
        Context c = activity.orElse(null);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity.orElse(null));
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();
    }
}
