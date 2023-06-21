package com.example.nourishmate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nourishmate.DatabaseHelper.Database;
import com.example.nourishmate.Factory.IntentFactory;
import com.example.nourishmate.Models.User;

public class Login extends AppCompatActivity {

    private EditText pseudo, login;
    private Button connexion, createAccount;
    private Intent intent;
    private static User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initControl();
        buttonsListenner();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = IntentFactory.getIntentFactory(item, Login.this);
        if (intent != null)
            startActivity(intent);
        return true;
    }

    private void initControl() {
        pseudo = findViewById(R.id.pseudoEditText);
        login = findViewById(R.id.loginEditText);
        createAccount = findViewById(R.id.createAccountButton);
        connexion = findViewById(R.id.loginButton);
    }


    private void buttonsListenner() {
        createAccount.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, PersonnalInformation.class);
            startActivity(intent);
        });

        connexion.setOnClickListener(v -> {
            Database database = new Database(Login.this);

            String p = pseudo.getText().toString();
            String l = login.getText().toString() ;

            if ( p.isEmpty()  == false && l.isEmpty() == false) {
                user = User.getAllUserData(database, pseudo.getText().toString(), login.getText().toString());

                if (user == null) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("Création de compte");
                    alert.setMessage("Voulez vous enregistrer vos informations ? ");
                    alert.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(Login.this, PersonnalInformation.class);
                            startActivity(intent);
                        }
                    });
                    alert.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.create().show();
                }
            }else{
                Toast.makeText(this, "Veuillez saisir votre identifiant et mot de passe", Toast.LENGTH_LONG).show();
            }
        });
    }
}