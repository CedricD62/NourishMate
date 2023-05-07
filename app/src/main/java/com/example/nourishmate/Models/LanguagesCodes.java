package com.example.nourishmate.Models;

import org.json.JSONObject;

public class LanguagesCodes {

    private String en;
    private String fr;
    private String pl;

    public String getEn() {
        return en;
    }

    public String getFr() {
        return fr;
    }

    public String getPl() {
        return pl;
    }

    public static LanguagesCodes populateLanguagesCodes(JSONObject languages_codes) {
        String error = "";
        return new LanguagesCodes();
    }
}
