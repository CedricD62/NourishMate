package com.example.nourishmate.Models;

import org.json.JSONArray;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.Collection;

public class IngredientsTags {
private int id;
    private String label;

    public static Collection<IngredientsTags> pupolateCollection(JSONArray ingredients_tags) {
        Collection<IngredientsTags> values = new ArrayList<>();
        for (int i = 0; i < ingredients_tags.length(); i++) {
            try {
                values.add(new IngredientsTags(ingredients_tags.get(i).toString()));
            } catch (JSONException exception) {

            }
        }
        return values;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public IngredientsTags(String label) {
        this.label = label;
    }
}
