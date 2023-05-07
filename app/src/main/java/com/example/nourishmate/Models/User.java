package com.example.nourishmate.Models;

public class User {
    public User(String pseudo, String login, String email) {
        this.pseudo = pseudo;
        Login = login;
        this.email = email;
    }

    private String pseudo, Login, email;

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
