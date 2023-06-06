package com.example.nourishmate.Models;

import org.json.JSONArray;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.Collection;

public class CategoriesTags {
    public CategoriesTags(String label) {
        this.label = label;
    }
    private int id;
    private String label;

    public static Collection<CategoriesTags> pupolateCollection(JSONArray categories_tags) {
        Collection<CategoriesTags> values = new ArrayList<>();
        for (int i = 0; i < categories_tags.length(); i++) {
            try {
                values.add(new CategoriesTags(categories_tags.get(i).toString()));
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
}
