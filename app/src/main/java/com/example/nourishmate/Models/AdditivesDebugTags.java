package com.example.nourishmate.Models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Collection;

@DatabaseTable
public class AdditivesDebugTags {

    public AdditivesDebugTags(String label, Product product) {
        this.label = label;
        this.product = product;
    }

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String label;
    @DatabaseField(foreign = true, canBeNull = false,foreignAutoCreate = true, foreignColumnName = "primayKey")
    private Product product;

    public static Collection<AdditivesDebugTags> pupolateCollection(JSONArray additives_debug_tags, Product product) {
        Collection<AdditivesDebugTags> values = new ArrayList<>();
        for (int i = 0; i < additives_debug_tags.length(); i++) {
            try {
                values.add(new AdditivesDebugTags(additives_debug_tags.get(i).toString(), product));
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
