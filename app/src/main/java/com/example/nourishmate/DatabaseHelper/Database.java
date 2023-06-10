package com.example.nourishmate.DatabaseHelper;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.ArrayList;

public class Database  extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "nourishMate.db";
    private static final int DATABASE_VERSION = 1;

    public static final String ALLERGENE_TABLE_NAME = "ALLERGEN_LIST";
    public static final String ALLERGENE_COLUMN_ID = "ID";
    public static final String ALLERGENE_COLUMN_LABEL = "LABEL";
    public static final String CREATE_ALLERGENE_TABLE_QUERY = "CREATE TABLE " + ALLERGENE_TABLE_NAME + " (" +
            ALLERGENE_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            ALLERGENE_COLUMN_LABEL + " TEXT UNIQUE)";

    public static final String USER_TABLE_NAME = "users";
    public static final String USER_COLUMN_ID = "id";
    public static final String USER_COLUMN_PSEUDO = "pseudo";
    public static final String USER_COLUMN_LOGIN = "login";

    // SQL statement to create the table
    public static final String CREATE_USER_TABLE_QUERY = "CREATE TABLE " + USER_TABLE_NAME + " (" +
            USER_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            USER_COLUMN_PSEUDO + " TEXT UNIQUE, " +
            USER_COLUMN_LOGIN + " TEXT)";

    public static final String ALLERGEN_USER_TABLE_NAME = "allergen_tags_user";
    public static final String ALLERGEN_USER_COLUMN_ID = "id";
    public static final String ALLERGEN_USER_COLUMN_USER_ID = "user_id";
    public static final String ALLERGEN_USER_COLUMN_ALLERGEN_TAG_ID = "allergen_tag_id";

    public static final String CREATE_ALLERGEN_USER_TABLE_QUERY = "CREATE TABLE " + ALLERGEN_USER_TABLE_NAME + " (" +
            ALLERGEN_USER_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            ALLERGEN_USER_COLUMN_USER_ID + " INTEGER, " +
            ALLERGEN_USER_COLUMN_ALLERGEN_TAG_ID + " INTEGER, " +
            "FOREIGN KEY (" + ALLERGEN_USER_COLUMN_USER_ID + ") REFERENCES " + USER_TABLE_NAME + "(" +USER_COLUMN_ID + "), " +
            "FOREIGN KEY (" + ALLERGEN_USER_COLUMN_ALLERGEN_TAG_ID + ") REFERENCES " + ALLERGENE_TABLE_NAME + "(" + ALLERGENE_COLUMN_ID + "), " +
            "UNIQUE(" + ALLERGEN_USER_COLUMN_USER_ID + ", " + ALLERGEN_USER_COLUMN_ALLERGEN_TAG_ID + "))";

    public Database(Context context){super(context, DATABASE_NAME,null, DATABASE_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_ALLERGENE_TABLE_QUERY);
        db.execSQL(CREATE_USER_TABLE_QUERY);
        db.execSQL(CREATE_ALLERGEN_USER_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion == newVersion)
            return;
        try{
            db.execSQL("DROP TABLE IF EXISTS " + ALLERGEN_USER_TABLE_NAME + ";");
            db.execSQL("DROP TABLE IF EXISTS " + USER_TABLE_NAME + ";");
            db.execSQL("DROP TABLE IF EXISTS " + ALLERGENE_TABLE_NAME + ";");
            onCreate(db);
        }catch (Exception ex){
            String error = "";
        }
    }
}
