package com.example.nourishmate.Models;

import com.j256.ormlite.table.DatabaseTable;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
@DatabaseTable
public class Nutriments {

    private float calcium;
    private float calciumValue;
    private float calcium100G;
    private float calciumServing;
    private String calciumUnit;
    private float carbohydrates;
    private float carbohydratesValue;
    private float carbohydrates100G;
    private float carbohydratesServing;
    private String carbohydratesUnit;
    private float carbonFootprintFromKnownIngredientsProduct;
    private float carbonFootprintFromKnownIngredients100G;
    private float carbonFootprintFromKnownIngredientsServing;
    private float cholesterol;
    private float cholesterolValue;
    private float cholesterol100G;
    private float cholesterolServing;
    private String cholesterolUnit;
    private int energy;
    private int energyKcal;
    private int energyKj;
    private int energyValue;
    private int energyKcalValue;
    private int energyKjValue;
    private int energy100G;
    private int energyKcal100G;
    private int energyKj100G;
    private int energyServing;
    private int energyKcalServing;
    private int energyKjServing;
    private String energyUnit;
    private String energyKcalUnit;
    private String energyKjUnit;
    private float fat;
    private float fatValue;
    private float fat100G;
    private float fatServing;
    private String fatUnit;
    private float fiber;
    private float fiberValue;
    private float fiber100G;
    private float fiberServing;
    private String fiberUnit;
    private float fruitsVegetablesNutsEstimateFromIngredients100G;
    private float iron;
    private float ironValue;
    private float iron100G;
    private float ironServing;
    private String ironUnit;
    private float novaGroup;
    private float novaGroup100G;
    private float novaGroupServing;
    private float proteins;
    private float proteinsValue;
    private float proteins100G;
    private float proteinsServing;
    private String proteinsUnit;
    private float salt;
    private float saltValue;
    private float salt100G;
    private float saltServing;
    private String saltUnit;
    private float saturatedFat;
    private float saturatedFatValue;
    private float saturatedFat100G;
    private float saturatedFatServing;
    private String saturatedFatUnit;
    private float sodium;
    private float sodiumValue;
    private float sodium100G;
    private float sodiumServing;
    private String sodiumUnit;
    private float sugars;
    private float sugarsValue;
    private float sugars100G;
    private float sugarsServing;
    private String sugarsUnit;
    private float transFat;
    private float transFatValue;
    private float transFat100G;
    private float transFatServing;
    private String transFatUnit;
    private float vitaminA;
    private float vitaminAValue;
    private float vitaminA100G;
    private float vitaminAServing;
    private String vitaminAUnit;
    private float vitaminC;
    private float vitaminCValue;
    private float vitaminC100G;
    private float vitaminCServing;
    private String vitaminCUnit;
    private float vitaminD;
    private float vitaminDValue;
    private float vitaminD100G;
    private float vitaminDServing;
    private String vitaminDUnit;


    public float getCalcium() {
        return calcium;
    }

    public float getCalciumValue() {
        return calciumValue;
    }

    public float getCalcium100G() {
        return calcium100G;
    }

    public float getCalciumServing() {
        return calciumServing;
    }

    public String getCalciumUnit() {
        return calciumUnit;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public float getCarbohydratesValue() {
        return carbohydratesValue;
    }

    public float getCarbohydrates100G() {
        return carbohydrates100G;
    }

    public float getCarbohydratesServing() {
        return carbohydratesServing;
    }

    public String getCarbohydratesUnit() {
        return carbohydratesUnit;
    }

    public float getCarbonFootprintFromKnownIngredientsProduct() {
        return carbonFootprintFromKnownIngredientsProduct;
    }

    public float getCarbonFootprintFromKnownIngredients100G() {
        return carbonFootprintFromKnownIngredients100G;
    }

    public float getCarbonFootprintFromKnownIngredientsServing() {
        return carbonFootprintFromKnownIngredientsServing;
    }

    public float getCholesterol() {
        return cholesterol;
    }

    public float getCholesterolValue() {
        return cholesterolValue;
    }

    public float getCholesterol100G() {
        return cholesterol100G;
    }

    public float getCholesterolServing() {
        return cholesterolServing;
    }

    public String getCholesterolUnit() {
        return cholesterolUnit;
    }

    public int getEnergy() {
        return energy;
    }

    public int getEnergyKcal() {
        return energyKcal;
    }

    public int getEnergyKj() {
        return energyKj;
    }

    public int getEnergyValue() {
        return energyValue;
    }

    public int getEnergyKcalValue() {
        return energyKcalValue;
    }

    public int getEnergyKjValue() {
        return energyKjValue;
    }

    public int getEnergy100G() {
        return energy100G;
    }

    public int getEnergyKcal100G() {
        return energyKcal100G;
    }

    public int getEnergyKj100G() {
        return energyKj100G;
    }

    public int getEnergyServing() {
        return energyServing;
    }

    public int getEnergyKcalServing() {
        return energyKcalServing;
    }

    public int getEnergyKjServing() {
        return energyKjServing;
    }

    public String getEnergyUnit() {
        return energyUnit;
    }

    public String getEnergyKcalUnit() {
        return energyKcalUnit;
    }

    public String getEnergyKjUnit() {
        return energyKjUnit;
    }

    public float getFat() {
        return fat;
    }

    public float getFatValue() {
        return fatValue;
    }

    public float getFat100G() {
        return fat100G;
    }

    public float getFatServing() {
        return fatServing;
    }

    public String getFatUnit() {
        return fatUnit;
    }

    public float getFiber() {
        return fiber;
    }

    public float getFiberValue() {
        return fiberValue;
    }

    public float getFiber100G() {
        return fiber100G;
    }

    public float getFiberServing() {
        return fiberServing;
    }

    public String getFiberUnit() {
        return fiberUnit;
    }

    public float getFruitsVegetablesNutsEstimateFromIngredients100G() {
        return fruitsVegetablesNutsEstimateFromIngredients100G;
    }

    public float getIron() {
        return iron;
    }

    public float getIronValue() {
        return ironValue;
    }

    public float getIron100G() {
        return iron100G;
    }

    public float getIronServing() {
        return ironServing;
    }

    public String getIronUnit() {
        return ironUnit;
    }

    public float getNovaGroup() {
        return novaGroup;
    }

    public float getNovaGroup100G() {
        return novaGroup100G;
    }

    public float getNovaGroupServing() {
        return novaGroupServing;
    }

    public float getProteins() {
        return proteins;
    }

    public float getProteinsValue() {
        return proteinsValue;
    }

    public float getProteins100G() {
        return proteins100G;
    }

    public float getProteinsServing() {
        return proteinsServing;
    }

    public String getProteinsUnit() {
        return proteinsUnit;
    }

    public float getSalt() {
        return salt;
    }

    public float getSaltValue() {
        return saltValue;
    }

    public float getSalt100G() {
        return salt100G;
    }

    public float getSaltServing() {
        return saltServing;
    }

    public String getSaltUnit() {
        return saltUnit;
    }

    public float getSaturatedFat() {
        return saturatedFat;
    }

    public float getSaturatedFatValue() {
        return saturatedFatValue;
    }

    public float getSaturatedFat100G() {
        return saturatedFat100G;
    }

    public float getSaturatedFatServing() {
        return saturatedFatServing;
    }

    public String getSaturatedFatUnit() {
        return saturatedFatUnit;
    }

    public float getSodium() {
        return sodium;
    }

    public float getSodiumValue() {
        return sodiumValue;
    }

    public float getSodium100G() {
        return sodium100G;
    }

    public float getSodiumServing() {
        return sodiumServing;
    }

    public String getSodiumUnit() {
        return sodiumUnit;
    }

    public float getSugars() {
        return sugars;
    }

    public float getSugarsValue() {
        return sugarsValue;
    }

    public float getSugars100G() {
        return sugars100G;
    }

    public float getSugarsServing() {
        return sugarsServing;
    }

    public String getSugarsUnit() {
        return sugarsUnit;
    }

    public float getTransFat() {
        return transFat;
    }

    public float getTransFatValue() {
        return transFatValue;
    }

    public float getTransFat100G() {
        return transFat100G;
    }

    public float getTransFatServing() {
        return transFatServing;
    }

    public String getTransFatUnit() {
        return transFatUnit;
    }

    public float getVitaminA() {
        return vitaminA;
    }

    public float getVitaminAValue() {
        return vitaminAValue;
    }

    public float getVitaminA100G() {
        return vitaminA100G;
    }

    public float getVitaminAServing() {
        return vitaminAServing;
    }

    public String getVitaminAUnit() {
        return vitaminAUnit;
    }

    public float getVitaminC() {
        return vitaminC;
    }

    public float getVitaminCValue() {
        return vitaminCValue;
    }

    public float getVitaminC100G() {
        return vitaminC100G;
    }

    public float getVitaminCServing() {
        return vitaminCServing;
    }

    public String getVitaminCUnit() {
        return vitaminCUnit;
    }

    public float getVitaminD() {
        return vitaminD;
    }

    public float getVitaminDValue() {
        return vitaminDValue;
    }

    public float getVitaminD100G() {
        return vitaminD100G;
    }

    public float getVitaminDServing() {
        return vitaminDServing;
    }

    public String getVitaminDUnit() {
        return vitaminDUnit;
    }

    public static Nutriments populateNutriments(JSONObject nutriments) {
        Nutriments nutriments1 = new Nutriments();

        try {
            if (nutriments.has("calcium"))
                nutriments1.calcium = Float.parseFloat(nutriments.getString("calcium"));
            if (nutriments.has("calcium_value"))
                nutriments1.calciumValue = Float.parseFloat(nutriments.getString("calcium_value"));
            if (nutriments.has("calcium_100g"))
                nutriments1.calcium100G = Float.parseFloat(nutriments.getString("calcium_100g"));
            if (nutriments.has("calcium_serving"))
                nutriments1.calciumServing = Float.parseFloat(nutriments.getString("calcium_serving"));
            if (nutriments.has("calcium_unit"))
                nutriments1.calciumUnit = nutriments.getString("calcium_unit");
            if (nutriments.has("carbohydrates"))
                nutriments1.carbohydrates = Float.parseFloat(nutriments.getString("carbohydrates"));
            if (nutriments.has("carbohydrates_value"))
                nutriments1.carbohydratesValue = Float.parseFloat(nutriments.getString("carbohydrates_value"));
            if (nutriments.has("carbohydrates_100g"))
                nutriments1.carbohydrates100G = Float.parseFloat(nutriments.getString("carbohydrates_100g"));
            if (nutriments.has("carbohydrates_serving"))
                nutriments1.carbohydratesServing = Float.parseFloat(nutriments.getString("carbohydrates_serving"));
            if (nutriments.has("carbohydrates_unit"))
                nutriments1.carbohydratesUnit = nutriments.getString("carbohydrates_unit");
            if (nutriments.has("carbon-footprint-from-known-ingredients_product"))
                nutriments1.carbonFootprintFromKnownIngredientsProduct = Float.parseFloat(nutriments.getString("carbon-footprint-from-known-ingredients_product"));
            if (nutriments.has("carbon-footprint-from-known-ingredients_100g"))
                nutriments1.carbonFootprintFromKnownIngredients100G = Float.parseFloat(nutriments.getString("carbon-footprint-from-known-ingredients_100g"));
            if (nutriments.has("carbon-footprint-from-known-ingredients_serving"))
                nutriments1.carbonFootprintFromKnownIngredientsServing = Float.parseFloat(nutriments.getString("carbon-footprint-from-known-ingredients_serving"));
            if (nutriments.has("cholesterol"))
                nutriments1.cholesterol = Float.parseFloat(nutriments.getString("cholesterol"));
            if (nutriments.has("cholesterol_value"))
                nutriments1.cholesterolValue = Float.parseFloat(nutriments.getString("cholesterol_value"));
            if (nutriments.has("cholesterol_100g"))
                nutriments1.cholesterol100G = Float.parseFloat(nutriments.getString("cholesterol_100g"));
            if (nutriments.has("cholesterol_serving"))
                nutriments1.cholesterolServing = Float.parseFloat(nutriments.getString("cholesterol_serving"));
            if (nutriments.has("cholesterol_unit"))
                nutriments1.cholesterolUnit = nutriments.getString("cholesterol_unit");
            if (nutriments.has("energy"))
                nutriments1.energy = nutriments.getInt("energy");
            if (nutriments.has("energy-kcal"))
                nutriments1.energyKcal = nutriments.getInt("energy-kcal");
            if (nutriments.has("energy-kj"))
                nutriments1.energyKj = nutriments.getInt("energy-kj");
            if (nutriments.has("energy_value"))
                nutriments1.energyValue = nutriments.getInt("energy_value");
            if (nutriments.has("energy-kcal_value"))
                nutriments1.energyKcalValue = nutriments.getInt("energy-kcal_value");
            if (nutriments.has("energy-kj_value"))
                nutriments1.energyKjValue = nutriments.getInt("energy-kj_value");
            if (nutriments.has("energy_100g"))
                nutriments1.energy100G = nutriments.getInt("energy_100g");
            if (nutriments.has("energy-kcal_100g"))
                nutriments1.energyKcal100G = nutriments.getInt("energy-kcal_100g");
            if (nutriments.has("energy-kj_100g"))
                nutriments1.energyKj100G = nutriments.getInt("energy-kj_100g");
            if (nutriments.has("energy_serving"))
                nutriments1.energyServing = nutriments.getInt("energy_serving");
            if (nutriments.has("energy-kcal_serving"))
                nutriments1.energyKcalServing = nutriments.getInt("energy-kcal_serving");
            if (nutriments.has("energy-kj_serving"))
                nutriments1.energyKjServing = nutriments.getInt("energy-kj_serving");
            if (nutriments.has("energy_unit"))
                nutriments1.energyUnit = nutriments.getString("energy_unit");
            if (nutriments.has("energy-kcal_unit"))
                nutriments1.energyKcalUnit = nutriments.getString("energy-kcal_unit");
            if (nutriments.has("energy-kj_unit"))
                nutriments1.energyKjUnit = nutriments.getString("energy-kj_unit");
            if (nutriments.has("fat"))
                nutriments1.fat = Float.parseFloat(nutriments.getString("fat"));
            if (nutriments.has("fat_value"))
                nutriments1.fatValue = Float.parseFloat(nutriments.getString("fat_value"));
            if (nutriments.has("fat_100g"))
                nutriments1.fat100G = Float.parseFloat(nutriments.getString("fat_100g"));
            if (nutriments.has("fat_serving"))
                nutriments1.fatServing = Float.parseFloat(nutriments.getString("fat_serving"));
            if (nutriments.has("fat_unit"))
                nutriments1.fatUnit = nutriments.getString("fat_unit");
            if (nutriments.has("fiber"))
                nutriments1.fiber = Float.parseFloat(nutriments.getString("fiber"));
            if (nutriments.has("fiber_value"))
                nutriments1.fiberValue = Float.parseFloat(nutriments.getString("fiber_value"));
            if (nutriments.has("fiber_100g"))
                nutriments1.fiber100G = Float.parseFloat(nutriments.getString("fiber_100g"));
            if (nutriments.has("fiber_serving"))
                nutriments1.fiberServing = Float.parseFloat(nutriments.getString("fiber_serving"));
            if (nutriments.has("fiber_unit"))
                nutriments1.fiberUnit = nutriments.getString("fiber_unit");
            if (nutriments.has("fruits-vegetables-nuts-estimate-from-ingredients_100g"))
                nutriments1.fruitsVegetablesNutsEstimateFromIngredients100G = Float.parseFloat(nutriments.getString("fruits-vegetables-nuts-estimate-from-ingredients_100g"));
            if (nutriments.has("iron"))
                nutriments1.iron = Float.parseFloat(nutriments.getString("iron"));
            if (nutriments.has("iron_value"))
                nutriments1.ironValue = Float.parseFloat(nutriments.getString("iron_value"));
            if (nutriments.has("iron_100g"))
                nutriments1.iron100G = Float.parseFloat(nutriments.getString("iron_100g"));
            if (nutriments.has("iron_serving"))
                nutriments1.ironServing = Float.parseFloat(nutriments.getString("iron_serving"));
            if (nutriments.has("iron_unit"))
                nutriments1.ironUnit = nutriments.getString("iron_unit");
            if (nutriments.has("nova-group"))
                nutriments1.novaGroup = Float.parseFloat(nutriments.getString("nova-group"));
            if (nutriments.has("nova-group_100g"))
                nutriments1.novaGroup100G = Float.parseFloat(nutriments.getString("nova-group_100g"));
            if (nutriments.has("nova-group_serving"))
                nutriments1.novaGroupServing = Float.parseFloat(nutriments.getString("nova-group_serving"));
            if (nutriments.has("proteins"))
                nutriments1.proteins = Float.parseFloat(nutriments.getString("proteins"));
            if (nutriments.has("proteins_value"))
                nutriments1.proteinsValue = Float.parseFloat(nutriments.getString("proteins_value"));
            if (nutriments.has("proteins_100g"))
                nutriments1.proteins100G = Float.parseFloat(nutriments.getString("proteins_100g"));
            if (nutriments.has("proteins_serving"))
                nutriments1.proteinsServing = Float.parseFloat(nutriments.getString("proteins_serving"));
            if (nutriments.has("proteins_unit"))
                nutriments1.proteinsUnit = nutriments.getString("proteins_unit");
            if (nutriments.has("salt"))
                nutriments1.salt = Float.parseFloat(nutriments.getString("salt"));
            if (nutriments.has("salt_value"))
                nutriments1.saltValue = Float.parseFloat(nutriments.getString("salt_value"));
            if (nutriments.has("salt_100g"))
                nutriments1.salt100G = Float.parseFloat(nutriments.getString("salt_100g"));
            if (nutriments.has("salt_serving"))
                nutriments1.saltServing = Float.parseFloat(nutriments.getString("salt_serving"));
            if (nutriments.has("salt_unit"))
                nutriments1.saltUnit = nutriments.getString("salt_unit");
            if (nutriments.has("saturated-fat"))
                nutriments1.saturatedFat = Float.parseFloat(nutriments.getString("saturated-fat"));
            if (nutriments.has("saturated-fat_value"))
                nutriments1.saturatedFatValue = Float.parseFloat(nutriments.getString("saturated-fat_value"));
            if (nutriments.has("saturated-fat_100g"))
                nutriments1.saturatedFat100G = Float.parseFloat(nutriments.getString("saturated-fat_100g"));
            if (nutriments.has("saturated-fat_serving"))
                nutriments1.saturatedFatServing = Float.parseFloat(nutriments.getString("saturated-fat_serving"));
            if (nutriments.has("saturated-fat_unit"))
                nutriments1.saturatedFatUnit = nutriments.getString("saturated-fat_unit");
            if (nutriments.has("sodium"))
                nutriments1.sodium = Float.parseFloat(nutriments.getString("sodium"));
            if (nutriments.has("sodium_value"))
                nutriments1.sodiumValue = Float.parseFloat(nutriments.getString("sodium_value"));
            if (nutriments.has("sodium_100g"))
                nutriments1.sodium100G = Float.parseFloat(nutriments.getString("sodium_100g"));
            if (nutriments.has("sodium_serving"))
                nutriments1.sodiumServing = Float.parseFloat(nutriments.getString("sodium_serving"));
            if (nutriments.has("sodium_unit"))
                nutriments1.sodiumUnit = nutriments.getString("sodium_unit");
            if (nutriments.has("sugars"))
                nutriments1.sugars = Float.parseFloat(nutriments.getString("sugars"));
            if (nutriments.has("sugars_value"))
                nutriments1.sugarsValue = Float.parseFloat(nutriments.getString("sugars_value"));
            if (nutriments.has("sugars_100g"))
                nutriments1.sugars100G = Float.parseFloat(nutriments.getString("sugars_100g"));
            if (nutriments.has("sugars_serving"))
                nutriments1.sugarsServing = Float.parseFloat(nutriments.getString("sugars_serving"));
            if (nutriments.has("sugars_unit"))
                nutriments1.sugarsUnit = nutriments.getString("sugars_unit");
            if (nutriments.has("trans-fat"))
                nutriments1.transFat = Float.parseFloat(nutriments.getString("trans-fat"));
            if (nutriments.has("trans-fat_value"))
                nutriments1.transFatValue = Float.parseFloat(nutriments.getString("trans-fat_value"));
            if (nutriments.has("trans-fat_100g"))
                nutriments1.transFat100G = Float.parseFloat(nutriments.getString("trans-fat_100g"));
            if (nutriments.has("trans-fat_serving"))
                nutriments1.transFatServing = Float.parseFloat(nutriments.getString("trans-fat_serving"));
            if (nutriments.has("trans-fat_unit"))
                nutriments1.transFatUnit = nutriments.getString("trans-fat_unit");
            if (nutriments.has("vitamin-a"))
                nutriments1.vitaminA = Float.parseFloat(nutriments.getString("vitamin-a"));
            if (nutriments.has("vitamin-a_value"))
                nutriments1.vitaminAValue = Float.parseFloat(nutriments.getString("vitamin-a_value"));
            if (nutriments.has("vitamin-a_100g"))
                nutriments1.vitaminA100G = Float.parseFloat(nutriments.getString("vitamin-a_100g"));
            if (nutriments.has("vitamin-a_serving"))
                nutriments1.vitaminAServing = Float.parseFloat(nutriments.getString("vitamin-a_serving"));
            if (nutriments.has("vitamin-a_unit"))
                nutriments1.vitaminAUnit = nutriments.getString("vitamin-a_unit");
            if (nutriments.has("vitamin-c"))
                nutriments1.vitaminC = Float.parseFloat(nutriments.getString("vitamin-c"));
            if (nutriments.has("vitamin-c_value"))
                nutriments1.vitaminCValue = Float.parseFloat(nutriments.getString("vitamin-c_value"));
            if (nutriments.has("vitamin-c_100g"))
                nutriments1.vitaminC100G = Float.parseFloat(nutriments.getString("vitamin-c_100g"));
            if (nutriments.has("vitamin-c_serving"))
                nutriments1.vitaminCServing = Float.parseFloat(nutriments.getString("vitamin-c_serving"));
            if (nutriments.has("vitamin-c_unit"))
                nutriments1.vitaminCUnit = nutriments.getString("vitamin-c_unit");
            if (nutriments.has("vitamin-d"))
                nutriments1.vitaminD = Float.parseFloat(nutriments.getString("vitamin-d"));
            if (nutriments.has("vitamin-d_value"))
                nutriments1.vitaminDValue = Float.parseFloat(nutriments.getString("vitamin-d_value"));
            if (nutriments.has("vitamin-d_100g"))
                nutriments1.vitaminD100G = Float.parseFloat(nutriments.getString("vitamin-d_100g"));
            if (nutriments.has("vitamin-d_serving"))
                nutriments1.vitaminDServing = Float.parseFloat(nutriments.getString("vitamin-d_serving"));
            if (nutriments.has("vitamin-d_unit"))
                nutriments1.vitaminDUnit = nutriments.getString("vitamin-d_unit");

        } catch (JSONException exception) {
            String error = "";
        }

        return nutriments1;
    }
}
