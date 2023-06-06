package com.example.nourishmate.Models;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
public class LanguagesCodes {

    private int id;
    private String en;
    private String fr;
    private String pl;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
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

        Iterator<String> keys = languages_codes.keys();
        LanguagesCodes languagesCodes = new LanguagesCodes();
        while(keys.hasNext()){
            String key = keys.next();
            try{
                switch (key){
                    case "fr":
                        languagesCodes.fr =  languages_codes.get(key).toString();
                        break;
                    case "en":
                        languagesCodes.en =  languages_codes.get(key).toString();
                        break;
                    case "pl":
                        languagesCodes.pl =  languages_codes.get(key).toString();
                        break;
                    default:
                        break;
                }
            }catch (JSONException exception){
                String error = "";
            }
        }
        return languagesCodes;
    }
}
