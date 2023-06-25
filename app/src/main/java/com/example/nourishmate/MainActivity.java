package com.example.nourishmate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.nourishmate.DatabaseHelper.Database;
import com.example.nourishmate.DatabaseHelper.DatabaseManager;
import com.example.nourishmate.Factory.IntentFactory;
import com.example.nourishmate.Models.AllergensTags;
import com.example.nourishmate.Models.ProductRequestResult;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("");
        setContentView(R.layout.activity_main);
/*
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                HashSet<AllergensTags> allergens = ProductRequestResult.getAllergenList();

                for (AllergensTags allergen : allergens) {
                    Database database = new Database(MainActivity.this);
                    if(!allergen.create(database)){

                    }
                }

            }
        });
        t.start();*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = IntentFactory.getIntentFactory(item, MainActivity.this);
        if(intent != null)
            startActivity(intent);
        return true;
    }

    private void getAllergens(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                HashSet<AllergensTags> allergens = ProductRequestResult.getAllergenList();
            }
        });
        t.start();
    }
}


