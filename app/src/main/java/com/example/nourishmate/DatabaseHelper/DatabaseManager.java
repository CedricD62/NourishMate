package com.example.nourishmate.DatabaseHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.icu.text.LocaleDisplayNames;

import com.example.nourishmate.Models.*;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class DatabaseManager extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "NourishMateProduct.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try{
            TableUtils.createTable(connectionSource, AdditivesDebugTags.class);
            TableUtils.createTable(connectionSource, AdditivesOldTags.class);
            TableUtils.createTable(connectionSource, AdditivesOriginalTags.class);
            TableUtils.createTable(connectionSource, AdditivesPrevOriginalTags.class);
            TableUtils.createTable(connectionSource, AdditivesTags.class);
            TableUtils.createTable(connectionSource, AllergensHierarchy.class);
            TableUtils.createTable(connectionSource, AllergensTags.class);
            TableUtils.createTable(connectionSource, AminoAcidsPrevTags.class);
            TableUtils.createTable(connectionSource, AminoAcidsTags.class);
            TableUtils.createTable(connectionSource, BrandsDebugTags.class);
            TableUtils.createTable(connectionSource, BrandsTags.class);
            TableUtils.createTable(connectionSource, CategoriesHierarchy.class);
            TableUtils.createTable(connectionSource, CategoriesPropertiesTags.class);
            TableUtils.createTable(connectionSource, CategoriesTags.class);
            TableUtils.createTable(connectionSource, CheckersTags.class);
            TableUtils.createTable(connectionSource, CitiesTags.class);
            TableUtils.createTable(connectionSource, CodesTags.class);
            TableUtils.createTable(connectionSource, CorrectorsTags.class);
            TableUtils.createTable(connectionSource, CountriesDebugTags.class);
            TableUtils.createTable(connectionSource, CountriesHierarchy.class);
            TableUtils.createTable(connectionSource, CountriesTags.class);
            TableUtils.createTable(connectionSource, DataQualityBugsTags.class);
            TableUtils.createTable(connectionSource, DataQualityErrorsTags.class);
            TableUtils.createTable(connectionSource, DataQualityInfoTags.class);
            TableUtils.createTable(connectionSource, DataQualityTags.class);
            TableUtils.createTable(connectionSource, DataQualityWarningsTags.class);
            TableUtils.createTable(connectionSource, DataSourcesTags.class);
            TableUtils.createTable(connectionSource, DebugParamSortedLangs.class);
            TableUtils.createTable(connectionSource, EditorsTags.class);
            TableUtils.createTable(connectionSource, EmbCodesDebugTags.class);
            TableUtils.createTable(connectionSource, EmbCodesTags.class);
            TableUtils.createTable(connectionSource, EntryDatesTags.class);
            TableUtils.createTable(connectionSource, ExpirationDateDebugTags.class);
            TableUtils.createTable(connectionSource, InformersTags.class);
            TableUtils.createTable(connectionSource, IngredientsAnalysisTags.class);
            TableUtils.createTable(connectionSource, IngredientsDebug.class);
            TableUtils.createTable(connectionSource, IngredientsFromPalmOilTags.class);
            TableUtils.createTable(connectionSource, IngredientsHierarchy.class);
            TableUtils.createTable(connectionSource, IngredientsIdsDebug.class);
            TableUtils.createTable(connectionSource, IngredientsNTags.class);
            TableUtils.createTable(connectionSource, IngredientsOriginalTags.class);
            TableUtils.createTable(connectionSource, IngredientsTags.class);
            TableUtils.createTable(connectionSource, IngredientsThatMayBeFromPalmOilTags.class);
            TableUtils.createTable(connectionSource, Keywords.class);
            TableUtils.createTable(connectionSource, LabelsDebugTags.class);
            TableUtils.createTable(connectionSource, LabelsHierarchy.class);
            TableUtils.createTable(connectionSource, LabelsPrevHierarchy.class);
            TableUtils.createTable(connectionSource, LabelsTags.class);
            TableUtils.createTable(connectionSource, LabelsPrevTags.class);
            TableUtils.createTable(connectionSource, LangDebugTags.class);
            TableUtils.createTable(connectionSource, LanguagesHierarchy.class);
            TableUtils.createTable(connectionSource, LanguagesTags.class);
            TableUtils.createTable(connectionSource, LastEditDatesTags.class);
            TableUtils.createTable(connectionSource, LastImageDatesTags.class);
            TableUtils.createTable(connectionSource, LinkDebugTags.class);
            TableUtils.createTable(connectionSource, ManufacturingPlacesDebugTags.class);
            TableUtils.createTable(connectionSource, ManufacturingPlacesTags.class);
            TableUtils.createTable(connectionSource, MineralsTags.class);
            TableUtils.createTable(connectionSource, MineralsPrevTags.class);
            TableUtils.createTable(connectionSource, MiscTags.class);
            TableUtils.createTable(connectionSource, NovaGroupsTags.class);
            TableUtils.createTable(connectionSource, NovaGroupTags.class);
            TableUtils.createTable(connectionSource, NucleotidesTags.class);
            TableUtils.createTable(connectionSource, NucleotidesPrevTags.class);
            TableUtils.createTable(connectionSource, NutrientLevelsTags.class);
            TableUtils.createTable(connectionSource, NutritionDataPerDebugTags.class);
            TableUtils.createTable(connectionSource, NutritionGradesTags.class);
            TableUtils.createTable(connectionSource, OriginsDebugTags.class);
            TableUtils.createTable(connectionSource, OriginsTags.class);
            TableUtils.createTable(connectionSource, OtherNutritionalSubstancesTags.class);
            TableUtils.createTable(connectionSource, PackagingTags.class);
            TableUtils.createTable(connectionSource, PackagingDebugTags.class);
            TableUtils.createTable(connectionSource, PhotographersTags.class);
            TableUtils.createTable(connectionSource, PnnsGroups1Tags.class);
            TableUtils.createTable(connectionSource, PnnsGroups2Tags.class);
            TableUtils.createTable(connectionSource, PurchasePlacesTags.class);
            TableUtils.createTable(connectionSource, PurchasePlacesDebugTags.class);
            TableUtils.createTable(connectionSource, QualityTags.class);
            TableUtils.createTable(connectionSource, QuantityDebugTags.class);
            TableUtils.createTable(connectionSource, ServingSizeDebugTags.class);
            TableUtils.createTable(connectionSource, StatesHierarchy.class);
            TableUtils.createTable(connectionSource, StatesTags.class);
            TableUtils.createTable(connectionSource, StoresDebugTags.class);
            TableUtils.createTable(connectionSource, StoresTags.class);
            TableUtils.createTable(connectionSource, TracesDebugTags.class);
            TableUtils.createTable(connectionSource, TracesHierarchy.class);
            TableUtils.createTable(connectionSource, TracesTags.class);
            TableUtils.createTable(connectionSource, UnknownNutrientsTags.class);
            TableUtils.createTable(connectionSource, VitaminsTags.class);
            TableUtils.createTable(connectionSource, VitaminsPrevTags.class);
            TableUtils.createTable(connectionSource, LanguagesCodes.class);
            TableUtils.createTable(connectionSource, NutrientLevels.class);
            TableUtils.createTable(connectionSource, Nutriment.class);
            TableUtils.createTable(connectionSource, Nutriments.class);
            TableUtils.createTable(connectionSource, Product.class);
            TableUtils.createTable(connectionSource, User.class);
        }catch (Exception exception){
            String x = "";
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, AdditivesDebugTags.class,true);
            TableUtils.dropTable(connectionSource, AdditivesOldTags.class,true);
            TableUtils.dropTable(connectionSource, AdditivesOriginalTags.class,true);
            TableUtils.dropTable(connectionSource, AdditivesPrevOriginalTags.class,true);
            TableUtils.dropTable(connectionSource, AdditivesTags.class,true);
            TableUtils.dropTable(connectionSource, AllergensHierarchy.class,true);
            TableUtils.dropTable(connectionSource, AllergensTags.class,true);
            TableUtils.dropTable(connectionSource, AminoAcidsPrevTags.class,true);
            TableUtils.dropTable(connectionSource, AminoAcidsTags.class,true);
            TableUtils.dropTable(connectionSource, BrandsDebugTags.class,true);
            TableUtils.dropTable(connectionSource, BrandsTags.class,true);
            TableUtils.dropTable(connectionSource, CategoriesHierarchy.class,true);
            TableUtils.dropTable(connectionSource, CategoriesPropertiesTags.class,true);
            TableUtils.dropTable(connectionSource, CategoriesTags.class,true);
            TableUtils.dropTable(connectionSource, CheckersTags.class,true);
            TableUtils.dropTable(connectionSource, CitiesTags.class,true);
            TableUtils.dropTable(connectionSource, CodesTags.class,true);
            TableUtils.dropTable(connectionSource, CorrectorsTags.class,true);
            TableUtils.dropTable(connectionSource, CountriesDebugTags.class,true);
            TableUtils.dropTable(connectionSource, CountriesHierarchy.class,true);
            TableUtils.dropTable(connectionSource, CountriesTags.class,true);
            TableUtils.dropTable(connectionSource, DataQualityBugsTags.class,true);
            TableUtils.dropTable(connectionSource, DataQualityErrorsTags.class,true);
            TableUtils.dropTable(connectionSource, DataQualityInfoTags.class,true);
            TableUtils.dropTable(connectionSource, DataQualityTags.class,true);
            TableUtils.dropTable(connectionSource, DataQualityWarningsTags.class,true);
            TableUtils.dropTable(connectionSource, DataSourcesTags.class,true);
            TableUtils.dropTable(connectionSource, DebugParamSortedLangs.class,true);
            TableUtils.dropTable(connectionSource, EditorsTags.class,true);
            TableUtils.dropTable(connectionSource, EmbCodesDebugTags.class,true);
            TableUtils.dropTable(connectionSource, EmbCodesTags.class,true);
            TableUtils.dropTable(connectionSource, EntryDatesTags.class,true);
            TableUtils.dropTable(connectionSource, ExpirationDateDebugTags.class,true);
            TableUtils.dropTable(connectionSource, InformersTags.class,true);
            TableUtils.dropTable(connectionSource, IngredientsAnalysisTags.class,true);
            TableUtils.dropTable(connectionSource, IngredientsDebug.class,true);
            TableUtils.dropTable(connectionSource, IngredientsFromPalmOilTags.class,true);
            TableUtils.dropTable(connectionSource, IngredientsHierarchy.class,true);
            TableUtils.dropTable(connectionSource, IngredientsIdsDebug.class,true);
            TableUtils.dropTable(connectionSource, IngredientsNTags.class,true);
            TableUtils.dropTable(connectionSource, IngredientsOriginalTags.class,true);
            TableUtils.dropTable(connectionSource, IngredientsTags.class,true);
            TableUtils.dropTable(connectionSource, IngredientsThatMayBeFromPalmOilTags.class,true);
            TableUtils.dropTable(connectionSource, Keywords.class,true);
            TableUtils.dropTable(connectionSource, LabelsDebugTags.class,true);
            TableUtils.dropTable(connectionSource, LabelsHierarchy.class,true);
            TableUtils.dropTable(connectionSource, LabelsPrevHierarchy.class,true);
            TableUtils.dropTable(connectionSource, LabelsTags.class,true);
            TableUtils.dropTable(connectionSource, LabelsPrevTags.class,true);
            TableUtils.dropTable(connectionSource, LangDebugTags.class,true);
            TableUtils.dropTable(connectionSource, LanguagesHierarchy.class,true);
            TableUtils.dropTable(connectionSource, LanguagesTags.class,true);
            TableUtils.dropTable(connectionSource, LastEditDatesTags.class,true);
            TableUtils.dropTable(connectionSource, LastImageDatesTags.class,true);
            TableUtils.dropTable(connectionSource, LinkDebugTags.class,true);
            TableUtils.dropTable(connectionSource, ManufacturingPlacesDebugTags.class,true);
            TableUtils.dropTable(connectionSource, ManufacturingPlacesTags.class,true);
            TableUtils.dropTable(connectionSource, MineralsTags.class,true);
            TableUtils.dropTable(connectionSource, MineralsPrevTags.class,true);
            TableUtils.dropTable(connectionSource, MiscTags.class,true);
            TableUtils.dropTable(connectionSource, NovaGroupsTags.class,true);
            TableUtils.dropTable(connectionSource, NovaGroupTags.class,true);
            TableUtils.dropTable(connectionSource, NucleotidesTags.class,true);
            TableUtils.dropTable(connectionSource, NucleotidesPrevTags.class,true);
            TableUtils.dropTable(connectionSource, NutrientLevelsTags.class,true);
            TableUtils.dropTable(connectionSource, NutritionDataPerDebugTags.class,true);
            TableUtils.dropTable(connectionSource, NutritionGradesTags.class,true);
            TableUtils.dropTable(connectionSource, OriginsDebugTags.class,true);
            TableUtils.dropTable(connectionSource, OriginsTags.class,true);
            TableUtils.dropTable(connectionSource, OtherNutritionalSubstancesTags.class,true);
            TableUtils.dropTable(connectionSource, PackagingTags.class,true);
            TableUtils.dropTable(connectionSource, PackagingDebugTags.class,true);
            TableUtils.dropTable(connectionSource, PhotographersTags.class,true);
            TableUtils.dropTable(connectionSource, PnnsGroups1Tags.class,true);
            TableUtils.dropTable(connectionSource, PnnsGroups2Tags.class,true);
            TableUtils.dropTable(connectionSource, PurchasePlacesTags.class,true);
            TableUtils.dropTable(connectionSource, PurchasePlacesDebugTags.class,true);
            TableUtils.dropTable(connectionSource, QualityTags.class,true);
            TableUtils.dropTable(connectionSource, QuantityDebugTags.class,true);
            TableUtils.dropTable(connectionSource, ServingSizeDebugTags.class,true);
            TableUtils.dropTable(connectionSource, StatesHierarchy.class,true);
            TableUtils.dropTable(connectionSource, StatesTags.class,true);
            TableUtils.dropTable(connectionSource, StoresDebugTags.class,true);
            TableUtils.dropTable(connectionSource, StoresTags.class,true);
            TableUtils.dropTable(connectionSource, TracesDebugTags.class,true);
            TableUtils.dropTable(connectionSource, TracesHierarchy.class,true);
            TableUtils.dropTable(connectionSource, TracesTags.class,true);
            TableUtils.dropTable(connectionSource, UnknownNutrientsTags.class,true);
            TableUtils.dropTable(connectionSource, VitaminsTags.class,true);
            TableUtils.dropTable(connectionSource, VitaminsPrevTags.class,true);
            TableUtils.dropTable(connectionSource, LanguagesCodes.class,true);
            TableUtils.dropTable(connectionSource, NutrientLevels.class,true);
            TableUtils.dropTable(connectionSource, Nutriment.class,true);
            TableUtils.dropTable(connectionSource, Nutriments.class,true);
            TableUtils.dropTable(connectionSource, Product.class,true);
            TableUtils.dropTable(connectionSource, User.class,true);
            onCreate(database,connectionSource);
        } catch (SQLException e) {
            String x = "";
        }

    }


}
