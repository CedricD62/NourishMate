package com.example.nourishmate.Models;

import com.j256.ormlite.field.DatabaseField;

public class PnnsGroups2Tags {    @DatabaseField(generatedId = true)
private int id;
    @DatabaseField
    private String label;
    @DatabaseField(foreign = true, canBeNull = false,foreignAutoCreate = true, foreignColumnName = "primayKey")
    private Product product;

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

    public PnnsGroups2Tags(String label, Product product) {
        this.label = label;
        this.product = product;
    }
}
