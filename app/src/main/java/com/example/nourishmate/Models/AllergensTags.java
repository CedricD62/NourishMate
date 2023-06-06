package com.example.nourishmate.Models;

import org.json.JSONArray;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.Collection;

public class AllergensTags {
    public AllergensTags(String label) {
        this.label = label;
    }

    private int id;
    private String label;

    public static Collection<AllergensTags> pupolateCollection(JSONArray allergens_tags) {
        Collection<AllergensTags> values = new ArrayList<>();
        for (int i = 0; i < allergens_tags.length(); i++) {
            try {
                values.add(new AllergensTags(allergens_tags.get(i).toString()));
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
