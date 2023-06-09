package com.example.nourishmate.Models;


import org.json.JSONException;
import org.json.JSONObject;
public class NutrientLevels {
    private int id;
    private String fat;
    private String salt;
    private String saturatedFat;
    private String sugars;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getFat() {
        return fat;
    }

    public String getSalt() {
        return salt;
    }

    public String getSaturatedFat() {
        return saturatedFat;
    }

    public String getSugars() {
        return sugars;
    }

    public static NutrientLevels populateNutrientLevels(JSONObject nutrient_levels) {
        NutrientLevels src = new NutrientLevels();

        try {
            if (nutrient_levels.has("fat"))
                src.fat = nutrient_levels.getString("fat");
            if (nutrient_levels.has("salt"))
                src.salt = nutrient_levels.getString("salt");
            if (nutrient_levels.has("saturated-fat"))
                src.saturatedFat = nutrient_levels.getString("saturated-fat");
            if (nutrient_levels.has("sugars"))
                src.sugars = nutrient_levels.getString("sugars");
        } catch (JSONException exception) {
            String error = "";
        }

        return src;
    }
}
