package com.example.nourishmate.Models;

import android.content.Context;

import com.j256.ormlite.table.DatabaseTable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

@DatabaseTable
public class ProductRequestResult {

    public ProductRequestResult(String code, int status, String status_verbose) {
        this.code = code;
        this.status = status;
        this.status_verbose = status_verbose;
    }

    private String code;
    private Product product;
    private int status;
    private String status_verbose;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus_verbose() {
        return status_verbose;
    }

    public void setStatus_verbose(String status_verbose) {
        this.status_verbose = status_verbose;
    }


    public static ProductRequestResult getProductByCodeScan(String code, Optional<Context> activity) {
        ProductRequestResult productRequestResult = null;
        HttpHandler httpHandler = new HttpHandler();
        String url = "https://world.openfoodfacts.org/api/v2/product/" + code +
                "?fields=categories_tags,countries_tags,product_name,nutriscore_data,nutriments,nutrition_grades," +
                "allergens_imported,nutrient_levels,code,allergens,allergens_from_ingredients,allergens_from_user," +
                "allergens_hierarchy,allergens_imported,allergens_lc,allergens_tags,selected_images";
        try {
            JSONObject json = new JSONObject(httpHandler.makeServiceCall(url, activity));
            if (json != null) {
                productRequestResult = new ProductRequestResult(json.getString("code"), json.getInt("status"),
                                                                json.getString("status_verbose"));
                JSONObject p = json.getJSONObject("product");
                productRequestResult.product = Product.populateProduct(p);
            }
        } catch (JSONException e) {
            AlertDialogs.displayInformationToUser( false, true,
                    "Parse JSON",
                    "Une erreur est survenue lors de la lecture du fichier JSON pour le Code Barre du produit scanné",
                    Optional.empty(), Optional.empty(), activity);
        }
        return productRequestResult;
    }

    public static ArrayList<Product>  getBestAlternaviveProducts(String code, String countryTag, String categoryTags, Optional<Context> activity) {
        ProductRequestResult productRequestResult = null;
        ArrayList<Product> products = new ArrayList<>();
        HttpHandler httpHandler = new HttpHandler();
        String url = "https://world.openfoodfacts.org/api/v2/search?countries_tags=" + countryTag +
                "&categories_tags="+ categoryTags + "&fields=product_name,code,selected_images";
        try {
            JSONObject json = new JSONObject(httpHandler.makeServiceCall(url, activity));
            JSONArray array = json.getJSONArray("products");
            if (json != null) {
                for (int i = 0; i < array.length(); i++){
                    products.add(Product.populateProduct(array.getJSONObject(i)));
                }
            }
        } catch (JSONException e) {
            AlertDialogs.displayInformationToUser( false, true,
                    "Parse JSON",
                    "Une erreur est survenue lors de la lecture du fichier JSON lors " +
                            "de la récupération de la liste de produit suggérés",
                    Optional.empty(), Optional.empty(), activity);
        }
        return products;
    }

    public static HashSet<AllergensTags> getAllergenList(Optional<Context> activity){
        HashSet<AllergensTags> allergens = new HashSet<>();
        HashSet<String> allergenNames = new HashSet<>();
        HttpHandler httpHandler = new HttpHandler();
        String url = "https://world.openfoodfacts.org/api/v2/search?tagtype_0=allergens&fields=allergens&page_size=1000";
        try {
            JSONObject json = new JSONObject(httpHandler.makeServiceCall(url, activity));
            JSONArray array = json.getJSONArray("products");
            if (json != null) {
                for (int i = 0; i < array.length(); i++){
                    try{
                        JSONObject obj = array.getJSONObject(i);
                        if (obj.has("allergens")){
                            String allergenString = obj.getString("allergens");
                            if(allergenString != null && allergenString.length() >0){
                                String [] allergenTab = allergenString.split(",");
                                for (int j = 0; j < allergenTab.length; j++){
                                    try{
                                        if(allergenTab[j].startsWith("en") || allergenTab[j].startsWith("fr")){
                                            String allergenSplitted = allergenTab[j].split(":")[1].toLowerCase();
                                            if(!allergenNames.contains(allergenSplitted)){
                                                allergenNames.add(allergenSplitted);
                                                allergens.add(new AllergensTags(allergenSplitted));
                                            }}}catch(Exception ex){
                                        AlertDialogs.displayInformationToUser( false, true,
                                                "Récupération liste allergène",
                                                "Une erreur est survenue lors de l'ajoût des allergènes à la liste",
                                                Optional.empty(), Optional.empty(), activity);
                                    }}} }}catch (Exception ex){
                        AlertDialogs.displayInformationToUser( false, true,
                                "Récupération liste allergène",
                                "Une erreur est survenue lors de la récupération d'un objet dans la liste des allergènes",
                                Optional.empty(), Optional.empty(), activity);
                    }}}} catch (JSONException e) {
            AlertDialogs.displayInformationToUser( false, true,
                    "Récupération liste allergène",
                    "Une erreur est survenue lors de la lecture du fichier JSON contenant la liste des allergènes",
                    Optional.empty(), Optional.empty(), activity);
        }
        return allergens;
    }
}
