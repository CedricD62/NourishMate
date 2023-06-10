package com.example.nourishmate.Models;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.Collection;
public class Product {

    private int id;
    private Collection<CategoriesTags> categoriesTags;
    private String productName;
    private Nutriments nutriments;
    private String nutritionGrades;
    private NutrientLevels nutrientLevels;
    private String allergensFromIngredients;
    private String allergensFromUser;
    private String allergensLc;
    private Collection<AllergensTags> allergensTags;
    private Collection<IngredientsTags> ingredientsTags;
    private SelectedImages selectedImages;
    private int additivesN;
    private Collection<AdditivesTags> additivesTags;
    private Collection<CountriesTags> countriesTags;
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Collection<CategoriesTags> getCategoriesTags() {
        return categoriesTags;
    }

    public void setCategoriesTags(Collection<CategoriesTags> categoriesTags) {
        this.categoriesTags = categoriesTags;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Nutriments getNutriments() {
        return nutriments;
    }

    public void setNutriments(Nutriments nutriments) {
        this.nutriments = nutriments;
    }

    public String getNutritionGrades() {
        return nutritionGrades;
    }

    public void setNutritionGrades(String nutritionGrades) {
        this.nutritionGrades = nutritionGrades;
    }

    public NutrientLevels getNutrientLevels() {
        return nutrientLevels;
    }

    public void setNutrientLevels(NutrientLevels nutrientLevels) {
        this.nutrientLevels = nutrientLevels;
    }

    public String getAllergensFromIngredients() {
        return allergensFromIngredients;
    }

    public void setAllergensFromIngredients(String allergensFromIngredients) {
        this.allergensFromIngredients = allergensFromIngredients;
    }

    public String getAllergensFromUser() {
        return allergensFromUser;
    }

    public void setAllergensFromUser(String allergensFromUser) {
        this.allergensFromUser = allergensFromUser;
    }

    public String getAllergensLc() {
        return allergensLc;
    }

    public void setAllergensLc(String allergensLc) {
        this.allergensLc = allergensLc;
    }

    public Collection<AllergensTags> getAllergensTags() {
        return allergensTags;
    }

    public void setAllergensTags(Collection<AllergensTags> allergensTags) {
        this.allergensTags = allergensTags;
    }

    public SelectedImages getSelectedImages() {
        return selectedImages;
    }

    public void setSelectedImages(SelectedImages selectedImages) {
        this.selectedImages = selectedImages;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAdditivesN() {
        return additivesN;
    }

    public void setAdditivesN(int additivesN) {
        this.additivesN = additivesN;
    }

    public Collection<AdditivesTags> getAdditivesTags() {
        return additivesTags;
    }

    public void setAdditivesTags(Collection<AdditivesTags> additivesTags) {
        this.additivesTags = additivesTags;
    }

    public Collection<CountriesTags> getCountriesTags() {
        return countriesTags;
    }

    public void setCountriesTags(Collection<CountriesTags> countriesTags) {
        this.countriesTags = countriesTags;
    }

    public static Product populateProduct(JSONObject obj) {

        Product product = new Product();
        try {
            if(obj.has("ingredients_tags"))
                product.ingredientsTags = IngredientsTags.pupolateCollection(obj.getJSONArray("ingredients_tags"));
            if (obj.has("countries_tags"))
                product.countriesTags = CountriesTags.pupolateCollection(obj.getJSONArray("countries_tags"));
            if (obj.has("additives_tags"))
                product.additivesTags = AdditivesTags.pupolateCollection(obj.getJSONArray("additives_tags"));
            if (obj.has("additives_n"))
                product.additivesN = obj.getInt("additives_n");
            if (obj.has("nutrient_levels"))
                product.nutrientLevels = NutrientLevels.populateNutrientLevels(obj.getJSONObject("nutrient_levels"));
            if (obj.has("nutriments"))
                product.nutriments = Nutriments.populateNutriments(obj.getJSONObject("nutriments"));
            if (obj.has("selected_images"))
                product.selectedImages = SelectedImages.populateSelectedImages(obj.getJSONObject("selected_images"));
            if (obj.has("allergens_from_ingredients"))
                product.allergensFromIngredients = obj.getString("allergens_from_ingredients");
            if (obj.has("allergens_from_user"))
                product.allergensFromUser = obj.getString("allergens_from_user");
            if (obj.has("allergens_lc"))
                product.allergensLc = obj.getString("allergens_lc");
            if (obj.has("allergens_tags"))
                product.allergensTags = AllergensTags.pupolateCollection(obj.getJSONArray("allergens_tags"));
           if (obj.has("categories_tags"))
                product.categoriesTags = CategoriesTags.pupolateCollection(obj.getJSONArray("categories_tags"));
           if (obj.has("nutrition_grades"))
                product.nutritionGrades = obj.getString("nutrition_grades");
            if (obj.has("product_name"))
                product.productName = obj.getString("product_name");
            if (obj.has("code"))
                product.code = obj.getString("code");
          } catch (JSONException e) {
            String error = "";
        }
        return product;
    }

    /* public boolean create(DatabaseManager dm) {
        try {
            Dao<Product, Integer> dao = dm.getDao(Product.class);
            dao.create(this);
            return true;
        } catch (SQLException e) {
            String x = "";
           return false;
        }
    }*/
}
