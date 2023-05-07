package com.example.nourishmate.Models;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;
import org.json.JSONObject;


public class SelectedImages {

    public SelectedImage front;

    public SelectedImage ingredients;

    public SelectedImage nutrition;
    @NonNull
    @Contract("_ -> new")
    public static SelectedImages populateSelectedImages(JSONObject selected_images) {
        String error = "";
        return new SelectedImages();
    }
}
