package com.example.nourishmate.Models;

public class Nutriment {
    private int id;
    private String nutrimentName;
    private float purcentage;
    private String unit;

    public String getNutrimentName() {
        return nutrimentName;
    }

    public void setNutrimentName(String nutrimentName) {
        this.nutrimentName = nutrimentName;
    }

    public float getPurcentage() {
        return purcentage;
    }

    public void setPurcentage(float purcentage) {
        this.purcentage = purcentage;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
