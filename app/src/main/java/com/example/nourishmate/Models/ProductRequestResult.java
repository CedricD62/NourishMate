package com.example.nourishmate.Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
        String url = "https://world.openfoodfacts.org/api/v2/product/" + code;
        try {
            JSONObject json = new JSONObject(httpHandler.makeServiceCall(url));
            if(json != null){
                productRequestResult = new ProductRequestResult(json.getString("code"),json.getInt("status"),json.getString("status_verbose"));
                JSONObject p = json.getJSONObject("product");
                productRequestResult.product = Product.populateProduct(p);
            }
        } catch (JSONException e) {
            String error = "";
        }
        return productRequestResult;
    }


}
