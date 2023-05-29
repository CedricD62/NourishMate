package com.example.nourishmate.Models;

import com.j256.ormlite.table.DatabaseTable;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Images {

    Map<String,Object> other = new LinkedHashMap<>();

    public Images populateImages(JSONObject images) {
        Images images1 = new Images();
        Iterator<String> keys = images.keys();

        while(keys.hasNext()){
           String key = keys.next();
           try{
               Object k = images.get(key);
               images1.other.put(key, k);
           }catch (JSONException exception){
               String error = "";
           }

        }
        return images1;
    }
}
