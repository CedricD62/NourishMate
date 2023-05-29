package com.example.nourishmate.Models;

import com.j256.ormlite.field.DatabaseField;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Collection;

public class CountriesTags {
    public CountriesTags(String label, Product product) {
        this.label = label;
        this.product = product;
    }

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String label;
    @DatabaseField(foreign = true, canBeNull = false,foreignAutoCreate = true, foreignColumnName = "primayKey")
    private Product product;

    public static Collection<CountriesTags> pupolateCollection(JSONArray countries_tags, Product product) {
        Collection<CountriesTags> values = new ArrayList<>();
        for (int i = 0; i < countries_tags.length(); i++) {
            try {
                values.add(new CountriesTags(countries_tags.get(i).toString(), product));
            } catch (JSONException exception) {

            }
        }
        return values;
    }

    public Product getProduct() {return product;}

    public void setProduct(Product product) {this.product = product;}

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
