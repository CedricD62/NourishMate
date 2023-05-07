package com.example.nourishmate.DatabaseHelper.Tables;

public class ProductTable extends Table
{
    private String productImageColumnName;
    private String productEcoScoreNoteColumnName;
    private String productEcoScoreGradeColumnName;
    private String productNutriScoreNoteColumnName;
    private String productNutriScoreGradeColumnName;
    private String productAdditiveColumnName;
    private String productBrandColumnName;
    private String productColumnName;
    private String updateDateColumnName;
    private String creationDateColumnName;

    public ProductTable() {
        tableName = "HISTORIQUE";
        idColumnName = "ID";
        creationDateColumnName = "DATE_CREATION";
        updateDateColumnName = "DATE_MODIFICATION";
        productColumnName = "LIBELLE_PRODUIT";
        productBrandColumnName = "ID_MARQUE";
        productAdditiveColumnName = "NB_ADDITIF";
        productNutriScoreGradeColumnName = "GRADE_NUTRISCORE";
        productNutriScoreNoteColumnName = "NOTE_NUTRISCORE";
        productEcoScoreGradeColumnName = "GRADE_ECOSCORE";
        productEcoScoreNoteColumnName = "NOTE_ECOSCORE";
        productImageColumnName = "LIEN_IMAGE";
        createTable = "CREATE TABLE"+tableName+"("+ idColumnName + " integer primary key autoincrement," +
                                                    productColumnName + " text not null,"+
                                                    productAdditiveColumnName + " INTEGER NOT NULL DEFAULT 0,"+
                                                    productNutriScoreGradeColumnName + "TEXT,"+
                                                    productNutriScoreNoteColumnName + "INTEGER NOT NULL DEFAULT 0,"+
                                                    productEcoScoreGradeColumnName + "TEXT" +
                                                    productEcoScoreNoteColumnName + "INTEGER NOT NULL DEFAULT 0,"+
                                                    productImageColumnName + "TEXT,"+
                                                    creationDateColumnName + "DATETIME"+
                                                    productBrandColumnName + " INTEGER NOT NULL"+");";


    }
}
