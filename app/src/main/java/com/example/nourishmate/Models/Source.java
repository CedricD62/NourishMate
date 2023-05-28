package com.example.nourishmate.Models;

import com.j256.ormlite.table.DatabaseTable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
@DatabaseTable
public class Source {

    private ArrayList<String> fields;
    private String id;
    private ArrayList<String> images;
    private long importT;
    private String manufacturer;
    private String name;
    private String url;

    public static ArrayList<Source> populateSource(JSONArray sources) {
        ArrayList<Source> s = new ArrayList<>();
        for (int i = 0; i < sources.length(); i++) {
            try {
                JSONObject obj = sources.getJSONObject(i);
                Source src = new Source();

                if (obj.has("fields"))
                    src.fields = pupolateCollection(obj.getJSONArray("fields"));
                if (obj.has("id"))
                    src.id = obj.getString("id");
                if (obj.has("images"))
                    src.images = pupolateCollection(obj.getJSONArray("images"));
                if (obj.has("import_t"))
                    src.importT = obj.getLong("import_t");
                if (obj.has("manufacturer"))
                    src.manufacturer = obj.getString("manufacturer");
                if (obj.has("name"))
                    src.name = obj.getString("name");
                if (obj.has("url"))
                    src.url = obj.getString("url");
                s.add(src);
            } catch (JSONException exception) {
                String error = "";
            }
        }
        return s;
    }

    private static ArrayList<String> pupolateCollection(JSONArray fields) {
        ArrayList<String> values = new ArrayList<>();
        for (int i = 0; i < fields.length(); i++) {
            try {
                values.add(fields.get(i).toString());
            } catch (JSONException exception) {

            }
        }
        return values;
    }
}
