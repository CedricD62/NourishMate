package com.example.nourishmate.Models;

import java.util.ArrayList;

public class User {
    public User(String pseudo, String login) {
        this.pseudo = pseudo;
        Login = login;
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
}
