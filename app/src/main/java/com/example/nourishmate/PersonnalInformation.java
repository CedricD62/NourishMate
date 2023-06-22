package com.example.nourishmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.nourishmate.DatabaseHelper.Database;
import com.example.nourishmate.Models.AllergensTags;
import com.example.nourishmate.Models.User;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PersonnalInformation extends AppCompatActivity {

    private TextView login, pseudo;
    private LinearLayout layoutAllergensTags;
    private Button update, delete;
    private Intent intent;
    private ArrayList<AllergensTags> allergensTags;
    private ArrayList<AllergensTags> allergensTagsRegistered;
    private Map<AllergensTags,Boolean> allergensTagsMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personnal_information);
        initControls();
        Database database = new Database(this);
        allergensTags = AllergensTags.GetAll(database);
        allergensTagsRegistered = new ArrayList<>();
        allergensTagsMap = new LinkedHashMap<>();
        populateEditTextLayout();
    }

    private void initControls(){
        login = findViewById(R.id.etLogin);
        pseudo = findViewById(R.id.etPseudo);
        layoutAllergensTags = findViewById(R.id.layoutAllergensTags);
        update = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnDelete);
    }

    private void populateEditTextLayout(){

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        int columnCount = 3;
        int currentColumn = 0;
        LinearLayout currentRow = null;
        LinearLayout allergenContainer = new LinearLayout(this);
        allergenContainer.setOrientation(LinearLayout.VERTICAL);

        for (AllergensTags allergen : allergensTags) {
            allergensTagsMap.put(allergen, false);

            if (currentColumn == 0) {
                // Create a new row
                currentRow = new LinearLayout(this);
                currentRow.setOrientation(LinearLayout.HORIZONTAL);
                allergenContainer.addView(currentRow);
            }

            Button allergenText = new Button(this);
            allergenText.setText(allergen.getLabel());
            allergenText.setId(allergen.getId());

            allergenText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int id = (int)v.getId() - 1;
                   Boolean hasBeenTag = allergensTagsMap.get(allergensTags.get(id));

                    if(!hasBeenTag){
                        allergenText.setTextColor(Color.BLUE);
                        allergenText.setBackgroundColor(Color.MAGENTA);
                        allergensTagsRegistered.add(allergensTags.get(id));
                        allergensTagsMap.replace(allergensTags.get(id), false, true);
                    }else{
                        allergenText.setTextColor(Color.BLACK);
                        allergenText.setBackgroundColor(Color.LTGRAY);
                        allergensTagsRegistered.remove(allergensTags.get(id));
                        allergensTagsMap.replace(allergensTags.get(id), true, false);
                    }
                }
            });

            currentRow = (LinearLayout) allergenContainer.getChildAt(allergenContainer.getChildCount() - 1);
            currentRow.addView(allergenText, layoutParams);
            currentColumn++;

            if (currentColumn >= columnCount) {
                currentColumn = 0;
            }
        }
        ScrollView scrollView = new ScrollView(this);
        scrollView.addView(allergenContainer);

        layoutAllergensTags.addView(scrollView);
    }


}