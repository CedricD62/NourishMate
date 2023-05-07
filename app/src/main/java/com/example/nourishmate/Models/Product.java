package com.example.nourishmate.Models;

import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Product {


    private Images images;
    private ArrayList<Ingredient> ingredients;
    private LanguagesCodes languagesCodes;
    private NutrientLevels nutrientLevels;
    private Nutriments nutriments;
    private SelectedImages selectedImages;
    private ArrayList<Source> sources;
    private int additivesN;
    private int additivesOldN;
    private ArrayList<String> additivesOriginalTags;
    private ArrayList<String> additivesOldTags;
    private ArrayList<String> additivesPrevOriginalTags;
    private ArrayList<String> additivesDebugTags;
    private ArrayList<String> additivesTags;
    private String allergens;
    private String allergensFromIngredients;
    private String allergensFromUser;
    private ArrayList<String> allergensHierarchy;
    private String allergensLc;
    private ArrayList<String> allergensTags;
    private ArrayList<String> aminoAcidsPrevTags;
    private ArrayList<String> aminoAcidsTags;
    private String brands;
    private ArrayList<String> brandsDebugTags;
    private ArrayList<String> brandsTags;
    private String carbonFootprintPercentOfKnownIngredients;
    private String carbonFootprintFromKnownIngredientsDebug;
    private String categories;
    private ArrayList<String> categoriesHierarchy;
    private String categoriesLc;
    private ArrayList<String> categoriesPropertiesTags;
    private ArrayList<String> categoriesTags;
    private ArrayList<String> checkersTags;
    private ArrayList<String> citiesTags;
    private String code;
    private ArrayList<String> codesTags;
    private String comparedToCategory;
    private int complete;
    private long completedT;
    private float completeness;
    private String conservationConditions;
    private String countries;
    private ArrayList<String> countriesHierarchy;
    private String countriesLc;
    private ArrayList<String> countriesDebugTags;
    private ArrayList<String> countriesTags;
    private ArrayList<String> correctorsTags;
    private long createdT;
    private String creator;
    private ArrayList<String> dataQualityBugsTags;
    private ArrayList<String> dataQualityErrorsTags;
    private ArrayList<String> dataQualityInfoTags;
    private ArrayList<String> dataQualityTags;
    private ArrayList<String> dataQualityWarningsTags;
    private String dataSources;
    private ArrayList<String> dataSourcesTags;
    private ArrayList<String> debugParamSortedLangs;
    private ArrayList<String> editorsTags;
    private String embCodes;
    private ArrayList<String> embCodesDebugTags;
    private String embCodesOrig;
    private ArrayList<String> embCodesTags;
    private ArrayList<String> entryDatesTags;
    private String expirationDate;
    private ArrayList<String> expirationDateDebugTags;
    private int fruitsVegetablesNuts100GEstimate;
    private String genericName;
    private String id;
    private String _id;
    private String imageFrontSmallUrl;
    private String imageFrontThumbUrl;
    private String imageFrontUrl;
    private String imageIngredientsUrl;
    private String imageIngredientsSmallUrl;
    private String imageIngredientsThumbUrl;
    private String imageNutritionSmallUrl;
    private String imageNutritionThumbUrl;
    private String imageNutritionUrl;
    private String imageSmallUrl;
    private String imageThumbUrl;
    private String imageUrl;
    private ArrayList<String> informersTags;
    private ArrayList<String> ingredientsAnalysisTags;
    private ArrayList<String> ingredientsDebug;
    private int ingredientsFromOrThatMayBeFromPalmOilN;
    private ArrayList<String> ingredientsFromPalmOilTags;
    private int ingredientsFromPalmOilN;
    private ArrayList<String> ingredientsHierarchy;
    private ArrayList<String> ingredientsIdsDebug;
    private int ingredientsN;
    private ArrayList<String> ingredientsNTags;
    private ArrayList<String> ingredientsOriginalTags;
    private ArrayList<String> ingredientsTags;
    private String ingredientsText;
    private String ingredientsTextDebug;
    private String ingredientsTextWithAllergens;
    private int ingredientsThatMayBeFromPalmOilN;
    private ArrayList<String> ingredientsThatMayBeFromPalmOilTags;
    private String interfaceVersionCreated;
    private String interfaceVersionModified;
    private ArrayList<String> keywords;
    private int knownIngredientsN;
    private String labels;
    private ArrayList<String> labelsHierarchy;
    private String labelsLc;
    private ArrayList<String> labelsPrevHierarchy;
    private ArrayList<String> labelsPrevTags;
    private ArrayList<String> labelsTags;
    private ArrayList<String> labelsDebugTags;
    private String lang;
    private ArrayList<String> langDebugTags;
    private ArrayList<String> languagesHierarchy;
    private ArrayList<String> languagesTags;
    private ArrayList<String> lastEditDatesTags;
    private String lastEditor;
    private ArrayList<String> lastImageDatesTags;
    private long lastImageT;
    private String lastModifiedBy;
    private long lastModifiedT;
    private String lc;
    private String link;
    private ArrayList<String> linkDebugTags;
    private String manufacturingPlaces;
    private ArrayList<String> manufacturingPlacesDebugTags;
    private ArrayList<String> manufacturingPlacesTags;
    private String maxImgid;
    private ArrayList<String> mineralsPrevTags;
    private ArrayList<String> mineralsTags;
    private ArrayList<String> miscTags;
    private String netWeightUnit;
    private String netWeightValue;
    private String nutritionDataPer;
    private int nutritionScoreWarningNoFruitsVegetablesNuts;
    private String noNutritionData;
    private String novaGroup;
    private String novaGroups;
    private String novaGroupDebug;
    private ArrayList<String> novaGroupTags;
    private ArrayList<String> novaGroupsTags;
    private ArrayList<String> nucleotidesPrevTags;
    private ArrayList<String> nucleotidesTags;
    private ArrayList<String> nutrientLevelsTags;
    private String nutritionData;
    private ArrayList<String> nutritionDataPerDebugTags;
    private String nutritionDataPrepared;
    private String nutritionDataPreparedPer;
    private String nutritionGrades;
    private int nutritionScoreBeverage;
    private String nutritionScoreDebug;
    private int nutritionScoreWarningNoFiber;
    private ArrayList<String> nutritionGradesTags;
    private String origins;
    private ArrayList<String> originsDebugTags;
    private ArrayList<String> originsTags;
    private String otherInformation;
    private ArrayList<String> otherNutritionalSubstancesTags;
    private String packaging;
    private ArrayList<String> packagingDebugTags;
    private ArrayList<String> packagingTags;
    private ArrayList<String> photographersTags;
    private String pnnsGroups1;
    private String pnnsGroups2;
    private ArrayList<String> pnnsGroups1Tags;
    private ArrayList<String> pnnsGroups2Tags;
    private long popularityKey;
    private String producerVersionId;
    private String productName;
    private String productQuantity;
    private String purchasePlaces;
    private ArrayList<String> purchasePlacesDebugTags;
    private ArrayList<String> purchasePlacesTags;
    private ArrayList<String> qualityTags;
    private String quantity;
    private ArrayList<String> quantityDebugTags;
    private String recyclingInstructionsToDiscard;
    private int rev;
    private String servingQuantity;
    private String servingSize;
    private ArrayList<String> servingSizeDebugTags;
    private long sortkey;
    private String states;
    private ArrayList<String> statesHierarchy;
    private ArrayList<String> statesTags;
    private String stores;
    private ArrayList<String> storesDebugTags;
    private ArrayList<String> storesTags;
    private String traces;
    private String tracesFromIngredients;
    private ArrayList<String> tracesHierarchy;
    private ArrayList<String> tracesDebugTags;
    private String tracesFromUser;
    private String tracesLc;
    private ArrayList<String> tracesTags;
    private int unknownIngredientsN;
    private ArrayList<String> unknownNutrientsTags;
    private String updateKey;
    private ArrayList<String> vitaminsPrevTags;
    private ArrayList<String> vitaminsTags;

    public static Product populateProduct(JSONObject obj) {

        Product product = new Product();
        try {
            if (obj.has("languages_codes"))
                product.languagesCodes = LanguagesCodes.populateLanguagesCodes(obj.getJSONObject("languages_codes"));
            if (obj.has("images"))
                product.images = new Images().populateImages(obj.getJSONObject("images"));
            if (obj.has("ingredients"))
                product.ingredients = Ingredient.populateIngredients(obj.getJSONArray("ingredients"));
            if (obj.has("nutrient_levels"))
                product.nutrientLevels = NutrientLevels.populateNutrientLevels(obj.getJSONObject("nutrient_levels"));
            if (obj.has("nutrient_levels"))
                product.nutriments = Nutriments.populateNutriments(obj.getJSONObject("nutriments"));
            if (obj.has("selected_images"))
                product.selectedImages = SelectedImages.populateSelectedImages(obj.getJSONObject("selected_images"));
            if (obj.has("sources"))
                product.sources = Source.populateSource(obj.getJSONArray("sources"));
            if (obj.has("additives_n"))
                product.additivesN = obj.getInt("additives_n");
            if (obj.has("additives_old_n"))
                product.additivesOldN = obj.getInt("additives_old_n");
            if (obj.has("additives_original_tags"))
                product.additivesOriginalTags = new ArrayList<>((Collection) obj.getJSONArray("additives_original_tags"));
            if (obj.has("additives_old_tags"))
                product.additivesOldTags = new ArrayList<>((Collection) obj.getJSONArray("additives_old_tags"));
            if (obj.has("additives_prev_original_tags"))
                product.additivesPrevOriginalTags = new ArrayList<>((Collection) obj.getJSONArray("additives_prev_original_tags"));
            if (obj.has("additives_debug_tags"))
                product.additivesDebugTags = new ArrayList<>((Collection) obj.getJSONArray("additives_debug_tags"));
            if (obj.has("additives_tags"))
                product.additivesTags = new ArrayList<>((Collection) obj.getJSONArray("additives_tags"));
            if (obj.has("allergens"))
                product.allergens = obj.getString("allergens");
            if (obj.has("allergens_from_ingredients"))
                product.allergensFromIngredients = obj.getString("allergens_from_ingredients");
            if (obj.has("allergens_from_user"))
                product.allergensFromUser = obj.getString("allergens_from_user");
            if (obj.has("allergens_hierarchy"))
                product.allergensHierarchy = new ArrayList<>((Collection) obj.getJSONArray("allergens_hierarchy"));
            if (obj.has("allergens_lc"))
                product.allergensLc = obj.getString("allergens_lc");
            if (obj.has("allergens_tags"))
                product.allergensTags = new ArrayList<>((Collection) obj.getJSONArray("allergens_tags"));
            if (obj.has("amino_acids_prev_tags"))
                product.aminoAcidsPrevTags = new ArrayList<>((Collection) obj.getJSONArray("amino_acids_prev_tags"));
            if (obj.has("amino_acids_tags"))
                product.aminoAcidsTags = new ArrayList<>((Collection) obj.getJSONArray("amino_acids_tags"));
            if (obj.has("brands"))
                product.brands = obj.getString("brands");
            if (obj.has("brands_debug_tags"))
                product.brandsDebugTags = new ArrayList<>((Collection) obj.getJSONArray("brands_debug_tags"));
            if (obj.has("brands_tags"))
                product.brandsTags = new ArrayList<>((Collection) obj.getJSONArray("brands_tags"));
            if (obj.has("carbon_footprint_percent_of_known_ingredients"))
                product.carbonFootprintPercentOfKnownIngredients = obj.getString("carbon_footprint_percent_of_known_ingredients");
            if (obj.has("carbon_footprint_from_known_ingredients_debug"))
                product.carbonFootprintFromKnownIngredientsDebug = obj.getString("carbon_footprint_from_known_ingredients_debug");
            if (obj.has("categories"))
                product.categories = obj.getString("categories");
            if (obj.has("categories_hierarchy"))
                product.categoriesHierarchy = new ArrayList<>((Collection) obj.getJSONArray("categories_hierarchy"));
            if (obj.has("categories_lc"))
                product.categoriesLc = obj.getString("categories_lc");
            if (obj.has("categories_properties_tags"))
                product.categoriesPropertiesTags = new ArrayList<>((Collection) obj.getJSONArray("categories_properties_tags"));
            if (obj.has("categories_tags"))
                product.categoriesTags = new ArrayList<>((Collection) obj.getJSONArray("categories_tags"));
            if (obj.has("checkers_tags"))
                product.checkersTags = new ArrayList<>((Collection) obj.getJSONArray("checkers_tags"));
            if (obj.has("cities_tags"))
                product.citiesTags = new ArrayList<>((Collection) obj.getJSONArray("cities_tags"));
            if (obj.has("code"))
                product.code = obj.getString("code");
            if (obj.has("codes_tags"))
                product.codesTags = new ArrayList<>((Collection) obj.getJSONArray("codes_tags"));
            if (obj.has("compared_to_category"))
                product.comparedToCategory = obj.getString("compared_to_category");
            if (obj.has("complete"))
                product.complete = obj.getInt("complete");
            if (obj.has("completed_t"))
                product.completedT = obj.getLong("completed_t");
            if (obj.has("completeness"))
                product.completeness = Float.parseFloat(obj.getString("completeness"));
            if (obj.has("conservation_conditions"))
                product.conservationConditions = obj.getString("conservation_conditions");
            if (obj.has("countries"))
                product.countries = obj.getString("countries");
            if (obj.has("countries_hierarchy"))
                product.countriesHierarchy = new ArrayList<>((Collection) obj.getJSONArray("countries_hierarchy"));
            if (obj.has("countries_lc"))
                product.countriesLc = obj.getString("countries_lc");
            if (obj.has("countries_debug_tags"))
                product.countriesDebugTags = new ArrayList<>((Collection) obj.getJSONArray("countries_debug_tags"));
            if (obj.has("countries_tags"))
                product.countriesTags = new ArrayList<>((Collection) obj.getJSONArray("countries_tags"));
            if (obj.has("correctors_tags"))
                product.correctorsTags = new ArrayList<>((Collection) obj.getJSONArray("correctors_tags"));
            if (obj.has("created_t"))
                product.createdT = obj.getLong("created_t");
            if (obj.has("creator"))
                product.creator = obj.getString("creator");
            if (obj.has("data_quality_bugs_tags"))
                product.dataQualityBugsTags = new ArrayList<>((Collection) obj.getJSONArray("data_quality_bugs_tags"));
            if (obj.has("data_quality_errors_tags"))
                product.dataQualityErrorsTags = new ArrayList<>((Collection) obj.getJSONArray("data_quality_errors_tags"));
            if (obj.has("data_quality_info_tags"))
                product.dataQualityInfoTags = new ArrayList<>((Collection) obj.getJSONArray("data_quality_info_tags"));
            if (obj.has("data_quality_tags"))
                product.dataQualityTags = new ArrayList<>((Collection) obj.getJSONArray("data_quality_tags"));
            if (obj.has("data_quality_warnings_tags"))
                product.dataQualityWarningsTags = new ArrayList<>((Collection) obj.getJSONArray("data_quality_warnings_tags"));
            if (obj.has("data_sources"))
                product.dataSources = obj.getString("data_sources");
            if (obj.has("data_sources_tags"))
                product.dataSourcesTags = new ArrayList<>((Collection) obj.getJSONArray("data_sources_tags"));
            if (obj.has("debug_param_sorted_langs"))
                product.debugParamSortedLangs = new ArrayList<>((Collection) obj.getJSONArray("debug_param_sorted_langs"));
            if (obj.has("editors_tags"))
                product.editorsTags = new ArrayList<>((Collection) obj.getJSONArray("editors_tags"));
            if (obj.has("emb_codes"))
                product.embCodes = obj.getString("emb_codes");
            if (obj.has("emb_codes_debug_tags"))
                product.embCodesDebugTags = new ArrayList<>((Collection) obj.getJSONArray("emb_codes_debug_tags"));
            if (obj.has("emb_codes_orig"))
                product.embCodesOrig = obj.getString("emb_codes_orig");
            if (obj.has("emb_codes_tags"))
                product.embCodesTags = new ArrayList<>((Collection) obj.getJSONArray("emb_codes_tags"));
            if (obj.has("entry_dates_tags"))
                product.entryDatesTags = new ArrayList<>((Collection) obj.getJSONArray("entry_dates_tags"));
            if (obj.has("expiration_date"))
                product.expirationDate = obj.getString("expiration_date");
            if (obj.has("expiration_date_debug_tags"))
                product.expirationDateDebugTags = new ArrayList<>((Collection) obj.getJSONArray("expiration_date_debug_tags"));
            if (obj.has("fruits-vegetables-nuts_100g_estimate"))
                product.fruitsVegetablesNuts100GEstimate = obj.getInt("fruits-vegetables-nuts_100g_estimate");
            if (obj.has("generic_name"))
                product.genericName = obj.getString("generic_name");
            if (obj.has("id"))
                product.id = obj.getString("id");
            if (obj.has("_id"))
                product._id = obj.getString("_id");
            if (obj.has("image_front_small_url"))
                product.imageFrontSmallUrl = obj.getString("image_front_small_url");
            if (obj.has("image_front_thumb_url"))
                product.imageFrontThumbUrl = obj.getString("image_front_thumb_url");
            if (obj.has("image_front_url"))
                product.imageFrontUrl = obj.getString("image_front_url");
            if (obj.has("image_ingredients_url"))
                product.imageIngredientsUrl = obj.getString("image_ingredients_url");
            if (obj.has("image_ingredients_small_url"))
                product.imageIngredientsSmallUrl = obj.getString("image_ingredients_small_url");
            if (obj.has("image_ingredients_thumb_url"))
                product.imageIngredientsThumbUrl = obj.getString("image_ingredients_thumb_url");
            if (obj.has("image_nutrition_small_url"))
                product.imageNutritionSmallUrl = obj.getString("image_nutrition_small_url");
            if (obj.has("image_nutrition_thumb_url"))
                product.imageNutritionThumbUrl = obj.getString("image_nutrition_thumb_url");
            if (obj.has("image_nutrition_url"))
                product.imageNutritionUrl = obj.getString("image_nutrition_url");
            if (obj.has("image_small_url"))
                product.imageSmallUrl = obj.getString("image_small_url");
            if (obj.has("image_thumb_url"))
                product.imageThumbUrl = obj.getString("image_thumb_url");
            if (obj.has("image_url"))
                product.imageUrl = obj.getString("image_url");
            if (obj.has("informers_tags"))
                product.informersTags = new ArrayList<>((Collection) obj.getJSONArray("informers_tags"));
            if (obj.has("ingredients_analysis_tags"))
                product.ingredientsAnalysisTags = new ArrayList<>((Collection) obj.getJSONArray("ingredients_analysis_tags"));
            if (obj.has("ingredients_debug"))
                product.ingredientsDebug = new ArrayList<>((Collection) obj.getJSONArray("ingredients_debug"));
            if (obj.has("ingredients_from_or_that_may_be_from_palm_oil_n"))
                product.ingredientsFromOrThatMayBeFromPalmOilN = obj.getInt("ingredients_from_or_that_may_be_from_palm_oil_n");
            if (obj.has("ingredients_from_palm_oil_tags"))
                product.ingredientsFromPalmOilTags = new ArrayList<>((Collection) obj.getJSONArray("ingredients_from_palm_oil_tags"));
            if (obj.has("ingredients_from_palm_oil_n"))
                product.ingredientsFromPalmOilN = obj.getInt("ingredients_from_palm_oil_n");
            if (obj.has("ingredients_hierarchy"))
                product.ingredientsHierarchy = new ArrayList<>((Collection) obj.getJSONArray("ingredients_hierarchy"));
            if (obj.has("ingredients_ids_debug"))
                product.ingredientsIdsDebug = new ArrayList<>((Collection) obj.getJSONArray("ingredients_ids_debug"));
            if (obj.has("ingredients_n"))
                product.ingredientsN = obj.getInt("ingredients_n");
            if (obj.has("ingredients_n_tags"))
                product.ingredientsNTags = new ArrayList<>((Collection) obj.getJSONArray("ingredients_n_tags"));
            if (obj.has("ingredients_original_tags"))
                product.ingredientsOriginalTags = new ArrayList<>((Collection) obj.getJSONArray("ingredients_original_tags"));
            if (obj.has("ingredients_tags"))
                product.ingredientsTags = new ArrayList<>((Collection) obj.getJSONArray("ingredients_tags"));
            if (obj.has("ingredients_text"))
                product.ingredientsText = obj.getString("ingredients_text");
            if (obj.has("ingredients_text_debug"))
                product.ingredientsTextDebug = obj.getString("ingredients_text_debug");
            if (obj.has("ingredients_text_with_allergens"))
                product.ingredientsTextWithAllergens = obj.getString("ingredients_text_with_allergens");
            if (obj.has("ingredients_that_may_be_from_palm_oil_n"))
                product.ingredientsThatMayBeFromPalmOilN = obj.getInt("ingredients_that_may_be_from_palm_oil_n");
            if (obj.has("ingredients_that_may_be_from_palm_oil_tags"))
                product.ingredientsThatMayBeFromPalmOilTags = new ArrayList<>((Collection) obj.getJSONArray("ingredients_that_may_be_from_palm_oil_tags"));
            if (obj.has("interface_version_created"))
                product.interfaceVersionCreated = obj.getString("interface_version_created");
            if (obj.has("interface_version_modified"))
                product.interfaceVersionModified = obj.getString("interface_version_modified");
            if (obj.has("_keywords"))
                product.keywords = new ArrayList<>((Collection) obj.getJSONArray("_keywords"));
            if (obj.has("known_ingredients_n"))
                product.knownIngredientsN = obj.getInt("known_ingredients_n");
            if (obj.has("labels"))
                product.labels = obj.getString("labels");
            if (obj.has("labels_hierarchy"))
                product.labelsHierarchy = new ArrayList<>((Collection) obj.getJSONArray("labels_hierarchy"));
            if (obj.has("labels_lc"))
                product.labelsLc = obj.getString("labels_lc");
            if (obj.has("labels_prev_hierarchy"))
                product.labelsPrevHierarchy = new ArrayList<>((Collection) obj.getJSONArray("labels_prev_hierarchy"));
            if (obj.has("labels_prev_tags"))
                product.labelsPrevTags = new ArrayList<>((Collection) obj.getJSONArray("labels_prev_tags"));
            if (obj.has("labels_tags"))
                product.labelsTags = new ArrayList<>((Collection) obj.getJSONArray("labels_tags"));
            if (obj.has("labels_debug_tags"))
                product.labelsDebugTags = new ArrayList<>((Collection) obj.getJSONArray("labels_debug_tags"));
            if (obj.has("lang"))
                product.lang = obj.getString("lang");
            if (obj.has("lang_debug_tags"))
                product.langDebugTags = new ArrayList<>((Collection) obj.getJSONArray("lang_debug_tags"));
            if (obj.has("languages_hierarchy"))
                product.languagesHierarchy = new ArrayList<>((Collection) obj.getJSONArray("languages_hierarchy"));
            if (obj.has("languages_tags"))
                product.languagesTags = new ArrayList<>((Collection) obj.getJSONArray("languages_tags"));
            if (obj.has("last_edit_dates_tags"))
                product.lastEditDatesTags = new ArrayList<>((Collection) obj.getJSONArray("last_edit_dates_tags"));
            if (obj.has("last_editor"))
                product.lastEditor = obj.getString("last_editor");
            if (obj.has("last_image_dates_tags"))
                product.lastImageDatesTags = new ArrayList<>((Collection) obj.getJSONArray("last_image_dates_tags"));
            if (obj.has("last_image_t"))
                product.lastImageT = obj.getLong("last_image_t");
            if (obj.has("last_modified_by"))
                product.lastModifiedBy = obj.getString("last_modified_by");
            if (obj.has("last_modified_t"))
                product.lastModifiedT = obj.getLong("last_modified_t");
            if (obj.has("lc"))
                product.lc = obj.getString("lc");
            if (obj.has("link"))
                product.link = obj.getString("link");
            if (obj.has("link_debug_tags"))
                product.linkDebugTags = new ArrayList<>((Collection) obj.getJSONArray("link_debug_tags"));
            if (obj.has("manufacturing_places"))
                product.manufacturingPlaces = obj.getString("manufacturing_places");
            if (obj.has("manufacturing_places_debug_tags"))
                product.manufacturingPlacesDebugTags = new ArrayList<>((Collection) obj.getJSONArray("manufacturing_places_debug_tags"));
            if (obj.has("manufacturing_places_tags"))
                product.manufacturingPlacesTags = new ArrayList<>((Collection) obj.getJSONArray("manufacturing_places_tags"));
            if (obj.has("max_imgid"))
                product.maxImgid = obj.getString("max_imgid");
            if (obj.has("minerals_prev_tags"))
                product.mineralsPrevTags = new ArrayList<>((Collection) obj.getJSONArray("minerals_prev_tags"));
            if (obj.has("minerals_tags"))
                product.mineralsTags = new ArrayList<>((Collection) obj.getJSONArray("minerals_tags"));
            if (obj.has("misc_tags"))
                product.miscTags = new ArrayList<>((Collection) obj.getJSONArray("misc_tags"));
            if (obj.has("net_weight_unit"))
                product.netWeightUnit = obj.getString("net_weight_unit");
            if (obj.has("net_weight_value"))
                product.netWeightValue = obj.getString("net_weight_value");
            if (obj.has("nutrition_data_per"))
                product.nutritionDataPer = obj.getString("nutrition_data_per");
            if (obj.has("nutrition_score_warning_no_fruits_vegetables_nuts"))
                product.nutritionScoreWarningNoFruitsVegetablesNuts = obj.getInt("nutrition_score_warning_no_fruits_vegetables_nuts");
            if (obj.has("no_nutrition_data"))
                product.noNutritionData = obj.getString("no_nutrition_data");
            if (obj.has("nova_group"))
                product.novaGroup = obj.getString("nova_group");
            if (obj.has("nova_groups"))
                product.novaGroups = obj.getString("nova_groups");
            if (obj.has("nova_group_debug"))
                product.novaGroupDebug = obj.getString("nova_group_debug");
            if (obj.has("nova_group_tags"))
                product.novaGroupTags = new ArrayList<>((Collection) obj.getJSONArray("nova_group_tags"));
            if (obj.has("nova_groups_tags"))
                product.novaGroupsTags = new ArrayList<>((Collection) obj.getJSONArray("nova_groups_tags"));
            if (obj.has("nucleotides_prev_tags"))
                product.nucleotidesPrevTags = new ArrayList<>((Collection) obj.getJSONArray("nucleotides_prev_tags"));
            if (obj.has("nucleotides_tags"))
                product.nucleotidesTags = new ArrayList<>((Collection) obj.getJSONArray("nucleotides_tags"));
            if (obj.has("nutrient_levels_tags"))
                product.nutrientLevelsTags = new ArrayList<>((Collection) obj.getJSONArray("nutrient_levels_tags"));
            if (obj.has("nutrition_data"))
                product.nutritionData = obj.getString("nutrition_data");
            if (obj.has("nutrition_data_per_debug_tags"))
                product.nutritionDataPerDebugTags = new ArrayList<>((Collection) obj.getJSONArray("nutrition_data_per_debug_tags"));
            if (obj.has("nutrition_data_prepared"))
                product.nutritionDataPrepared = obj.getString("nutrition_data_prepared");
            if (obj.has("nutrition_data_prepared_per"))
                product.nutritionDataPreparedPer = obj.getString("nutrition_data_prepared_per");
            if (obj.has("nutrition_grades"))
                product.nutritionGrades = obj.getString("nutrition_grades");
            if (obj.has("nutrition_score_beverage"))
                product.nutritionScoreBeverage = obj.getInt("nutrition_score_beverage");
            if (obj.has("nutrition_score_debug"))
                product.nutritionScoreDebug = obj.getString("nutrition_score_debug");
            if (obj.has("nutrition_score_warning_no_fiber"))
                product.nutritionScoreWarningNoFiber = obj.getInt("nutrition_score_warning_no_fiber");
            if (obj.has("nutrition_grades_tags"))
                product.nutritionGradesTags = new ArrayList<>((Collection) obj.getJSONArray("nutrition_grades_tags"));
            if (obj.has("origins"))
                product.origins = obj.getString("origins");
            if (obj.has("origins_debug_tags"))
                product.originsDebugTags = new ArrayList<>((Collection) obj.getJSONArray("origins_debug_tags"));
            if (obj.has("origins_tags"))
                product.originsTags = new ArrayList<>((Collection) obj.getJSONArray("origins_tags"));
            if (obj.has("other_information"))
                product.otherInformation = obj.getString("other_information");
            if (obj.has("other_nutritional_substances_tags"))
                product.otherNutritionalSubstancesTags = new ArrayList<>((Collection) obj.getJSONArray("other_nutritional_substances_tags"));
            if (obj.has("packaging"))
                product.packaging = obj.getString("packaging");
            if (obj.has("packaging_debug_tags"))
                product.packagingDebugTags = new ArrayList<>((Collection) obj.getJSONArray("packaging_debug_tags"));
            if (obj.has("packaging_tags"))
                product.packagingTags = new ArrayList<>((Collection) obj.getJSONArray("packaging_tags"));
            if (obj.has("photographers_tags"))
                product.photographersTags = new ArrayList<>((Collection) obj.getJSONArray("photographers_tags"));
            if (obj.has("pnns_groups_1"))
                product.pnnsGroups1 = obj.getString("pnns_groups_1");
            if (obj.has("pnns_groups_2"))
                product.pnnsGroups2 = obj.getString("pnns_groups_2");
            if (obj.has("pnns_groups_1_tags"))
                product.pnnsGroups1Tags = new ArrayList<>((Collection) obj.getJSONArray("pnns_groups_1_tags"));
            if (obj.has("pnns_groups_2_tags"))
                product.pnnsGroups2Tags = new ArrayList<>((Collection) obj.getJSONArray("pnns_groups_2_tags"));
            if (obj.has("popularity_key"))
                product.popularityKey = obj.getLong("popularity_key");
            if (obj.has("producer_version_id"))
                product.producerVersionId = obj.getString("producer_version_id");
            if (obj.has("product_name"))
                product.productName = obj.getString("product_name");
            if (obj.has("product_quantity"))
                product.productQuantity = obj.getString("product_quantity");
            if (obj.has("purchase_places"))
                product.purchasePlaces = obj.getString("purchase_places");
            if (obj.has("purchase_places_debug_tags"))
                product.purchasePlacesDebugTags = new ArrayList<>((Collection) obj.getJSONArray("purchase_places_debug_tags"));
            if (obj.has("purchase_places_tags"))
                product.purchasePlacesTags = new ArrayList<>((Collection) obj.getJSONArray("purchase_places_tags"));
            if (obj.has("quality_tags"))
                product.qualityTags = new ArrayList<>((Collection) obj.getJSONArray("quality_tags"));
            if (obj.has("quantity"))
                product.quantity = obj.getString("quantity");
            if (obj.has("quantity_debug_tags"))
                product.quantityDebugTags = new ArrayList<>((Collection) obj.getJSONArray("quantity_debug_tags"));
            if (obj.has("recycling_instructions_to_discard"))
                product.recyclingInstructionsToDiscard = obj.getString("recycling_instructions_to_discard");
            if (obj.has("rev"))
                product.rev = obj.getInt("rev");
            if (obj.has("serving_quantity"))
                product.servingQuantity = obj.getString("serving_quantity");
            if (obj.has("serving_size"))
                product.servingSize = obj.getString("serving_size");
            if (obj.has("serving_size_debug_tags"))
                product.servingSizeDebugTags = new ArrayList<>((Collection) obj.getJSONArray("serving_size_debug_tags"));
            if (obj.has("sortkey"))
                product.sortkey = obj.getLong("sortkey");
            if (obj.has("states"))
                product.states = obj.getString("states");
            if (obj.has("states_hierarchy"))
                product.statesHierarchy = new ArrayList<>((Collection) obj.getJSONArray("states_hierarchy"));
            if (obj.has("states_tags"))
                product.statesTags = new ArrayList<>((Collection) obj.getJSONArray("states_tags"));
            if (obj.has("stores"))
                product.stores = obj.getString("stores");
            if (obj.has("stores_debug_tags"))
                product.storesDebugTags = new ArrayList<>((Collection) obj.getJSONArray("stores_debug_tags"));
            if (obj.has("stores_tags"))
                product.storesTags = new ArrayList<>((Collection) obj.getJSONArray("stores_tags"));
            if (obj.has("traces"))
                product.traces = obj.getString("traces");
            if (obj.has("traces_from_ingredients"))
                product.tracesFromIngredients = obj.getString("traces_from_ingredients");
            if (obj.has("traces_hierarchy"))
                product.tracesHierarchy = new ArrayList<>((Collection) obj.getJSONArray("traces_hierarchy"));
            if (obj.has("traces_debug_tags"))
                product.tracesDebugTags = new ArrayList<>((Collection) obj.getJSONArray("traces_debug_tags"));
            if (obj.has("traces_from_user"))
                product.tracesFromUser = obj.getString("traces_from_user");
            if (obj.has("traces_lc"))
                product.tracesLc = obj.getString("traces_lc");
            if (obj.has("traces_tags"))
                product.tracesTags = new ArrayList<>((Collection) obj.getJSONArray("traces_tags"));
            if (obj.has("unknown_ingredients_n"))
                product.unknownIngredientsN = obj.getInt("unknown_ingredients_n");
            if (obj.has("unknown_nutrients_tags"))
                product.unknownNutrientsTags = new ArrayList<>((Collection) obj.getJSONArray("unknown_nutrients_tags"));
            if (obj.has("update_key"))
                product.updateKey = obj.getString("update_key");
            if (obj.has("vitamins_prev_tags"))
                product.vitaminsPrevTags = new ArrayList<>((Collection) obj.getJSONArray("vitamins_prev_tags"));
            if (obj.has("vitamins_tags"))
                product.vitaminsTags = new ArrayList<>((Collection) obj.getJSONArray("vitamins_tags"));
        } catch (JSONException e) {
            String error = "";
        }
        return product;

    }
}
