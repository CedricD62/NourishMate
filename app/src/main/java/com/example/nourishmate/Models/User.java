package com.example.nourishmate.Models;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.nourishmate.DatabaseHelper.Database;

import java.util.ArrayList;

public class User {
    public User(String pseudo, String login) {
        this.pseudo = pseudo;
        Login = login;
    }

    public User(int id, String pseudo, String login) {
        this.id = id;
        this.pseudo = pseudo;
        Login = login;
        this.allergensTags = allergensTags;
    }

    public User(String pseudo, String login, ArrayList<AllergensTags> allergensTags) {
        this.pseudo = pseudo;
        Login = login;
        this.allergensTags = allergensTags;
    }

    private int id;
    private String pseudo;
    private String Login;

    private ArrayList<AllergensTags> allergensTags;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public ArrayList<AllergensTags> getAllergensTags() {
        return allergensTags;
    }

    public void setAllergensTags(ArrayList<AllergensTags> allergensTags) {
        this.allergensTags = allergensTags;
    }

    public boolean create(Database dataBase){
        try{
            SQLiteDatabase db = dataBase.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(dataBase.USER_COLUMN_LOGIN, this.Login);
            contentValues.put(dataBase.USER_COLUMN_PSEUDO, this.pseudo);

            return db.insert(dataBase.USER_TABLE_NAME, null, contentValues) != -1 ;
        }catch (Exception ex ){
            String value = "";
            return false;
        }

    }

    public boolean getUserId(Database database){

        SQLiteDatabase db = database.getWritableDatabase();
        String query = "SELECT "+ database.USER_COLUMN_ID +" FROM " + database.USER_TABLE_NAME +
                " WHERE " + database.USER_COLUMN_PSEUDO + " = " + "'"+this.pseudo +"'"+
                " AND " + database.USER_COLUMN_LOGIN + " = " + "'"+this.Login+"'";

        Cursor cursor = db.rawQuery(query, null);

        while (cursor.moveToNext()) {
            this.id = cursor.getInt(0);
        }

        return this.id == 0;
    }

    public static User getAllUserData(Database database, String pseudoTxt, String loginTxt) {
        User user = null;
        try {
            SQLiteDatabase db = database.getWritableDatabase();
            String query = "SELECT * FROM " + database.USER_TABLE_NAME +
                    " WHERE " + database.USER_COLUMN_PSEUDO + " = " + "'"+pseudoTxt +"'"+
                    " AND " + database.USER_COLUMN_LOGIN + " = " + "'"+loginTxt+"'";

            Cursor cursor = db.rawQuery(query, null);

            while (cursor.moveToNext()) {
                user = new User(cursor.getInt(0), cursor.getString(1), cursor.getString(2));
            }

            if (user == null)
                return null;

            user.allergensTags = new ArrayList<>();
            db = database.getWritableDatabase();
            query = "SELECT * FROM " + database.ALLERGENE_TABLE_NAME +
                    " WHERE " + database.ALLERGENE_COLUMN_ID + " in ( SELECT "+ database.ALLERGEN_USER_COLUMN_ALLERGEN_TAG_ID +" FROM "+
                     database.ALLERGEN_USER_TABLE_NAME + " WHERE " +  database.ALLERGEN_USER_COLUMN_USER_ID + " = " + user.getId()  + ")";

            cursor = db.rawQuery(query, null);

            while (cursor.moveToNext()) {
                user.allergensTags.add(new AllergensTags(cursor.getInt(0), cursor.getString(1)));
            }

            return user;

        } catch (Exception ex) {
            String error = "";
            return null;
        }
    }

}
