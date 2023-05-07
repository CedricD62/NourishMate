package com.example.nourishmate.DatabaseHelper.Tables;

public class ContactTable extends Table {
    public ContactTable() {
        tableName = "Contact";
        idColumnName = "ID";
        userFirstNameColumnName = "PRENOM";
        userNameColumnName = "NOM";
        userEmailColumnName= "EMAIL";
        userCreationDateColumnName = "DATE_CREATION";
        userUpdateDateColumnName = "DATE_MODIFICATION";
        createTable = "CREATE TABLE"+tableName+"("+
                                                    idColumnName + " integer primary key autoincrement," +
                                                    userNameColumnName + " text not null," +
                                                    userFirstNameColumnName + " text not null," +
                                                    userEmailColumnName + " text,"+
                                                    userCreationDateColumnName +" DATETIME DEFAULT CURRENT_TIMESTAMP,"+
                                                    userUpdateDateColumnName + " DATETIME"+");";
    }

    private String userNameColumnName, userFirstNameColumnName, userEmailColumnName, userCreationDateColumnName,userUpdateDateColumnName;

    public String getUserNameColumnName() {
        return userNameColumnName;
    }

    public String getUserFirstNameColumnName() {
        return userFirstNameColumnName;
    }

    public String getUserEmailColumnName() {
        return userEmailColumnName;
    }

    public String getCreateTable() {
        return createTable;
    }
}
