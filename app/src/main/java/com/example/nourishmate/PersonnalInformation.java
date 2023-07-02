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
import android.widget.Toast;

import com.example.nourishmate.DatabaseHelper.Database;
import com.example.nourishmate.Models.AlertDialogs;
import com.example.nourishmate.Models.AllergenTagsUser;
import com.example.nourishmate.Models.AllergensTags;
import com.example.nourishmate.Models.User;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class PersonnalInformation extends AppCompatActivity {

    private TextView login, pseudo;
    private LinearLayout layoutAllergensTags;
    private Button update, delete;
    private Intent intent;
    private ArrayList<AllergensTags> allergensTags;
    private Map<AllergensTags, Boolean> allergensTagsMap;
    private Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("");
        setContentView(R.layout.activity_personnal_information);

        initControls();
        database = new Database(this);
        allergensTags = AllergensTags.GetAll(database);
        allergensTagsMap = new LinkedHashMap<>();

        if (Login.user == null)
            Login.user = new User();
        else{
            login.setText(Login.user.getLogin());
            pseudo.setText(Login.user.getPseudo());
        }

        populateEditTextLayout();
        buttonsListenners();
    }

    private void initControls() {
        login = findViewById(R.id.etLogin);
        pseudo = findViewById(R.id.etPseudo);
        layoutAllergensTags = findViewById(R.id.layoutAllergensTags);
        update = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnDelete);
    }

    private void buttonsListenners() {
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!login.getText().toString().isEmpty() && !pseudo.getText().toString().isEmpty()) {
                    Login.user.setLogin(login.getText().toString());
                    Login.user.setPseudo(pseudo.getText().toString());
                    if(!Login.user.getLoggedOn()){
                        if (Login.user.create(database)) {
                            Login.user.setUserId(database);
                            if (Login.user.getAllergensTagsCount() > 0) {
                                registerAllergenTagsUserInBdd();
                                AlertDialogs.displayInformationToUser( false, true,
                                        "Mise à jour de compte", "le compte a bien été mis à jour",
                                        Optional.empty(), Optional.empty(), Optional.empty());
                            }
                        } else {
                            AlertDialogs.displayInformationToUser( false, true,
                                    "Création de compte", "Echec de création de compte impossible, contacter l'administrateur",
                                    Optional.empty(), Optional.empty(), Optional.empty());
                        }
                    }else{
                        if (Login.user.getAllergensTagsCount() > 0) {
                            if(AllergenTagsUser.Delete(database)){
                                registerAllergenTagsUserInBdd();
                                AlertDialogs.displayInformationToUser( false, true, "Mise à jour de compte",
                                        "le compte a bien été mis à jour", Optional.empty(),
                                        Optional.empty(), Optional.empty());
                            }else{
                                AlertDialogs.displayInformationToUser( false, true, "Mise à jour allergène",
                                        "Echec de mise à jour de la liste des allergènes, contacter l'administrateur",
                                        Optional.empty(), Optional.empty(), Optional.empty());
                            }
                        }}}}});
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(AllergenTagsUser.Delete(database)){
                   if(Login.user.delete(database)){
                       AlertDialogs.displayInformationToUser( false, true, "Suppression de compte",
                               "Suppression du compte effectuée", Optional.empty(),
                               Optional.empty(), Optional.empty());
                   }else{
                       AlertDialogs.displayInformationToUser(true,  false, "Suppression de compte",
                               "echec de suppression de compte", Optional.empty(), Optional.empty(),
                               Optional.empty());
                   }
               }else{
                   AlertDialogs.displayInformationToUser( false, true, "Suppression de compte",
                           "echec de suppression de compte", Optional.empty(), Optional.empty(),
                           Optional.empty());
               }}});}

    private void registerAllergenTagsUserInBdd() {
        for (AllergensTags al : Login.user.getAllergensTags()) {
            AllergenTagsUser allergenTagsUser = new AllergenTagsUser(Login.user.getId(), al.getId());
            if (!allergenTagsUser.create(database)) {
                AlertDialogs.displayInformationToUser(true, true, "Ajout allergène",
                        "Echec de l'ajoût de l'allergène, contacter l'administrateur, contacter l'administrateur",
                        Optional.empty(), Optional.empty(), Optional.empty());
                break;
            }
        }
    }

    private void populateEditTextLayout() {

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
            allergenRegistered(allergenText, allergensTagsMap, allergen);
            allergenText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int id = (int) v.getId() - 1;
                    Boolean hasBeenTag = allergensTagsMap.get(allergensTags.get(id));

                    if (!hasBeenTag) {
                            allergenText.setTextColor(Color.BLUE);
                            allergenText.setBackgroundColor(Color.MAGENTA);
                            Login.user.setAllergensTags(allergensTags.get(id));
                            allergensTagsMap.replace(allergensTags.get(id), false, true);
                    } else {
                        allergenText.setTextColor(Color.BLACK);
                        allergenText.setBackgroundColor(Color.LTGRAY);
                        Login.user.removeAllergensTags(allergensTags.get(id));
                        allergensTagsMap.replace(allergensTags.get(id), true, false);
                    }}});

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

    private void allergenRegistered(Button allergenText, Map<AllergensTags, Boolean> allergensTagsMap, AllergensTags allergen) {
        if(Login.user.getAllergensTags().stream().filter(o->o.getLabel().equals(allergen.getLabel())).findFirst().isPresent()){
            allergensTagsMap.replace(allergensTags.get(allergen.getId() - 1), false, true);
            allergenText.setTextColor(Color.BLUE);
            allergenText.setBackgroundColor(Color.MAGENTA);
        }
    }


}