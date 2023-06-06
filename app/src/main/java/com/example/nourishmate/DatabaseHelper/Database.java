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

    public static final String ADDITIVE_TABLE_NAME = "ADDITIVE_LIST";
    public static final String ADDITIVE_COLUMN_ID = "ID";
    public static final String ADDITIVE_COLUMN_LABEL = "LABEL";
    public static final String CREATE_ADDITIVE_TABLE_QUERY = "CREATE TABLE " + ADDITIVE_TABLE_NAME + " (" +
            ADDITIVE_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            ADDITIVE_COLUMN_LABEL + " TEXT)";

    public static final String ALLERGENE_TABLE_NAME = "ALLERGEN_LIST";
    public static final String ALLERGENE_COLUMN_ID = "ID";
    public static final String ALLERGENE_COLUMN_LABEL = "LABEL";
    public static final String CREATE_ALLERGENE_TABLE_QUERY = "CREATE TABLE " + ALLERGENE_TABLE_NAME + " (" +
            ALLERGENE_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            ALLERGENE_COLUMN_LABEL + " TEXT)";

    public static final String CATEGORIE_TABLE_NAME = "CATEGORIE_LIST";
    public static final String CATEGORIE_COLUMN_ID = "ID";
    public static final String CATEGORIE_COLUMN_LABEL = "LABEL";
    public static final String CREATE_CATEGORIE_TABLE_QUERY = "CREATE TABLE " + CATEGORIE_TABLE_NAME + " (" +
            CATEGORIE_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            CATEGORIE_COLUMN_LABEL + " TEXT)";

    public static final String COUNTRY_TABLE_NAME = "COUNTRY_LIST";
    public static final String COUNTRY_COLUMN_ID = "ID";
    public static final String COUNTRY_COLUMN_LABEL = "LABEL";
    public static final String CREATE_COUNTRY_TABLE_QUERY = "CREATE TABLE " + COUNTRY_TABLE_NAME + " (" +
            COUNTRY_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COUNTRY_COLUMN_LABEL + " TEXT)";

    public static final String INGREDIENT_TABLE_NAME = "INGREDIENT";
    public static final String INGREDIENT_COLUMN_ID = "ID";
    public static final String INGREDIENT_COLUMN_FROM_PALM_OIL = "FROM_PALM_OIL";
    public static final String INGREDIENT_COLUMN_ORIGIN = "ORIGIN";
    public static final String INGREDIENT_COLUMN_PERCENT = "PRECENT";
    public static final String INGREDIENT_COLUMN_RANK = "RANK";
    public static final String INGREDIENT_COLUMN_TEXT = "TEXT";
    public static final String INGREDIENT_COLUMN_VEGAN = "VEGAN";
    public static final String INGREDIENT_COLUMN_VEGETARIAN = "VEGETARIAN";
    public static final String CREATE_INGREDIENT_TABLE_QUERY = "CREATE TABLE " + INGREDIENT_TABLE_NAME + " (" +
            INGREDIENT_COLUMN_ID + " TEXT PRIMARY KEY, " +
            INGREDIENT_COLUMN_FROM_PALM_OIL + " TEXT, " +
            INGREDIENT_COLUMN_ORIGIN + " TEXT, " +
            INGREDIENT_COLUMN_PERCENT + " TEXT, " +
            INGREDIENT_COLUMN_RANK + " INTEGER, " +
            INGREDIENT_COLUMN_TEXT + " TEXT, " +
            INGREDIENT_COLUMN_VEGAN + " TEXT, " +
            INGREDIENT_COLUMN_VEGETARIAN + " TEXT)";

    public static final String INGREDIENT_LIST_TABLE_NAME = "INGREDIENT_LIST";
    public static final String INGREDIENT_LIST_COLUMN_ID = "ID";
    public static final String INGREDIENT_LIST_COLUMN_LABEL = "LABEL";
    public static final String CREATE_INGREDIENT_LIST_TABLE_QUERY = "CREATE TABLE " + INGREDIENT_LIST_TABLE_NAME + " (" +
            INGREDIENT_LIST_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            INGREDIENT_LIST_COLUMN_LABEL + " TEXT)";


    private static final String NUTRIMENTS_TABLE_NAME = "NUTRIMENTS";
    private static final String NUTRIMENTS_COLUMN_ID = "ID";
    private static final String NUTRIMENTS_COLUMN_ENERGY_KCAL_100G = "ENERGY_KCAL_100G";
    private static final String NUTRIMENTS_COLUMN_ENERGY_KCAL_UNIT = "ENERGY_KCAL_UNIT";
    private static final String NUTRIMENTS_COLUMN_NOVA_GROUP = "NOVA_GROUP";
    private static final String NUTRIMENTS_COLUMN_PROTEINS_100G = "PROTEINS_100G";
    private static final String NUTRIMENTS_COLUMN_PROTEINS_UNIT = "PROTEINS_UNIT";
    private static final String NUTRIMENTS_COLUMN_SALT_100G = "SALT_100G";
    private static final String NUTRIMENTS_COLUMN_SALT_UNIT = "SALT_UNIT";
    private static final String NUTRIMENTS_COLUMN_SATURATED_FAT_100G = "SATURATED_FAT_100G";
    private static final String NUTRIMENTS_COLUMN_SATURATED_FAT_UNIT = "SATURATED_FAT_UNIT";
    private static final String NUTRIMENTS_COLUMN_SUGARS_100G = "SUGARS_100G";
    private static final String NUTRIMENTS_COLUMN_SUGARS_UNIT = "SUGARS_UNIT";

    private static final String CREATE_NUTRIMENT_TABLE_QUERY = "CREATE TABLE " + NUTRIMENTS_TABLE_NAME + "("
            + NUTRIMENTS_COLUMN_ID + " INTEGER PRIMARY KEY,"
            + NUTRIMENTS_COLUMN_ENERGY_KCAL_100G + " INTEGER,"
            + NUTRIMENTS_COLUMN_ENERGY_KCAL_UNIT + " TEXT,"
            + NUTRIMENTS_COLUMN_NOVA_GROUP + " REAL,"
            + NUTRIMENTS_COLUMN_PROTEINS_100G + " REAL,"
            + NUTRIMENTS_COLUMN_PROTEINS_UNIT + " TEXT,"
            + NUTRIMENTS_COLUMN_SALT_100G + " REAL,"
            + NUTRIMENTS_COLUMN_SALT_UNIT + " TEXT,"
            + NUTRIMENTS_COLUMN_SATURATED_FAT_100G + " REAL,"
            + NUTRIMENTS_COLUMN_SATURATED_FAT_UNIT + " TEXT,"
            + NUTRIMENTS_COLUMN_SUGARS_100G + " REAL,"
            + NUTRIMENTS_COLUMN_SUGARS_UNIT + " TEXT"
            + ")";




    public Database(Context context){
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_ADDITIVE_TABLE_QUERY);
        db.execSQL(CREATE_ALLERGENE_TABLE_QUERY);
        db.execSQL(CREATE_CATEGORIE_TABLE_QUERY);
        db.execSQL(CREATE_COUNTRY_TABLE_QUERY);
        db.execSQL(CREATE_INGREDIENT_TABLE_QUERY);
        db.execSQL(CREATE_INGREDIENT_LIST_TABLE_QUERY);
        db.execSQL(CREATE_NUTRIMENT_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
