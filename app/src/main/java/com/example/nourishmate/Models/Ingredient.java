package com.example.nourishmate.Models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
@DatabaseTable
public class Ingredient {

    @DatabaseField(generatedId = true)
    private int primayKey;
    private String fromPalmOil;
    private String id;
    private String origin;
    private String percent;
    private int rank;
    private String text;
    private String vegan;
    private String vegetarian;
    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "primayKey")
    private Product product;

    public String getFromPalmOil() {
        return fromPalmOil;
    }

    public String getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getPercent() {
        return percent;
    }

    public int getRank() {
        return rank;
    }

    public String getText() {
        return text;
    }

    public String getVegan() {
        return vegan;
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public static ArrayList<Ingredient> populateIngredients(JSONArray ingredients) {

        ArrayList<Ingredient> s = new ArrayList<>();
        for (int i = 0; i < ingredients.length(); i++) {
            try {
                JSONObject obj = ingredients.getJSONObject(i);
                Ingredient src = new Ingredient();

                if (obj.has("from_palm_oil"))
                    src.fromPalmOil = obj.getString("from_palm_oil");
                if (obj.has("id"))
                    src.id = obj.getString("id");
                if (obj.has("origin"))
                    src.origin = obj.getString("origin");
                if (obj.has("percent"))
                    src.percent = obj.getString("percent");
                if (obj.has("rank"))
                    src.rank = obj.getInt("rank");
                if (obj.has("text"))
                    src.text = obj.getString("text");
                if (obj.has("vegan"))
                    src.vegan = obj.getString("vegan");
                if (obj.has("vegetarian"))
                    src.vegetarian = obj.getString("vegetarian");
                s.add(src);
            } catch (JSONException exception) {
                String error = "";
            }
        }
        return s;
    }
}
