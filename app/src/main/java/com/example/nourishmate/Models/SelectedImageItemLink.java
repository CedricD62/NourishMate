package com.example.nourishmate.Models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SelectedImageItemLink {

    private Map<String, String> mappedImageLinkedByLangage;

    public Map<String, String> getMappedImageLinkedByLangage() {
        return mappedImageLinkedByLangage;
    }

    public static SelectedImageItemLink getSelectedImageItemLinkFromJSONObject(JSONObject jsonObject) {

        SelectedImageItemLink selectedImageItemLink = new SelectedImageItemLink();
        selectedImageItemLink.mappedImageLinkedByLangage = new LinkedHashMap<>();
        Iterator<String> keys = jsonObject.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            try {
                String k = jsonObject.get(key).toString();
                selectedImageItemLink.mappedImageLinkedByLangage.put(key, k);
            } catch (JSONException exception) {
                String error = "";
            }
        }
        return selectedImageItemLink;
    }
}
