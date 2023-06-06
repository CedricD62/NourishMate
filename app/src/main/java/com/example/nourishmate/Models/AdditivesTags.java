package com.example.nourishmate.Models;

import org.json.JSONArray;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.Collection;

public class AdditivesTags {
    public AdditivesTags(String label) {
        this.label = label;
    }

    private int id;

    private String label;

    public static Collection<AdditivesTags> pupolateCollection(JSONArray additives_tags) {
        Collection<AdditivesTags> values = new ArrayList<>();
        for (int i = 0; i < additives_tags.length(); i++) {
            try {
                values.add(new AdditivesTags(additives_tags.get(i).toString()));
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
