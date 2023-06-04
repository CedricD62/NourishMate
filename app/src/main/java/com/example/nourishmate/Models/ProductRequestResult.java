package com.example.nourishmate.Models;

import com.j256.ormlite.table.DatabaseTable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

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


    public static ProductRequestResult getProductByCodeScan(String code) {
        ProductRequestResult productRequestResult = null;
        HttpHandler httpHandler = new HttpHandler();
        String url = "https://world.openfoodfacts.org/api/v2/product/" + code + "?fields=categories_tags,countries_tags,product_name,nutriscore_data,nutriments,nutrition_grades,allergens_imported,nutrient_levels,code,allergens,allergens_from_ingredients,allergens_from_user,allergens_hierarchy,allergens_imported,allergens_lc,allergens_tags,selected_images";
        try {
            JSONObject json = new JSONObject(httpHandler.makeServiceCall(url));
            if (json != null) {
                productRequestResult = new ProductRequestResult(json.getString("code"), json.getInt("status"), json.getString("status_verbose"));
                JSONObject p = json.getJSONObject("product");
                productRequestResult.product = Product.populateProduct(p);
            }
        } catch (JSONException e) {
            String error = "";
        }
        return productRequestResult;
    }

    public static ArrayList<Product>  getBestAlternaviveProducts(String code, String countryTag, String categoryTags) {
        ProductRequestResult productRequestResult = null;
        ArrayList<Product> products = new ArrayList<>();
        HttpHandler httpHandler = new HttpHandler();
        String url = "https://world.openfoodfacts.org/api/v2/search?countries_tags=" + countryTag + "&categories_tags="+ categoryTags + "&fields=product_name,code,selected_images";
        try {
            JSONObject json = new JSONObject(httpHandler.makeServiceCall(url));
            JSONArray array = json.getJSONArray("products");
            if (json != null) {
                for (int i = 0; i < array.length(); i++){
                    products.add(Product.populateProduct(array.getJSONObject(i)));
                }
                /*productRequestResult = new ProductRequestResult(json.getString("code"), json.getInt("status"), json.getString("status_verbose"));
                JSONObject p = json.getJSONObject("product");
                productRequestResult.product = Product.populateProduct(p);*/
            }
        } catch (JSONException e) {
            String error = "";
        }
        return products;
    }
}
