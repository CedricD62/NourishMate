package com.example.nourishmate.Models;

import org.json.JSONException;
import org.json.JSONObject;

public class Nutriments {

    private int id;
    private int energyKcal100G;
    private String energyKcalUnit;
    private float novaGroup;
    private float proteins100G;
    private String proteinsUnit;
    private float salt100G;
    private String saltUnit;
    private float saturatedFat100G;
    private String saturatedFatUnit;
    private float sugars100G;
    private String sugarsUnit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnergyKcal100G() {
        return energyKcal100G;
    }

    public void setEnergyKcal100G(int energyKcal100G) {
        this.energyKcal100G = energyKcal100G;
    }

    public String getEnergyKcalUnit() {
        return energyKcalUnit;
    }

    public void setEnergyKcalUnit(String energyKcalUnit) {
        this.energyKcalUnit = energyKcalUnit;
    }

    public float getNovaGroup() {
        return novaGroup;
    }

    public void setNovaGroup(float novaGroup) {
        this.novaGroup = novaGroup;
    }

    public float getProteins100G() {
        return proteins100G;
    }

    public void setProteins100G(float proteins100G) {
        this.proteins100G = proteins100G;
    }

    public String getProteinsUnit() {
        return proteinsUnit;
    }

    public void setProteinsUnit(String proteinsUnit) {
        this.proteinsUnit = proteinsUnit;
    }

    public float getSalt100G() {
        return salt100G;
    }

    public void setSalt100G(float salt100G) {
        this.salt100G = salt100G;
    }

    public String getSaltUnit() {
        return saltUnit;
    }

    public void setSaltUnit(String saltUnit) {
        this.saltUnit = saltUnit;
    }

    public float getSaturatedFat100G() {
        return saturatedFat100G;
    }

    public void setSaturatedFat100G(float saturatedFat100G) {
        this.saturatedFat100G = saturatedFat100G;
    }

    public String getSaturatedFatUnit() {
        return saturatedFatUnit;
    }

    public void setSaturatedFatUnit(String saturatedFatUnit) {
        this.saturatedFatUnit = saturatedFatUnit;
    }

    public float getSugars100G() {
        return sugars100G;
    }

    public void setSugars100G(float sugars100G) {
        this.sugars100G = sugars100G;
    }

    public String getSugarsUnit() {
        return sugarsUnit;
    }

    public void setSugarsUnit(String sugarsUnit) {
        this.sugarsUnit = sugarsUnit;
    }

    public static Nutriments populateNutriments(JSONObject nutriments) {
        Nutriments nutriments1 = new Nutriments();

        try {
            if (nutriments.has("energy-kcal_100g"))
                nutriments1.energyKcal100G = nutriments.getInt("energy-kcal_100g");
            if (nutriments.has("energy-kcal_unit"))
                nutriments1.energyKcalUnit = nutriments.getString("energy-kcal_unit");
            if (nutriments.has("nova-group"))
                nutriments1.novaGroup = Float.parseFloat(nutriments.getString("nova-group"));
            if (nutriments.has("proteins_100g"))
                nutriments1.proteins100G = Float.parseFloat(nutriments.getString("proteins_100g"));
            if (nutriments.has("proteins_unit"))
                nutriments1.proteinsUnit = nutriments.getString("proteins_unit");
            if (nutriments.has("salt_100g"))
                nutriments1.salt100G = Float.parseFloat(nutriments.getString("salt_100g"));
            if (nutriments.has("salt_unit"))
                nutriments1.saltUnit = nutriments.getString("salt_unit");
            if (nutriments.has("saturated-fat_100g"))
                nutriments1.saturatedFat100G = Float.parseFloat(nutriments.getString("saturated-fat_100g"));
            if (nutriments.has("saturated-fat_unit"))
                nutriments1.saturatedFatUnit = nutriments.getString("saturated-fat_unit");
            if (nutriments.has("sugars_100g"))
                nutriments1.sugars100G = Float.parseFloat(nutriments.getString("sugars_100g"));
            if (nutriments.has("sugars_unit"))
                nutriments1.sugarsUnit = nutriments.getString("sugars_unit");

        } catch (JSONException exception) {
            String error = "";
        }

        return nutriments1;
    }
}
