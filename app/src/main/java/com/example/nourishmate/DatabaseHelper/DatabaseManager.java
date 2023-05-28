package com.example.nourishmate.DatabaseHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.nourishmate.Models.Images;
import com.example.nourishmate.Models.Ingredient;
import com.example.nourishmate.Models.LanguagesCodes;
import com.example.nourishmate.Models.NutrientLevels;
import com.example.nourishmate.Models.Nutriment;
import com.example.nourishmate.Models.Nutriments;
import com.example.nourishmate.Models.Product;
import com.example.nourishmate.Models.SelectedImage;
import com.example.nourishmate.Models.SelectedImageItem;
import com.example.nourishmate.Models.SelectedImageItemLink;
import com.example.nourishmate.Models.SelectedImages;
import com.example.nourishmate.Models.Source;
import com.example.nourishmate.Models.User;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DatabaseManager extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "NourishMateProduct.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try{
            TableUtils.createTable(connectionSource, Images.class);
            TableUtils.createTable(connectionSource, Ingredient.class);
            TableUtils.createTable(connectionSource, LanguagesCodes.class);
            TableUtils.createTable(connectionSource, NutrientLevels.class);
            TableUtils.createTable(connectionSource, Nutriment.class);
            TableUtils.createTable(connectionSource, Nutriments.class);
            TableUtils.createTable(connectionSource, Product.class);
            TableUtils.createTable(connectionSource, SelectedImage.class);
            TableUtils.createTable(connectionSource, SelectedImageItem.class);
            TableUtils.createTable(connectionSource, SelectedImageItemLink.class);
            TableUtils.createTable(connectionSource, SelectedImages.class);
            TableUtils.createTable(connectionSource, Source.class);
            TableUtils.createTable(connectionSource, User.class);
        }catch (Exception exception){
            String x = "";
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {



    }


}
