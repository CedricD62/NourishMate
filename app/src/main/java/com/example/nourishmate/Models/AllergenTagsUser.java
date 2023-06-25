package com.example.nourishmate.Models;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.nourishmate.DatabaseHelper.Database;
import com.example.nourishmate.Login;

import java.util.ArrayList;

public class AllergenTagsUser {

    public AllergenTagsUser(int userId, int allergenTagId) {
        this.userId = userId;
        this.allergenTagId = allergenTagId;
    }

    private int id;
    private int userId;
    private int allergenTagId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAllergenTagId() {
        return allergenTagId;
    }

    public void setAllergenTagId(int allergenTagId) {
        this.allergenTagId = allergenTagId;
    }


    public boolean create(Database database){
        SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(database.ALLERGEN_USER_COLUMN_ALLERGEN_TAG_ID,this.allergenTagId);
        cv.put(database.ALLERGEN_USER_COLUMN_USER_ID,this.userId);

        return sqLiteDatabase.insert(database.ALLERGEN_USER_TABLE_NAME, null, cv) != -1;
    }

    public static boolean Delete(Database dataBase){
        SQLiteDatabase db = dataBase.getWritableDatabase();
        String query = "DELETE FROM " + dataBase.ALLERGEN_USER_TABLE_NAME +" WHERE " +
                dataBase.ALLERGEN_USER_COLUMN_USER_ID + " = " + Login.user.getId() ;
        try
        {
            db.execSQL(query);
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }
}
