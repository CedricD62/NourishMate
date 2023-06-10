package com.example.nourishmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nourishmate.Models.User;

public class PersonnalInformation extends AppCompatActivity {

    private TextView login, pseudo;
    private LinearLayout layoutAllergensTags;
    private Button update, delete;

    private User user;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personnal_information);

    }

    private void initControls(){
        login = findViewById(R.id.etLogin);
        pseudo = findViewById(R.id.etPseudo);
        layoutAllergensTags = findViewById(R.id.layoutAllergensTags);
        update = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnDelete);
    }



}