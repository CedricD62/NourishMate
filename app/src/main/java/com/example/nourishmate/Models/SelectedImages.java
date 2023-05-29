package com.example.nourishmate.Models;

import androidx.annotation.NonNull;

import com.j256.ormlite.table.DatabaseTable;

import org.jetbrains.annotations.Contract;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;


public class SelectedImages {

    private SelectedImageItem front;

    private SelectedImageItem ingredients;

    private SelectedImageItem nutrition;

    private SelectedImageItem packaging;

    public SelectedImageItem getFront() {
        return front;
    }

    public SelectedImageItem getIngredients() {
        return ingredients;
    }

    public SelectedImageItem getNutrition() {
        return nutrition;
    }

    public SelectedImageItem getPackaging() {
        return packaging;
    }

    @NonNull
    @Contract("_ -> new")
    public static SelectedImages populateSelectedImages(JSONObject selected_images) {
        SelectedImages selectedImages = new SelectedImages();

        Iterator<String> keysSelectedImage = selected_images.keys();

        while (keysSelectedImage.hasNext()) {
            String key = keysSelectedImage.next();
            try {
                switch (key) {
                    case "front":
                        selectedImages.front = SelectedImageItem.getSelectedImageItemFromJSONObject((JSONObject) selected_images.get(key));
                        break;
                    case "ingredients":
                        selectedImages.ingredients = SelectedImageItem.getSelectedImageItemFromJSONObject((JSONObject) selected_images.get(key));
                        break;
                    case "nutrition":
                        selectedImages.nutrition = SelectedImageItem.getSelectedImageItemFromJSONObject((JSONObject) selected_images.get(key));
                        break;
                    case "packaging":
                        selectedImages.packaging = SelectedImageItem.getSelectedImageItemFromJSONObject((JSONObject) selected_images.get(key));
                        break;
                    default:
                        break;
                }
            } catch (JSONException exception) {
                String error = "";
            }
        }
        return selectedImages;
    }
}
