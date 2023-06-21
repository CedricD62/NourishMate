package com.example.nourishmate.Models;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.nourishmate.DatabaseHelper.Database;

import org.json.JSONArray;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.Collection;

public class AllergensTags {
    public AllergensTags(String label) {
        this.label = label;
    }

    public AllergensTags(int id, String label) {
        this.id = id;
        this.label = label;
    }

    private int id;
    private String label;

    public static Collection<AllergensTags> pupolateCollection(JSONArray allergens_tags) {
        Collection<AllergensTags> values = new ArrayList<>();
        for (int i = 0; i < allergens_tags.length(); i++) {
            try {
                values.add(new AllergensTags(allergens_tags.get(i).toString()));
            } catch (JSONException exception) {

            }
        }
        return values;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean create(Database dataBase){
        try{
            SQLiteDatabase db = dataBase.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(dataBase.ALLERGENE_COLUMN_LABEL, this.label);

            return db.insert(dataBase.ALLERGENE_TABLE_NAME, null, contentValues) != -1 ;
        }catch (Exception ex ){
            String value = "";
            return false;
        }

    }

    public static ArrayList<AllergensTags> GetAllByUserId(Database dataBase, User user){

        if(user == null)
            return null;

        ArrayList<AllergensTags> allergensTagsList = new ArrayList<AllergensTags>();
        SQLiteDatabase db = dataBase.getWritableDatabase();

        String query = "SELECT * FROM "+ dataBase.ALLERGENE_TABLE_NAME +
                       " INNER JOIN " + dataBase.ALLERGEN_USER_TABLE_NAME + " ON " + dataBase.USER_COLUMN_ID + " = " + dataBase.ALLERGEN_USER_COLUMN_USER_ID +
                       " WHERE "+ dataBase.ALLERGEN_USER_COLUMN_USER_ID + " = " + user.getId();
        Cursor cursor = db.rawQuery(query,null);

        while (cursor.moveToNext()){
            allergensTagsList.add(new AllergensTags(cursor.getInt(0), cursor.getString(1)));
        }

        return allergensTagsList;
    }

    public static ArrayList<AllergensTags> GetAll(Database dataBase){

        ArrayList<AllergensTags> allergensTagsList = new ArrayList<AllergensTags>();
        SQLiteDatabase db = dataBase.getWritableDatabase();

        String query = "SELECT * FROM "+ dataBase.ALLERGENE_TABLE_NAME;
        Cursor cursor = db.rawQuery(query,null);

        while (cursor.moveToNext()){
            allergensTagsList.add(new AllergensTags(cursor.getInt(0), cursor.getString(1)));
        }

        return allergensTagsList;
    }
}
