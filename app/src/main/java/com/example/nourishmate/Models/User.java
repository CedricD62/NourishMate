package com.example.nourishmate.Models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class User {
    public User(String pseudo, String login, String email) {
        this.pseudo = pseudo;
        Login = login;
        this.email = email;
    }

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String pseudo;
    @DatabaseField
    private String Login;
    @DatabaseField
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
