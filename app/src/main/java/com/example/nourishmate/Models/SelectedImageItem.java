package com.example.nourishmate.Models;

import com.j256.ormlite.table.DatabaseTable;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
@DatabaseTable
public class SelectedImageItem {
    private SelectedImageItemLink  display;

    private SelectedImageItemLink  small;

    private SelectedImageItemLink  thumb;

    public SelectedImageItemLink getDisplay() {
        return display;
    }

    public SelectedImageItemLink getSmall() {
        return small;
    }

    public SelectedImageItemLink getThumb() {
        return thumb;
    }

    public static SelectedImageItem getSelectedImageItemFromJSONObject(JSONObject jsonObject){
        SelectedImageItem selectedImageItem = new SelectedImageItem();

        Iterator<String> keysSelectedImage = jsonObject.keys();
        LanguagesCodes languagesCodes = new LanguagesCodes();
        while (keysSelectedImage.hasNext()) {
            String key = keysSelectedImage.next();
            try {
                switch (key) {
                    case "display":
                        selectedImageItem.display = SelectedImageItemLink.getSelectedImageItemLinkFromJSONObject((JSONObject) jsonObject.get(key));
                        break;
                    case "small":
                        selectedImageItem.small = SelectedImageItemLink.getSelectedImageItemLinkFromJSONObject((JSONObject) jsonObject.get(key));
                        break;
                    case "thumb":
                        selectedImageItem.thumb = SelectedImageItemLink.getSelectedImageItemLinkFromJSONObject((JSONObject) jsonObject.get(key));
                        break;
                    default:
                        break;
                }
            } catch (JSONException exception) {
                String error = "";
            }
        }
        return selectedImageItem;
    }
}
