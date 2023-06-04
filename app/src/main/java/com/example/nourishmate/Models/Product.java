package com.example.nourishmate.Models;

import com.example.nourishmate.DatabaseHelper.DatabaseManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collection;
@DatabaseTable
public class Product {

    @DatabaseField(generatedId = true)
    private int primayKey;
    private Images images;
    @ForeignCollectionField(eager = true)
    private Collection<Ingredient> ingredients;
    @DatabaseField(canBeNull = false, foreign = true, foreignColumnName = "id", foreignAutoCreate = true)
    private LanguagesCodes languagesCodes;
    @DatabaseField(canBeNull = false, foreign = true, foreignColumnName = "id", foreignAutoCreate = true)
    private NutrientLevels nutrientLevels;
    @DatabaseField(canBeNull = false, foreign = true, foreignColumnName = "id", foreignAutoCreate = true)
    private Nutriments nutriments;
    private SelectedImages selectedImages;
    private Collection<Source> sources;
    @DatabaseField
    private int additivesN;
    @DatabaseField
    private int additivesOldN;
    @DatabaseField
    private Collection<AdditivesOriginalTags> additivesOriginalTags;
    @DatabaseField
    private Collection<AdditivesOldTags> additivesOldTags;
    @DatabaseField
    private Collection<AdditivesPrevOriginalTags> additivesPrevOriginalTags;
    @DatabaseField
    private Collection<AdditivesDebugTags> additivesDebugTags;
    @DatabaseField
    private Collection<AdditivesTags> additivesTags;
    @DatabaseField
    private String allergens;
    @DatabaseField
    private String allergensFromIngredients;
    @DatabaseField
    private String allergensFromUser;
    @DatabaseField
    private Collection<AllergensHierarchy> allergensHierarchy;
    @DatabaseField
    private String allergensLc;
    @DatabaseField
    private Collection<AllergensTags> allergensTags;
    @DatabaseField
    private Collection<AminoAcidsPrevTags> aminoAcidsPrevTags;
    @DatabaseField
    private Collection<AminoAcidsTags> aminoAcidsTags;
    @DatabaseField
    private String brands;
    @DatabaseField
    private Collection<BrandsDebugTags> brandsDebugTags;
    @DatabaseField
    private Collection<BrandsTags> brandsTags;
    @DatabaseField
    private String carbonFootprintPercentOfKnownIngredients;
    @DatabaseField
    private String carbonFootprintFromKnownIngredientsDebug;
    @DatabaseField
    private String categories;
    @DatabaseField
    private Collection<CategoriesHierarchy> categoriesHierarchy;
    @DatabaseField
    private String categoriesLc;
    @DatabaseField
    private Collection<CategoriesPropertiesTags> categoriesPropertiesTags;
    @DatabaseField
    private Collection<CategoriesTags> categoriesTags;
    @DatabaseField
    private Collection<CheckersTags> checkersTags;
    @DatabaseField
    private Collection<CitiesTags> citiesTags;
    @DatabaseField
    private String code;
    @DatabaseField
    private Collection<CodesTags> codesTags;
    @DatabaseField
    private String comparedToCategory;
    @DatabaseField
    private int complete;
    @DatabaseField
    private long completedT;
    @DatabaseField
    private float completeness;
    @DatabaseField
    private String conservationConditions;
    @DatabaseField
    private String countries;
    @DatabaseField
    private Collection<CountriesHierarchy> countriesHierarchy;
    @DatabaseField
    private String countriesLc;
    @DatabaseField
    private Collection<CountriesDebugTags> countriesDebugTags;
    @DatabaseField
    private Collection<CountriesTags> countriesTags;
    @DatabaseField
    private Collection<CorrectorsTags> correctorsTags;
    @DatabaseField
    private long createdT;
    @DatabaseField
    private String creator;
    @DatabaseField
    private Collection<DataQualityBugsTags> dataQualityBugsTags;
    @DatabaseField
    private Collection<DataQualityErrorsTags> dataQualityErrorsTags;
    @DatabaseField
    private Collection<DataQualityInfoTags> dataQualityInfoTags;
    @DatabaseField
    private Collection<DataQualityTags> dataQualityTags;
    @DatabaseField
    private Collection<DataQualityWarningsTags> dataQualityWarningsTags;
    @DatabaseField
    private String dataSources;
    @DatabaseField
    private Collection<DataSourcesTags> dataSourcesTags;
    @DatabaseField
    private Collection<DebugParamSortedLangs> debugParamSortedLangs;
    @DatabaseField
    private Collection<EditorsTags> editorsTags;
    @DatabaseField
    private String embCodes;
    @DatabaseField
    private Collection<EmbCodesDebugTags> embCodesDebugTags;
    @DatabaseField
    private String embCodesOrig;
    @DatabaseField
    private Collection<EmbCodesTags> embCodesTags;
    @DatabaseField
    private Collection<EntryDatesTags> entryDatesTags;
    @DatabaseField
    private String expirationDate;
    @DatabaseField
    private Collection<ExpirationDateDebugTags> expirationDateDebugTags;
    @DatabaseField
    private int fruitsVegetablesNuts100GEstimate;
    @DatabaseField
    private String genericName;
    @DatabaseField
    private String id;
    @DatabaseField
    private String _id;
    @DatabaseField
    private String imageFrontSmallUrl;
    @DatabaseField
    private String imageFrontThumbUrl;
    @DatabaseField
    private String imageFrontUrl;
    @DatabaseField
    private String imageIngredientsUrl;
    @DatabaseField
    private String imageIngredientsSmallUrl;
    @DatabaseField
    private String imageIngredientsThumbUrl;
    @DatabaseField
    private String imageNutritionSmallUrl;
    @DatabaseField
    private String imageNutritionThumbUrl;
    @DatabaseField
    private String imageNutritionUrl;
    @DatabaseField
    private String imageSmallUrl;
    @DatabaseField
    private String imageThumbUrl;
    @DatabaseField
    private String imageUrl;
    @DatabaseField
    private Collection<InformersTags> informersTags;
    @DatabaseField
    private Collection<IngredientsAnalysisTags> ingredientsAnalysisTags;
    @DatabaseField
    private Collection<IngredientsDebug> ingredientsDebug;
    @DatabaseField
    private int ingredientsFromOrThatMayBeFromPalmOilN;
    @DatabaseField
    private Collection<IngredientsFromPalmOilTags> ingredientsFromPalmOilTags;
    @DatabaseField
    private int ingredientsFromPalmOilN;
    @DatabaseField
    private Collection<IngredientsHierarchy> ingredientsHierarchy;
    @DatabaseField
    private Collection<IngredientsIdsDebug> ingredientsIdsDebug;
    @DatabaseField
    private int ingredientsN;
    @DatabaseField
    private Collection<IngredientsNTags> ingredientsNTags;
    @DatabaseField
    private Collection<IngredientsOriginalTags> ingredientsOriginalTags;
    @DatabaseField
    private Collection<IngredientsTags> ingredientsTags;
    @DatabaseField
    private String ingredientsText;
    @DatabaseField
    private String ingredientsTextDebug;
    @DatabaseField
    private String ingredientsTextWithAllergens;
    @DatabaseField
    private int ingredientsThatMayBeFromPalmOilN;
    @DatabaseField
    private Collection<IngredientsThatMayBeFromPalmOilTags> ingredientsThatMayBeFromPalmOilTags;
    @DatabaseField
    private String interfaceVersionCreated;
    @DatabaseField
    private String interfaceVersionModified;
    @DatabaseField
    private Collection<Keywords> keywords;
    @DatabaseField
    private int knownIngredientsN;
    @DatabaseField
    private String labels;
    @DatabaseField
    private Collection<LabelsHierarchy> labelsHierarchy;
    @DatabaseField
    private String labelsLc;
    @DatabaseField
    private Collection<LabelsPrevHierarchy> labelsPrevHierarchy;
    @DatabaseField
    private Collection<LabelsPrevTags> labelsPrevTags;
    @DatabaseField
    private Collection<LabelsTags> labelsTags;
    @DatabaseField
    private Collection<LabelsDebugTags> labelsDebugTags;
    @DatabaseField
    private String lang;
    @DatabaseField
    private Collection<LangDebugTags> langDebugTags;
    @DatabaseField
    private Collection<LanguagesHierarchy> languagesHierarchy;
    @DatabaseField
    private Collection<LanguagesTags> languagesTags;
    @DatabaseField
    private Collection<LastEditDatesTags> lastEditDatesTags;
    @DatabaseField
    private String lastEditor;
    @DatabaseField
    private Collection<LastImageDatesTags> lastImageDatesTags;
    @DatabaseField
    private long lastImageT;
    @DatabaseField
    private String lastModifiedBy;
    @DatabaseField
    private long lastModifiedT;
    @DatabaseField
    private String lc;
    @DatabaseField
    private String link;
    @DatabaseField
    private Collection<LinkDebugTags> linkDebugTags;
    @DatabaseField
    private String manufacturingPlaces;
    @DatabaseField
    private Collection<ManufacturingPlacesDebugTags> manufacturingPlacesDebugTags;
    @DatabaseField
    private Collection<ManufacturingPlacesTags> manufacturingPlacesTags;
    @DatabaseField
    private String maxImgid;
    @DatabaseField
    private Collection<MineralsPrevTags> mineralsPrevTags;
    @DatabaseField
    private Collection<MineralsTags> mineralsTags;
    @DatabaseField
    private Collection<MiscTags> miscTags;
    @DatabaseField
    private String netWeightUnit;
    @DatabaseField
    private String netWeightValue;
    @DatabaseField
    private String nutritionDataPer;
    @DatabaseField
    private int nutritionScoreWarningNoFruitsVegetablesNuts;
    @DatabaseField
    private String noNutritionData;
    @DatabaseField
    private String novaGroup;
    @DatabaseField
    private String novaGroups;
    @DatabaseField
    private String novaGroupDebug;
    @DatabaseField
    private Collection<NovaGroupTags> novaGroupTags;
    @DatabaseField
    private Collection<NovaGroupsTags> novaGroupsTags;
    @DatabaseField
    private Collection<NucleotidesPrevTags> nucleotidesPrevTags;
    @DatabaseField
    private Collection<NucleotidesTags> nucleotidesTags;
    @DatabaseField
    private Collection<NutrientLevelsTags> nutrientLevelsTags;
    @DatabaseField
    private String nutritionData;
    @DatabaseField
    private Collection<NutritionDataPerDebugTags> nutritionDataPerDebugTags;
    @DatabaseField
    private String nutritionDataPrepared;
    @DatabaseField
    private String nutritionDataPreparedPer;
    @DatabaseField
    private String nutritionGrades;
    @DatabaseField
    private int nutritionScoreBeverage;
    @DatabaseField
    private String nutritionScoreDebug;
    @DatabaseField
    private int nutritionScoreWarningNoFiber;
    @DatabaseField
    private Collection<NutritionGradesTags> nutritionGradesTags;
    @DatabaseField
    private String origins;
    @DatabaseField
    private Collection<OriginsDebugTags> originsDebugTags;
    @DatabaseField
    private Collection<OriginsTags> originsTags;
    @DatabaseField
    private String otherInformation;
    @DatabaseField
    private Collection<OtherNutritionalSubstancesTags> otherNutritionalSubstancesTags;
    @DatabaseField
    private String packaging;
    @DatabaseField
    private Collection<PackagingDebugTags> packagingDebugTags;
    @DatabaseField
    private Collection<PackagingTags> packagingTags;
    @DatabaseField
    private Collection<PhotographersTags> photographersTags;
    @DatabaseField
    private String pnnsGroups1;
    @DatabaseField
    private String pnnsGroups2;
    @DatabaseField
    private Collection<PnnsGroups1Tags> pnnsGroups1Tags;
    @DatabaseField
    private Collection<PnnsGroups2Tags> pnnsGroups2Tags;
    @DatabaseField
    private long popularityKey;
    @DatabaseField
    private String producerVersionId;
    @DatabaseField
    private String productName;
    @DatabaseField
    private String productQuantity;
    @DatabaseField
    private String purchasePlaces;
    @DatabaseField
    private Collection<PurchasePlacesDebugTags> purchasePlacesDebugTags;
    @DatabaseField
    private Collection<PurchasePlacesTags> purchasePlacesTags;
    @DatabaseField
    private Collection<QualityTags> qualityTags;
    @DatabaseField
    private String quantity;
    @DatabaseField
    private Collection<QuantityDebugTags> quantityDebugTags;
    @DatabaseField
    private String recyclingInstructionsToDiscard;
    @DatabaseField
    private int rev;
    @DatabaseField
    private String servingQuantity;
    @DatabaseField
    private String servingSize;
    @DatabaseField
    private Collection<ServingSizeDebugTags> servingSizeDebugTags;
    @DatabaseField
    private long sortkey;
    @DatabaseField
    private String states;
    @DatabaseField
    private Collection<StatesHierarchy> statesHierarchy;
    @DatabaseField
    private Collection<StatesTags> statesTags;
    @DatabaseField
    private String stores;
    @DatabaseField
    private Collection<StoresDebugTags> storesDebugTags;
    @DatabaseField
    private Collection<StoresTags> storesTags;
    @DatabaseField
    private String traces;
    @DatabaseField
    private String tracesFromIngredients;
    @DatabaseField
    private Collection<TracesHierarchy> tracesHierarchy;
    @DatabaseField
    private Collection<TracesDebugTags> tracesDebugTags;
    @DatabaseField
    private String tracesFromUser;
    @DatabaseField
    private String tracesLc;
    @DatabaseField
    private Collection<TracesTags> tracesTags;
    @DatabaseField
    private int unknownIngredientsN;
    @DatabaseField
    private Collection<UnknownNutrientsTags> unknownNutrientsTags;
    @DatabaseField
    private String updateKey;
    @DatabaseField
    private Collection<VitaminsPrevTags> vitaminsPrevTags;
    @DatabaseField
    private Collection<VitaminsTags> vitaminsTags;
    @DatabaseField( canBeNull = false, foreign = true, foreignColumnName = "id", foreignAutoCreate = true )
    private User user;

    public int getPrimayKey() {
        return primayKey;
    }

    public void setPrimayKey(int primayKey) {
        this.primayKey = primayKey;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public LanguagesCodes getLanguagesCodes() {
        return languagesCodes;
    }

    public void setLanguagesCodes(LanguagesCodes languagesCodes) {
        this.languagesCodes = languagesCodes;
    }

    public NutrientLevels getNutrientLevels() {
        return nutrientLevels;
    }

    public void setNutrientLevels(NutrientLevels nutrientLevels) {
        this.nutrientLevels = nutrientLevels;
    }

    public Nutriments getNutriments() {
        return nutriments;
    }

    public void setNutriments(Nutriments nutriments) {
        this.nutriments = nutriments;
    }

    public SelectedImages getSelectedImages() {
        return selectedImages;
    }

    public void setSelectedImages(SelectedImages selectedImages) {
        this.selectedImages = selectedImages;
    }

    public Collection<Source> getSources() {
        return sources;
    }

    public void setSources(Collection<Source> sources) {
        this.sources = sources;
    }

    public int getAdditivesN() {
        return additivesN;
    }

    public void setAdditivesN(int additivesN) {
        this.additivesN = additivesN;
    }

    public int getAdditivesOldN() {
        return additivesOldN;
    }

    public void setAdditivesOldN(int additivesOldN) {
        this.additivesOldN = additivesOldN;
    }

    public Collection<AdditivesOriginalTags> getAdditivesOriginalTags() {
        return additivesOriginalTags;
    }

    public void setAdditivesOriginalTags(Collection<AdditivesOriginalTags> additivesOriginalTags) {
        this.additivesOriginalTags = additivesOriginalTags;
    }

    public Collection<AdditivesOldTags> getAdditivesOldTags() {
        return additivesOldTags;
    }

    public void setAdditivesOldTags(Collection<AdditivesOldTags> additivesOldTags) {
        this.additivesOldTags = additivesOldTags;
    }

    public Collection<AdditivesPrevOriginalTags> getAdditivesPrevOriginalTags() {
        return additivesPrevOriginalTags;
    }

    public void setAdditivesPrevOriginalTags(Collection<AdditivesPrevOriginalTags> additivesPrevOriginalTags) {
        this.additivesPrevOriginalTags = additivesPrevOriginalTags;
    }

    public Collection<AdditivesDebugTags> getAdditivesDebugTags() {
        return additivesDebugTags;
    }

    public void setAdditivesDebugTags(Collection<AdditivesDebugTags> additivesDebugTags) {
        this.additivesDebugTags = additivesDebugTags;
    }

    public Collection<AdditivesTags> getAdditivesTags() {
        return additivesTags;
    }

    public void setAdditivesTags(Collection<AdditivesTags> additivesTags) {
        this.additivesTags = additivesTags;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
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

    public Collection<AllergensHierarchy> getAllergensHierarchy() {
        return allergensHierarchy;
    }

    public void setAllergensHierarchy(Collection<AllergensHierarchy> allergensHierarchy) {
        this.allergensHierarchy = allergensHierarchy;
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

    public Collection<AminoAcidsPrevTags> getAminoAcidsPrevTags() {
        return aminoAcidsPrevTags;
    }

    public void setAminoAcidsPrevTags(Collection<AminoAcidsPrevTags> aminoAcidsPrevTags) {
        this.aminoAcidsPrevTags = aminoAcidsPrevTags;
    }

    public Collection<AminoAcidsTags> getAminoAcidsTags() {
        return aminoAcidsTags;
    }

    public void setAminoAcidsTags(Collection<AminoAcidsTags> aminoAcidsTags) {
        this.aminoAcidsTags = aminoAcidsTags;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public Collection<BrandsDebugTags> getBrandsDebugTags() {
        return brandsDebugTags;
    }

    public void setBrandsDebugTags(Collection<BrandsDebugTags> brandsDebugTags) {
        this.brandsDebugTags = brandsDebugTags;
    }

    public Collection<BrandsTags> getBrandsTags() {
        return brandsTags;
    }

    public void setBrandsTags(Collection<BrandsTags> brandsTags) {
        this.brandsTags = brandsTags;
    }

    public String getCarbonFootprintPercentOfKnownIngredients() {
        return carbonFootprintPercentOfKnownIngredients;
    }

    public void setCarbonFootprintPercentOfKnownIngredients(String carbonFootprintPercentOfKnownIngredients) {
        this.carbonFootprintPercentOfKnownIngredients = carbonFootprintPercentOfKnownIngredients;
    }

    public String getCarbonFootprintFromKnownIngredientsDebug() {
        return carbonFootprintFromKnownIngredientsDebug;
    }

    public void setCarbonFootprintFromKnownIngredientsDebug(String carbonFootprintFromKnownIngredientsDebug) {
        this.carbonFootprintFromKnownIngredientsDebug = carbonFootprintFromKnownIngredientsDebug;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Collection<CategoriesHierarchy> getCategoriesHierarchy() {
        return categoriesHierarchy;
    }

    public void setCategoriesHierarchy(Collection<CategoriesHierarchy> categoriesHierarchy) {
        this.categoriesHierarchy = categoriesHierarchy;
    }

    public String getCategoriesLc() {
        return categoriesLc;
    }

    public void setCategoriesLc(String categoriesLc) {
        this.categoriesLc = categoriesLc;
    }

    public Collection<CategoriesPropertiesTags> getCategoriesPropertiesTags() {
        return categoriesPropertiesTags;
    }

    public void setCategoriesPropertiesTags(Collection<CategoriesPropertiesTags> categoriesPropertiesTags) {
        this.categoriesPropertiesTags = categoriesPropertiesTags;
    }

    public Collection<CategoriesTags> getCategoriesTags() {
        return categoriesTags;
    }

    public void setCategoriesTags(Collection<CategoriesTags> categoriesTags) {
        this.categoriesTags = categoriesTags;
    }

    public Collection<CheckersTags> getCheckersTags() {
        return checkersTags;
    }

    public void setCheckersTags(Collection<CheckersTags> checkersTags) {
        this.checkersTags = checkersTags;
    }

    public Collection<CitiesTags> getCitiesTags() {
        return citiesTags;
    }

    public void setCitiesTags(Collection<CitiesTags> citiesTags) {
        this.citiesTags = citiesTags;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Collection<CodesTags> getCodesTags() {
        return codesTags;
    }

    public void setCodesTags(Collection<CodesTags> codesTags) {
        this.codesTags = codesTags;
    }

    public String getComparedToCategory() {
        return comparedToCategory;
    }

    public void setComparedToCategory(String comparedToCategory) {
        this.comparedToCategory = comparedToCategory;
    }

    public int getComplete() {
        return complete;
    }

    public void setComplete(int complete) {
        this.complete = complete;
    }

    public long getCompletedT() {
        return completedT;
    }

    public void setCompletedT(long completedT) {
        this.completedT = completedT;
    }

    public float getCompleteness() {
        return completeness;
    }

    public void setCompleteness(float completeness) {
        this.completeness = completeness;
    }

    public String getConservationConditions() {
        return conservationConditions;
    }

    public void setConservationConditions(String conservationConditions) {
        this.conservationConditions = conservationConditions;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public Collection<CountriesHierarchy> getCountriesHierarchy() {
        return countriesHierarchy;
    }

    public void setCountriesHierarchy(Collection<CountriesHierarchy> countriesHierarchy) {
        this.countriesHierarchy = countriesHierarchy;
    }

    public String getCountriesLc() {
        return countriesLc;
    }

    public void setCountriesLc(String countriesLc) {
        this.countriesLc = countriesLc;
    }

    public Collection<CountriesDebugTags> getCountriesDebugTags() {
        return countriesDebugTags;
    }

    public void setCountriesDebugTags(Collection<CountriesDebugTags> countriesDebugTags) {
        this.countriesDebugTags = countriesDebugTags;
    }

    public Collection<CountriesTags> getCountriesTags() {
        return countriesTags;
    }

    public void setCountriesTags(Collection<CountriesTags> countriesTags) {
        this.countriesTags = countriesTags;
    }

    public Collection<CorrectorsTags> getCorrectorsTags() {
        return correctorsTags;
    }

    public void setCorrectorsTags(Collection<CorrectorsTags> correctorsTags) {
        this.correctorsTags = correctorsTags;
    }

    public long getCreatedT() {
        return createdT;
    }

    public void setCreatedT(long createdT) {
        this.createdT = createdT;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Collection<DataQualityBugsTags> getDataQualityBugsTags() {
        return dataQualityBugsTags;
    }

    public void setDataQualityBugsTags(Collection<DataQualityBugsTags> dataQualityBugsTags) {
        this.dataQualityBugsTags = dataQualityBugsTags;
    }

    public Collection<DataQualityErrorsTags> getDataQualityErrorsTags() {
        return dataQualityErrorsTags;
    }

    public void setDataQualityErrorsTags(Collection<DataQualityErrorsTags> dataQualityErrorsTags) {
        this.dataQualityErrorsTags = dataQualityErrorsTags;
    }

    public Collection<DataQualityInfoTags> getDataQualityInfoTags() {
        return dataQualityInfoTags;
    }

    public void setDataQualityInfoTags(Collection<DataQualityInfoTags> dataQualityInfoTags) {
        this.dataQualityInfoTags = dataQualityInfoTags;
    }

    public Collection<DataQualityTags> getDataQualityTags() {
        return dataQualityTags;
    }

    public void setDataQualityTags(Collection<DataQualityTags> dataQualityTags) {
        this.dataQualityTags = dataQualityTags;
    }

    public Collection<DataQualityWarningsTags> getDataQualityWarningsTags() {
        return dataQualityWarningsTags;
    }

    public void setDataQualityWarningsTags(Collection<DataQualityWarningsTags> dataQualityWarningsTags) {
        this.dataQualityWarningsTags = dataQualityWarningsTags;
    }

    public String getDataSources() {
        return dataSources;
    }

    public void setDataSources(String dataSources) {
        this.dataSources = dataSources;
    }

    public Collection<DataSourcesTags> getDataSourcesTags() {
        return dataSourcesTags;
    }

    public void setDataSourcesTags(Collection<DataSourcesTags> dataSourcesTags) {
        this.dataSourcesTags = dataSourcesTags;
    }

    public Collection<DebugParamSortedLangs> getDebugParamSortedLangs() {
        return debugParamSortedLangs;
    }

    public void setDebugParamSortedLangs(Collection<DebugParamSortedLangs> debugParamSortedLangs) {
        this.debugParamSortedLangs = debugParamSortedLangs;
    }

    public Collection<EditorsTags> getEditorsTags() {
        return editorsTags;
    }

    public void setEditorsTags(Collection<EditorsTags> editorsTags) {
        this.editorsTags = editorsTags;
    }

    public String getEmbCodes() {
        return embCodes;
    }

    public void setEmbCodes(String embCodes) {
        this.embCodes = embCodes;
    }

    public Collection<EmbCodesDebugTags> getEmbCodesDebugTags() {
        return embCodesDebugTags;
    }

    public void setEmbCodesDebugTags(Collection<EmbCodesDebugTags> embCodesDebugTags) {
        this.embCodesDebugTags = embCodesDebugTags;
    }

    public String getEmbCodesOrig() {
        return embCodesOrig;
    }

    public void setEmbCodesOrig(String embCodesOrig) {
        this.embCodesOrig = embCodesOrig;
    }

    public Collection<EmbCodesTags> getEmbCodesTags() {
        return embCodesTags;
    }

    public void setEmbCodesTags(Collection<EmbCodesTags> embCodesTags) {
        this.embCodesTags = embCodesTags;
    }

    public Collection<EntryDatesTags> getEntryDatesTags() {
        return entryDatesTags;
    }

    public void setEntryDatesTags(Collection<EntryDatesTags> entryDatesTags) {
        this.entryDatesTags = entryDatesTags;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Collection<ExpirationDateDebugTags> getExpirationDateDebugTags() {
        return expirationDateDebugTags;
    }

    public void setExpirationDateDebugTags(Collection<ExpirationDateDebugTags> expirationDateDebugTags) {
        this.expirationDateDebugTags = expirationDateDebugTags;
    }

    public int getFruitsVegetablesNuts100GEstimate() {
        return fruitsVegetablesNuts100GEstimate;
    }

    public void setFruitsVegetablesNuts100GEstimate(int fruitsVegetablesNuts100GEstimate) {
        this.fruitsVegetablesNuts100GEstimate = fruitsVegetablesNuts100GEstimate;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getImageFrontSmallUrl() {
        return imageFrontSmallUrl;
    }

    public void setImageFrontSmallUrl(String imageFrontSmallUrl) {
        this.imageFrontSmallUrl = imageFrontSmallUrl;
    }

    public String getImageFrontThumbUrl() {
        return imageFrontThumbUrl;
    }

    public void setImageFrontThumbUrl(String imageFrontThumbUrl) {
        this.imageFrontThumbUrl = imageFrontThumbUrl;
    }

    public String getImageFrontUrl() {
        return imageFrontUrl;
    }

    public void setImageFrontUrl(String imageFrontUrl) {
        this.imageFrontUrl = imageFrontUrl;
    }

    public String getImageIngredientsUrl() {
        return imageIngredientsUrl;
    }

    public void setImageIngredientsUrl(String imageIngredientsUrl) {
        this.imageIngredientsUrl = imageIngredientsUrl;
    }

    public String getImageIngredientsSmallUrl() {
        return imageIngredientsSmallUrl;
    }

    public void setImageIngredientsSmallUrl(String imageIngredientsSmallUrl) {
        this.imageIngredientsSmallUrl = imageIngredientsSmallUrl;
    }

    public String getImageIngredientsThumbUrl() {
        return imageIngredientsThumbUrl;
    }

    public void setImageIngredientsThumbUrl(String imageIngredientsThumbUrl) {
        this.imageIngredientsThumbUrl = imageIngredientsThumbUrl;
    }

    public String getImageNutritionSmallUrl() {
        return imageNutritionSmallUrl;
    }

    public void setImageNutritionSmallUrl(String imageNutritionSmallUrl) {
        this.imageNutritionSmallUrl = imageNutritionSmallUrl;
    }

    public String getImageNutritionThumbUrl() {
        return imageNutritionThumbUrl;
    }

    public void setImageNutritionThumbUrl(String imageNutritionThumbUrl) {
        this.imageNutritionThumbUrl = imageNutritionThumbUrl;
    }

    public String getImageNutritionUrl() {
        return imageNutritionUrl;
    }

    public void setImageNutritionUrl(String imageNutritionUrl) {
        this.imageNutritionUrl = imageNutritionUrl;
    }

    public String getImageSmallUrl() {
        return imageSmallUrl;
    }

    public void setImageSmallUrl(String imageSmallUrl) {
        this.imageSmallUrl = imageSmallUrl;
    }

    public String getImageThumbUrl() {
        return imageThumbUrl;
    }

    public void setImageThumbUrl(String imageThumbUrl) {
        this.imageThumbUrl = imageThumbUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Collection<InformersTags> getInformersTags() {
        return informersTags;
    }

    public void setInformersTags(Collection<InformersTags> informersTags) {
        this.informersTags = informersTags;
    }

    public Collection<IngredientsAnalysisTags> getIngredientsAnalysisTags() {
        return ingredientsAnalysisTags;
    }

    public void setIngredientsAnalysisTags(Collection<IngredientsAnalysisTags> ingredientsAnalysisTags) {
        this.ingredientsAnalysisTags = ingredientsAnalysisTags;
    }

    public Collection<IngredientsDebug> getIngredientsDebug() {
        return ingredientsDebug;
    }

    public void setIngredientsDebug(Collection<IngredientsDebug> ingredientsDebug) {
        this.ingredientsDebug = ingredientsDebug;
    }

    public int getIngredientsFromOrThatMayBeFromPalmOilN() {
        return ingredientsFromOrThatMayBeFromPalmOilN;
    }

    public void setIngredientsFromOrThatMayBeFromPalmOilN(int ingredientsFromOrThatMayBeFromPalmOilN) {
        this.ingredientsFromOrThatMayBeFromPalmOilN = ingredientsFromOrThatMayBeFromPalmOilN;
    }

    public Collection<IngredientsFromPalmOilTags> getIngredientsFromPalmOilTags() {
        return ingredientsFromPalmOilTags;
    }

    public void setIngredientsFromPalmOilTags(Collection<IngredientsFromPalmOilTags> ingredientsFromPalmOilTags) {
        this.ingredientsFromPalmOilTags = ingredientsFromPalmOilTags;
    }

    public int getIngredientsFromPalmOilN() {
        return ingredientsFromPalmOilN;
    }

    public void setIngredientsFromPalmOilN(int ingredientsFromPalmOilN) {
        this.ingredientsFromPalmOilN = ingredientsFromPalmOilN;
    }

    public Collection<IngredientsHierarchy> getIngredientsHierarchy() {
        return ingredientsHierarchy;
    }

    public void setIngredientsHierarchy(Collection<IngredientsHierarchy> ingredientsHierarchy) {
        this.ingredientsHierarchy = ingredientsHierarchy;
    }

    public Collection<IngredientsIdsDebug> getIngredientsIdsDebug() {
        return ingredientsIdsDebug;
    }

    public void setIngredientsIdsDebug(Collection<IngredientsIdsDebug> ingredientsIdsDebug) {
        this.ingredientsIdsDebug = ingredientsIdsDebug;
    }

    public int getIngredientsN() {
        return ingredientsN;
    }

    public void setIngredientsN(int ingredientsN) {
        this.ingredientsN = ingredientsN;
    }

    public Collection<IngredientsNTags> getIngredientsNTags() {
        return ingredientsNTags;
    }

    public void setIngredientsNTags(Collection<IngredientsNTags> ingredientsNTags) {
        this.ingredientsNTags = ingredientsNTags;
    }

    public Collection<IngredientsOriginalTags> getIngredientsOriginalTags() {
        return ingredientsOriginalTags;
    }

    public void setIngredientsOriginalTags(Collection<IngredientsOriginalTags> ingredientsOriginalTags) {
        this.ingredientsOriginalTags = ingredientsOriginalTags;
    }

    public Collection<IngredientsTags> getIngredientsTags() {
        return ingredientsTags;
    }

    public void setIngredientsTags(Collection<IngredientsTags> ingredientsTags) {
        this.ingredientsTags = ingredientsTags;
    }

    public String getIngredientsText() {
        return ingredientsText;
    }

    public void setIngredientsText(String ingredientsText) {
        this.ingredientsText = ingredientsText;
    }

    public String getIngredientsTextDebug() {
        return ingredientsTextDebug;
    }

    public void setIngredientsTextDebug(String ingredientsTextDebug) {
        this.ingredientsTextDebug = ingredientsTextDebug;
    }

    public String getIngredientsTextWithAllergens() {
        return ingredientsTextWithAllergens;
    }

    public void setIngredientsTextWithAllergens(String ingredientsTextWithAllergens) {
        this.ingredientsTextWithAllergens = ingredientsTextWithAllergens;
    }

    public int getIngredientsThatMayBeFromPalmOilN() {
        return ingredientsThatMayBeFromPalmOilN;
    }

    public void setIngredientsThatMayBeFromPalmOilN(int ingredientsThatMayBeFromPalmOilN) {
        this.ingredientsThatMayBeFromPalmOilN = ingredientsThatMayBeFromPalmOilN;
    }

    public Collection<IngredientsThatMayBeFromPalmOilTags> getIngredientsThatMayBeFromPalmOilTags() {
        return ingredientsThatMayBeFromPalmOilTags;
    }

    public void setIngredientsThatMayBeFromPalmOilTags(Collection<IngredientsThatMayBeFromPalmOilTags> ingredientsThatMayBeFromPalmOilTags) {
        this.ingredientsThatMayBeFromPalmOilTags = ingredientsThatMayBeFromPalmOilTags;
    }

    public String getInterfaceVersionCreated() {
        return interfaceVersionCreated;
    }

    public void setInterfaceVersionCreated(String interfaceVersionCreated) {
        this.interfaceVersionCreated = interfaceVersionCreated;
    }

    public String getInterfaceVersionModified() {
        return interfaceVersionModified;
    }

    public void setInterfaceVersionModified(String interfaceVersionModified) {
        this.interfaceVersionModified = interfaceVersionModified;
    }

    public Collection<Keywords> getKeywords() {
        return keywords;
    }

    public void setKeywords(Collection<Keywords> keywords) {
        this.keywords = keywords;
    }

    public int getKnownIngredientsN() {
        return knownIngredientsN;
    }

    public void setKnownIngredientsN(int knownIngredientsN) {
        this.knownIngredientsN = knownIngredientsN;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public Collection<LabelsHierarchy> getLabelsHierarchy() {
        return labelsHierarchy;
    }

    public void setLabelsHierarchy(Collection<LabelsHierarchy> labelsHierarchy) {
        this.labelsHierarchy = labelsHierarchy;
    }

    public String getLabelsLc() {
        return labelsLc;
    }

    public void setLabelsLc(String labelsLc) {
        this.labelsLc = labelsLc;
    }

    public Collection<LabelsPrevHierarchy> getLabelsPrevHierarchy() {
        return labelsPrevHierarchy;
    }

    public void setLabelsPrevHierarchy(Collection<LabelsPrevHierarchy> labelsPrevHierarchy) {
        this.labelsPrevHierarchy = labelsPrevHierarchy;
    }

    public Collection<LabelsPrevTags> getLabelsPrevTags() {
        return labelsPrevTags;
    }

    public void setLabelsPrevTags(Collection<LabelsPrevTags> labelsPrevTags) {
        this.labelsPrevTags = labelsPrevTags;
    }

    public Collection<LabelsTags> getLabelsTags() {
        return labelsTags;
    }

    public void setLabelsTags(Collection<LabelsTags> labelsTags) {
        this.labelsTags = labelsTags;
    }

    public Collection<LabelsDebugTags> getLabelsDebugTags() {
        return labelsDebugTags;
    }

    public void setLabelsDebugTags(Collection<LabelsDebugTags> labelsDebugTags) {
        this.labelsDebugTags = labelsDebugTags;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Collection<LangDebugTags> getLangDebugTags() {
        return langDebugTags;
    }

    public void setLangDebugTags(Collection<LangDebugTags> langDebugTags) {
        this.langDebugTags = langDebugTags;
    }

    public Collection<LanguagesHierarchy> getLanguagesHierarchy() {
        return languagesHierarchy;
    }

    public void setLanguagesHierarchy(Collection<LanguagesHierarchy> languagesHierarchy) {
        this.languagesHierarchy = languagesHierarchy;
    }

    public Collection<LanguagesTags> getLanguagesTags() {
        return languagesTags;
    }

    public void setLanguagesTags(Collection<LanguagesTags> languagesTags) {
        this.languagesTags = languagesTags;
    }

    public Collection<LastEditDatesTags> getLastEditDatesTags() {
        return lastEditDatesTags;
    }

    public void setLastEditDatesTags(Collection<LastEditDatesTags> lastEditDatesTags) {
        this.lastEditDatesTags = lastEditDatesTags;
    }

    public String getLastEditor() {
        return lastEditor;
    }

    public void setLastEditor(String lastEditor) {
        this.lastEditor = lastEditor;
    }

    public Collection<LastImageDatesTags> getLastImageDatesTags() {
        return lastImageDatesTags;
    }

    public void setLastImageDatesTags(Collection<LastImageDatesTags> lastImageDatesTags) {
        this.lastImageDatesTags = lastImageDatesTags;
    }

    public long getLastImageT() {
        return lastImageT;
    }

    public void setLastImageT(long lastImageT) {
        this.lastImageT = lastImageT;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public long getLastModifiedT() {
        return lastModifiedT;
    }

    public void setLastModifiedT(long lastModifiedT) {
        this.lastModifiedT = lastModifiedT;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Collection<LinkDebugTags> getLinkDebugTags() {
        return linkDebugTags;
    }

    public void setLinkDebugTags(Collection<LinkDebugTags> linkDebugTags) {
        this.linkDebugTags = linkDebugTags;
    }

    public String getManufacturingPlaces() {
        return manufacturingPlaces;
    }

    public void setManufacturingPlaces(String manufacturingPlaces) {
        this.manufacturingPlaces = manufacturingPlaces;
    }

    public Collection<ManufacturingPlacesDebugTags> getManufacturingPlacesDebugTags() {
        return manufacturingPlacesDebugTags;
    }

    public void setManufacturingPlacesDebugTags(Collection<ManufacturingPlacesDebugTags> manufacturingPlacesDebugTags) {
        this.manufacturingPlacesDebugTags = manufacturingPlacesDebugTags;
    }

    public Collection<ManufacturingPlacesTags> getManufacturingPlacesTags() {
        return manufacturingPlacesTags;
    }

    public void setManufacturingPlacesTags(Collection<ManufacturingPlacesTags> manufacturingPlacesTags) {
        this.manufacturingPlacesTags = manufacturingPlacesTags;
    }

    public String getMaxImgid() {
        return maxImgid;
    }

    public void setMaxImgid(String maxImgid) {
        this.maxImgid = maxImgid;
    }

    public Collection<MineralsPrevTags> getMineralsPrevTags() {
        return mineralsPrevTags;
    }

    public void setMineralsPrevTags(Collection<MineralsPrevTags> mineralsPrevTags) {
        this.mineralsPrevTags = mineralsPrevTags;
    }

    public Collection<MineralsTags> getMineralsTags() {
        return mineralsTags;
    }

    public void setMineralsTags(Collection<MineralsTags> mineralsTags) {
        this.mineralsTags = mineralsTags;
    }

    public Collection<MiscTags> getMiscTags() {
        return miscTags;
    }

    public void setMiscTags(Collection<MiscTags> miscTags) {
        this.miscTags = miscTags;
    }

    public String getNetWeightUnit() {
        return netWeightUnit;
    }

    public void setNetWeightUnit(String netWeightUnit) {
        this.netWeightUnit = netWeightUnit;
    }

    public String getNetWeightValue() {
        return netWeightValue;
    }

    public void setNetWeightValue(String netWeightValue) {
        this.netWeightValue = netWeightValue;
    }

    public String getNutritionDataPer() {
        return nutritionDataPer;
    }

    public void setNutritionDataPer(String nutritionDataPer) {
        this.nutritionDataPer = nutritionDataPer;
    }

    public int getNutritionScoreWarningNoFruitsVegetablesNuts() {
        return nutritionScoreWarningNoFruitsVegetablesNuts;
    }

    public void setNutritionScoreWarningNoFruitsVegetablesNuts(int nutritionScoreWarningNoFruitsVegetablesNuts) {
        this.nutritionScoreWarningNoFruitsVegetablesNuts = nutritionScoreWarningNoFruitsVegetablesNuts;
    }

    public String getNoNutritionData() {
        return noNutritionData;
    }

    public void setNoNutritionData(String noNutritionData) {
        this.noNutritionData = noNutritionData;
    }

    public String getNovaGroup() {
        return novaGroup;
    }

    public void setNovaGroup(String novaGroup) {
        this.novaGroup = novaGroup;
    }

    public String getNovaGroups() {
        return novaGroups;
    }

    public void setNovaGroups(String novaGroups) {
        this.novaGroups = novaGroups;
    }

    public String getNovaGroupDebug() {
        return novaGroupDebug;
    }

    public void setNovaGroupDebug(String novaGroupDebug) {
        this.novaGroupDebug = novaGroupDebug;
    }

    public Collection<NovaGroupTags> getNovaGroupTags() {
        return novaGroupTags;
    }

    public void setNovaGroupTags(Collection<NovaGroupTags> novaGroupTags) {
        this.novaGroupTags = novaGroupTags;
    }

    public Collection<NovaGroupsTags> getNovaGroupsTags() {
        return novaGroupsTags;
    }

    public void setNovaGroupsTags(Collection<NovaGroupsTags> novaGroupsTags) {
        this.novaGroupsTags = novaGroupsTags;
    }

    public Collection<NucleotidesPrevTags> getNucleotidesPrevTags() {
        return nucleotidesPrevTags;
    }

    public void setNucleotidesPrevTags(Collection<NucleotidesPrevTags> nucleotidesPrevTags) {
        this.nucleotidesPrevTags = nucleotidesPrevTags;
    }

    public Collection<NucleotidesTags> getNucleotidesTags() {
        return nucleotidesTags;
    }

    public void setNucleotidesTags(Collection<NucleotidesTags> nucleotidesTags) {
        this.nucleotidesTags = nucleotidesTags;
    }

    public Collection<NutrientLevelsTags> getNutrientLevelsTags() {
        return nutrientLevelsTags;
    }

    public void setNutrientLevelsTags(Collection<NutrientLevelsTags> nutrientLevelsTags) {
        this.nutrientLevelsTags = nutrientLevelsTags;
    }

    public String getNutritionData() {
        return nutritionData;
    }

    public void setNutritionData(String nutritionData) {
        this.nutritionData = nutritionData;
    }

    public Collection<NutritionDataPerDebugTags> getNutritionDataPerDebugTags() {
        return nutritionDataPerDebugTags;
    }

    public void setNutritionDataPerDebugTags(Collection<NutritionDataPerDebugTags> nutritionDataPerDebugTags) {
        this.nutritionDataPerDebugTags = nutritionDataPerDebugTags;
    }

    public String getNutritionDataPrepared() {
        return nutritionDataPrepared;
    }

    public void setNutritionDataPrepared(String nutritionDataPrepared) {
        this.nutritionDataPrepared = nutritionDataPrepared;
    }

    public String getNutritionDataPreparedPer() {
        return nutritionDataPreparedPer;
    }

    public void setNutritionDataPreparedPer(String nutritionDataPreparedPer) {
        this.nutritionDataPreparedPer = nutritionDataPreparedPer;
    }

    public String getNutritionGrades() {
        return nutritionGrades;
    }

    public void setNutritionGrades(String nutritionGrades) {
        this.nutritionGrades = nutritionGrades;
    }

    public int getNutritionScoreBeverage() {
        return nutritionScoreBeverage;
    }

    public void setNutritionScoreBeverage(int nutritionScoreBeverage) {
        this.nutritionScoreBeverage = nutritionScoreBeverage;
    }

    public String getNutritionScoreDebug() {
        return nutritionScoreDebug;
    }

    public void setNutritionScoreDebug(String nutritionScoreDebug) {
        this.nutritionScoreDebug = nutritionScoreDebug;
    }

    public int getNutritionScoreWarningNoFiber() {
        return nutritionScoreWarningNoFiber;
    }

    public void setNutritionScoreWarningNoFiber(int nutritionScoreWarningNoFiber) {
        this.nutritionScoreWarningNoFiber = nutritionScoreWarningNoFiber;
    }

    public Collection<NutritionGradesTags> getNutritionGradesTags() {
        return nutritionGradesTags;
    }

    public void setNutritionGradesTags(Collection<NutritionGradesTags> nutritionGradesTags) {
        this.nutritionGradesTags = nutritionGradesTags;
    }

    public String getOrigins() {
        return origins;
    }

    public void setOrigins(String origins) {
        this.origins = origins;
    }

    public Collection<OriginsDebugTags> getOriginsDebugTags() {
        return originsDebugTags;
    }

    public void setOriginsDebugTags(Collection<OriginsDebugTags> originsDebugTags) {
        this.originsDebugTags = originsDebugTags;
    }

    public Collection<OriginsTags> getOriginsTags() {
        return originsTags;
    }

    public void setOriginsTags(Collection<OriginsTags> originsTags) {
        this.originsTags = originsTags;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public Collection<OtherNutritionalSubstancesTags> getOtherNutritionalSubstancesTags() {
        return otherNutritionalSubstancesTags;
    }

    public void setOtherNutritionalSubstancesTags(Collection<OtherNutritionalSubstancesTags> otherNutritionalSubstancesTags) {
        this.otherNutritionalSubstancesTags = otherNutritionalSubstancesTags;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public Collection<PackagingDebugTags> getPackagingDebugTags() {
        return packagingDebugTags;
    }

    public void setPackagingDebugTags(Collection<PackagingDebugTags> packagingDebugTags) {
        this.packagingDebugTags = packagingDebugTags;
    }

    public Collection<PackagingTags> getPackagingTags() {
        return packagingTags;
    }

    public void setPackagingTags(Collection<PackagingTags> packagingTags) {
        this.packagingTags = packagingTags;
    }

    public Collection<PhotographersTags> getPhotographersTags() {
        return photographersTags;
    }

    public void setPhotographersTags(Collection<PhotographersTags> photographersTags) {
        this.photographersTags = photographersTags;
    }

    public String getPnnsGroups1() {
        return pnnsGroups1;
    }

    public void setPnnsGroups1(String pnnsGroups1) {
        this.pnnsGroups1 = pnnsGroups1;
    }

    public String getPnnsGroups2() {
        return pnnsGroups2;
    }

    public void setPnnsGroups2(String pnnsGroups2) {
        this.pnnsGroups2 = pnnsGroups2;
    }

    public Collection<PnnsGroups1Tags> getPnnsGroups1Tags() {
        return pnnsGroups1Tags;
    }

    public void setPnnsGroups1Tags(Collection<PnnsGroups1Tags> pnnsGroups1Tags) {
        this.pnnsGroups1Tags = pnnsGroups1Tags;
    }

    public Collection<PnnsGroups2Tags> getPnnsGroups2Tags() {
        return pnnsGroups2Tags;
    }

    public void setPnnsGroups2Tags(Collection<PnnsGroups2Tags> pnnsGroups2Tags) {
        this.pnnsGroups2Tags = pnnsGroups2Tags;
    }

    public long getPopularityKey() {
        return popularityKey;
    }

    public void setPopularityKey(long popularityKey) {
        this.popularityKey = popularityKey;
    }

    public String getProducerVersionId() {
        return producerVersionId;
    }

    public void setProducerVersionId(String producerVersionId) {
        this.producerVersionId = producerVersionId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getPurchasePlaces() {
        return purchasePlaces;
    }

    public void setPurchasePlaces(String purchasePlaces) {
        this.purchasePlaces = purchasePlaces;
    }

    public Collection<PurchasePlacesDebugTags> getPurchasePlacesDebugTags() {
        return purchasePlacesDebugTags;
    }

    public void setPurchasePlacesDebugTags(Collection<PurchasePlacesDebugTags> purchasePlacesDebugTags) {
        this.purchasePlacesDebugTags = purchasePlacesDebugTags;
    }

    public Collection<PurchasePlacesTags> getPurchasePlacesTags() {
        return purchasePlacesTags;
    }

    public void setPurchasePlacesTags(Collection<PurchasePlacesTags> purchasePlacesTags) {
        this.purchasePlacesTags = purchasePlacesTags;
    }

    public Collection<QualityTags> getQualityTags() {
        return qualityTags;
    }

    public void setQualityTags(Collection<QualityTags> qualityTags) {
        this.qualityTags = qualityTags;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Collection<QuantityDebugTags> getQuantityDebugTags() {
        return quantityDebugTags;
    }

    public void setQuantityDebugTags(Collection<QuantityDebugTags> quantityDebugTags) {
        this.quantityDebugTags = quantityDebugTags;
    }

    public String getRecyclingInstructionsToDiscard() {
        return recyclingInstructionsToDiscard;
    }

    public void setRecyclingInstructionsToDiscard(String recyclingInstructionsToDiscard) {
        this.recyclingInstructionsToDiscard = recyclingInstructionsToDiscard;
    }

    public int getRev() {
        return rev;
    }

    public void setRev(int rev) {
        this.rev = rev;
    }

    public String getServingQuantity() {
        return servingQuantity;
    }

    public void setServingQuantity(String servingQuantity) {
        this.servingQuantity = servingQuantity;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public Collection<ServingSizeDebugTags> getServingSizeDebugTags() {
        return servingSizeDebugTags;
    }

    public void setServingSizeDebugTags(Collection<ServingSizeDebugTags> servingSizeDebugTags) {
        this.servingSizeDebugTags = servingSizeDebugTags;
    }

    public long getSortkey() {
        return sortkey;
    }

    public void setSortkey(long sortkey) {
        this.sortkey = sortkey;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public Collection<StatesHierarchy> getStatesHierarchy() {
        return statesHierarchy;
    }

    public void setStatesHierarchy(Collection<StatesHierarchy> statesHierarchy) {
        this.statesHierarchy = statesHierarchy;
    }

    public Collection<StatesTags> getStatesTags() {
        return statesTags;
    }

    public void setStatesTags(Collection<StatesTags> statesTags) {
        this.statesTags = statesTags;
    }

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }

    public Collection<StoresDebugTags> getStoresDebugTags() {
        return storesDebugTags;
    }

    public void setStoresDebugTags(Collection<StoresDebugTags> storesDebugTags) {
        this.storesDebugTags = storesDebugTags;
    }

    public Collection<StoresTags> getStoresTags() {
        return storesTags;
    }

    public void setStoresTags(Collection<StoresTags> storesTags) {
        this.storesTags = storesTags;
    }

    public String getTraces() {
        return traces;
    }

    public void setTraces(String traces) {
        this.traces = traces;
    }

    public String getTracesFromIngredients() {
        return tracesFromIngredients;
    }

    public void setTracesFromIngredients(String tracesFromIngredients) {
        this.tracesFromIngredients = tracesFromIngredients;
    }

    public Collection<TracesHierarchy> getTracesHierarchy() {
        return tracesHierarchy;
    }

    public void setTracesHierarchy(Collection<TracesHierarchy> tracesHierarchy) {
        this.tracesHierarchy = tracesHierarchy;
    }

    public Collection<TracesDebugTags> getTracesDebugTags() {
        return tracesDebugTags;
    }

    public void setTracesDebugTags(Collection<TracesDebugTags> tracesDebugTags) {
        this.tracesDebugTags = tracesDebugTags;
    }

    public String getTracesFromUser() {
        return tracesFromUser;
    }

    public void setTracesFromUser(String tracesFromUser) {
        this.tracesFromUser = tracesFromUser;
    }

    public String getTracesLc() {
        return tracesLc;
    }

    public void setTracesLc(String tracesLc) {
        this.tracesLc = tracesLc;
    }

    public Collection<TracesTags> getTracesTags() {
        return tracesTags;
    }

    public void setTracesTags(Collection<TracesTags> tracesTags) {
        this.tracesTags = tracesTags;
    }

    public int getUnknownIngredientsN() {
        return unknownIngredientsN;
    }

    public void setUnknownIngredientsN(int unknownIngredientsN) {
        this.unknownIngredientsN = unknownIngredientsN;
    }

    public Collection<UnknownNutrientsTags> getUnknownNutrientsTags() {
        return unknownNutrientsTags;
    }

    public void setUnknownNutrientsTags(Collection<UnknownNutrientsTags> unknownNutrientsTags) {
        this.unknownNutrientsTags = unknownNutrientsTags;
    }

    public String getUpdateKey() {
        return updateKey;
    }

    public void setUpdateKey(String updateKey) {
        this.updateKey = updateKey;
    }

    public Collection<VitaminsPrevTags> getVitaminsPrevTags() {
        return vitaminsPrevTags;
    }

    public void setVitaminsPrevTags(Collection<VitaminsPrevTags> vitaminsPrevTags) {
        this.vitaminsPrevTags = vitaminsPrevTags;
    }

    public Collection<VitaminsTags> getVitaminsTags() {
        return vitaminsTags;
    }

    public void setVitaminsTags(Collection<VitaminsTags> vitaminsTags) {
        this.vitaminsTags = vitaminsTags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
            if (obj.has("nutriments"))
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
                product.additivesOriginalTags = AdditivesOriginalTags.populateCollection(obj.getJSONArray("additives_original_tags"), product);
            if (obj.has("additives_old_tags"))
                product.additivesOldTags = AdditivesOldTags.populateCollection(obj.getJSONArray("additives_original_tags"), product);
            if (obj.has("additives_prev_original_tags"))
                product.additivesPrevOriginalTags = AdditivesPrevOriginalTags.pupolateCollection(obj.getJSONArray("additives_prev_original_tags"), product);
            if (obj.has("additives_debug_tags"))
                product.additivesDebugTags = AdditivesDebugTags.pupolateCollection(obj.getJSONArray("additives_debug_tags"), product);
            if (obj.has("additives_tags"))
                product.additivesTags = AdditivesTags.pupolateCollection(obj.getJSONArray("additives_tags"), product);
            if (obj.has("allergens"))
                product.allergens = obj.getString("allergens");
            if (obj.has("allergens_from_ingredients"))
                product.allergensFromIngredients = obj.getString("allergens_from_ingredients");
            if (obj.has("allergens_from_user"))
                product.allergensFromUser = obj.getString("allergens_from_user");
            if (obj.has("allergens_hierarchy"))
                product.allergensHierarchy = AllergensHierarchy.pupolateCollection(obj.getJSONArray("allergens_hierarchy"), product);
            if (obj.has("allergens_lc"))
                product.allergensLc = obj.getString("allergens_lc");
            if (obj.has("allergens_tags"))
                product.allergensTags = AllergensTags.pupolateCollection(obj.getJSONArray("allergens_tags"), product);
            if (obj.has("amino_acids_prev_tags"))
                product.aminoAcidsPrevTags = AminoAcidsPrevTags.pupolateCollection(obj.getJSONArray("amino_acids_prev_tags"), product);
            if (obj.has("amino_acids_tags"))
                product.aminoAcidsTags = AminoAcidsTags.pupolateCollection(obj.getJSONArray("amino_acids_tags"), product);
            if (obj.has("brands"))
                product.brands = obj.getString("brands");
            if (obj.has("brands_debug_tags"))
                product.brandsDebugTags = BrandsDebugTags.pupolateCollection(obj.getJSONArray("brands_debug_tags"), product);
            if (obj.has("brands_tags"))
                product.brandsTags = BrandsTags.pupolateCollection(obj.getJSONArray("brands_tags"), product);
            if (obj.has("carbon_footprint_percent_of_known_ingredients"))
                product.carbonFootprintPercentOfKnownIngredients = obj.getString("carbon_footprint_percent_of_known_ingredients");
            if (obj.has("carbon_footprint_from_known_ingredients_debug"))
                product.carbonFootprintFromKnownIngredientsDebug = obj.getString("carbon_footprint_from_known_ingredients_debug");
            if (obj.has("categories"))
                product.categories = obj.getString("categories");
            if (obj.has("categories_hierarchy"))
                product.categoriesHierarchy = CategoriesHierarchy.pupolateCollection(obj.getJSONArray("categories_hierarchy"), product);
            if (obj.has("categories_lc"))
                product.categoriesLc = obj.getString("categories_lc");
            if (obj.has("categories_properties_tags"))
                product.categoriesPropertiesTags = CategoriesPropertiesTags.pupolateCollection(obj.getJSONArray("categories_properties_tags"), product);
            if (obj.has("categories_tags"))
                product.categoriesTags = CategoriesTags.pupolateCollection(obj.getJSONArray("categories_tags"), product);
            if (obj.has("checkers_tags"))
                product.checkersTags = CheckersTags.pupolateCollection(obj.getJSONArray("checkers_tags"), product);
            if (obj.has("cities_tags"))
                product.citiesTags = CitiesTags.pupolateCollection(obj.getJSONArray("cities_tags"), product);
            if (obj.has("code"))
                product.code = obj.getString("code");
            if (obj.has("codes_tags"))
                product.codesTags = CodesTags.pupolateCollection(obj.getJSONArray("codes_tags"), product);
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
                product.countriesHierarchy = CountriesHierarchy.pupolateCollection(obj.getJSONArray("countries_hierarchy"), product);
            if (obj.has("countries_lc"))
                product.countriesLc = obj.getString("countries_lc");
            if (obj.has("countries_debug_tags"))
                product.countriesDebugTags = CountriesDebugTags.pupolateCollection(obj.getJSONArray("countries_debug_tags"), product);
            if (obj.has("countries_tags"))
                product.countriesTags = CountriesTags.pupolateCollection(obj.getJSONArray("countries_tags"), product);
            if (obj.has("correctors_tags"))
                product.correctorsTags = CorrectorsTags.pupolateCollection(obj.getJSONArray("correctors_tags"), product);
            if (obj.has("created_t"))
                product.createdT = obj.getLong("created_t");
            if (obj.has("creator"))
                product.creator = obj.getString("creator");
            if (obj.has("data_quality_bugs_tags"))
                product.dataQualityBugsTags = DataQualityBugsTags.pupolateCollection(obj.getJSONArray("data_quality_bugs_tags"), product);
            if (obj.has("data_quality_errors_tags"))
                product.dataQualityErrorsTags = DataQualityErrorsTags.pupolateCollection(obj.getJSONArray("data_quality_errors_tags"), product);
            if (obj.has("data_quality_info_tags"))
                product.dataQualityInfoTags = DataQualityInfoTags.pupolateCollection(obj.getJSONArray("data_quality_info_tags"), product);
            if (obj.has("data_quality_tags"))
                product.dataQualityTags = DataQualityTags.pupolateCollection(obj.getJSONArray("data_quality_tags"), product);
            if (obj.has("data_quality_warnings_tags"))
                product.dataQualityWarningsTags = DataQualityWarningsTags.pupolateCollection(obj.getJSONArray("data_quality_warnings_tags"), product);
            if (obj.has("data_sources"))
                product.dataSources = obj.getString("data_sources");
            if (obj.has("data_sources_tags"))
                product.dataSourcesTags = DataSourcesTags.pupolateCollection(obj.getJSONArray("data_sources_tags"), product);
            if (obj.has("debug_param_sorted_langs"))
                product.debugParamSortedLangs = DebugParamSortedLangs.pupolateCollection(obj.getJSONArray("debug_param_sorted_langs"), product);
            if (obj.has("editors_tags"))
                product.editorsTags = EditorsTags.pupolateCollection(obj.getJSONArray("editors_tags"), product);
            if (obj.has("emb_codes"))
                product.embCodes = obj.getString("emb_codes");
            if (obj.has("emb_codes_debug_tags"))
                product.embCodesDebugTags = EmbCodesDebugTags.pupolateCollection(obj.getJSONArray("emb_codes_debug_tags"), product);
            if (obj.has("emb_codes_orig"))
                product.embCodesOrig = obj.getString("emb_codes_orig");
            if (obj.has("emb_codes_tags"))
                product.embCodesTags = EmbCodesTags.pupolateCollection(obj.getJSONArray("emb_codes_tags"), product);
            if (obj.has("entry_dates_tags"))
                product.entryDatesTags = EntryDatesTags.pupolateCollection(obj.getJSONArray("entry_dates_tags"), product);
            if (obj.has("expiration_date"))
                product.expirationDate = obj.getString("expiration_date");
            if (obj.has("expiration_date_debug_tags"))
                product.expirationDateDebugTags = ExpirationDateDebugTags.pupolateCollection(obj.getJSONArray("expiration_date_debug_tags"), product);
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
                product.informersTags = InformersTags.pupolateCollection(obj.getJSONArray("informers_tags"), product);
            if (obj.has("ingredients_analysis_tags"))
                product.ingredientsAnalysisTags = IngredientsAnalysisTags.pupolateCollection(obj.getJSONArray("ingredients_analysis_tags"), product);
            if (obj.has("ingredients_debug"))
                product.ingredientsDebug = IngredientsDebug.pupolateCollection(obj.getJSONArray("ingredients_debug"), product);
            if (obj.has("ingredients_from_or_that_may_be_from_palm_oil_n"))
                product.ingredientsFromOrThatMayBeFromPalmOilN = obj.getInt("ingredients_from_or_that_may_be_from_palm_oil_n");
            if (obj.has("ingredients_from_palm_oil_tags"))
                product.ingredientsFromPalmOilTags = IngredientsFromPalmOilTags.pupolateCollection(obj.getJSONArray("ingredients_from_palm_oil_tags"), product);
            if (obj.has("ingredients_from_palm_oil_n"))
                product.ingredientsFromPalmOilN = obj.getInt("ingredients_from_palm_oil_n");
            if (obj.has("ingredients_hierarchy"))
                product.ingredientsHierarchy = IngredientsHierarchy.pupolateCollection(obj.getJSONArray("ingredients_hierarchy"), product);
            if (obj.has("ingredients_ids_debug"))
                product.ingredientsIdsDebug = IngredientsIdsDebug.pupolateCollection(obj.getJSONArray("ingredients_ids_debug"), product);
            if (obj.has("ingredients_n"))
                product.ingredientsN = obj.getInt("ingredients_n");
            if (obj.has("ingredients_n_tags"))
                product.ingredientsNTags = IngredientsNTags.pupolateCollection(obj.getJSONArray("ingredients_n_tags"), product);
            if (obj.has("ingredients_original_tags"))
                product.ingredientsOriginalTags = IngredientsOriginalTags.pupolateCollection(obj.getJSONArray("ingredients_original_tags"), product);
            if (obj.has("ingredients_tags"))
                product.ingredientsTags = IngredientsTags.pupolateCollection(obj.getJSONArray("ingredients_tags"), product);
            if (obj.has("ingredients_text"))
                product.ingredientsText = obj.getString("ingredients_text");
            if (obj.has("ingredients_text_debug"))
                product.ingredientsTextDebug = obj.getString("ingredients_text_debug");
            if (obj.has("ingredients_text_with_allergens"))
                product.ingredientsTextWithAllergens = obj.getString("ingredients_text_with_allergens");
            if (obj.has("ingredients_that_may_be_from_palm_oil_n"))
                product.ingredientsThatMayBeFromPalmOilN = obj.getInt("ingredients_that_may_be_from_palm_oil_n");
            if (obj.has("ingredients_that_may_be_from_palm_oil_tags"))
                product.ingredientsThatMayBeFromPalmOilTags = IngredientsThatMayBeFromPalmOilTags.pupolateCollection(obj.getJSONArray("ingredients_that_may_be_from_palm_oil_tags"), product);
            if (obj.has("interface_version_created"))
                product.interfaceVersionCreated = obj.getString("interface_version_created");
            if (obj.has("interface_version_modified"))
                product.interfaceVersionModified = obj.getString("interface_version_modified");
            if (obj.has("_keywords"))
                product.keywords = Keywords.pupolateCollection(obj.getJSONArray("_keywords"), product);
            if (obj.has("known_ingredients_n"))
                product.knownIngredientsN = obj.getInt("known_ingredients_n");
            if (obj.has("labels"))
                product.labels = obj.getString("labels");
            if (obj.has("labels_hierarchy"))
                product.labelsHierarchy = LabelsHierarchy.pupolateCollection(obj.getJSONArray("labels_hierarchy"), product);
            if (obj.has("labels_lc"))
                product.labelsLc = obj.getString("labels_lc");
            if (obj.has("labels_prev_hierarchy"))
                product.labelsPrevHierarchy = LabelsPrevHierarchy.pupolateCollection(obj.getJSONArray("labels_prev_hierarchy"), product);
            if (obj.has("labels_prev_tags"))
                product.labelsPrevTags = LabelsPrevTags.pupolateCollection(obj.getJSONArray("labels_prev_tags"), product);
            if (obj.has("labels_tags"))
                product.labelsTags = LabelsTags.pupolateCollection(obj.getJSONArray("labels_tags"), product);
            if (obj.has("labels_debug_tags"))
                product.labelsDebugTags = LabelsDebugTags.pupolateCollection(obj.getJSONArray("labels_debug_tags"), product);
            if (obj.has("lang"))
                product.lang = obj.getString("lang");
            if (obj.has("lang_debug_tags"))
                product.langDebugTags = LangDebugTags.pupolateCollection(obj.getJSONArray("lang_debug_tags"), product);
            if (obj.has("languages_hierarchy"))
                product.languagesHierarchy = LanguagesHierarchy.pupolateCollection(obj.getJSONArray("languages_hierarchy"), product);
            if (obj.has("languages_tags"))
                product.languagesTags = LanguagesTags.pupolateCollection(obj.getJSONArray("languages_tags"), product);
            if (obj.has("last_edit_dates_tags"))
                product.lastEditDatesTags = LastEditDatesTags.pupolateCollection(obj.getJSONArray("last_edit_dates_tags"), product);
            if (obj.has("last_editor"))
                product.lastEditor = obj.getString("last_editor");
            if (obj.has("last_image_dates_tags"))
                product.lastImageDatesTags = LastImageDatesTags.pupolateCollection(obj.getJSONArray("last_image_dates_tags"), product);
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
                product.linkDebugTags = LinkDebugTags.pupolateCollection(obj.getJSONArray("link_debug_tags"), product);
            if (obj.has("manufacturing_places"))
                product.manufacturingPlaces = obj.getString("manufacturing_places");
            if (obj.has("manufacturing_places_debug_tags"))
                product.manufacturingPlacesDebugTags = ManufacturingPlacesDebugTags.pupolateCollection(obj.getJSONArray("manufacturing_places_debug_tags"), product);
            if (obj.has("manufacturing_places_tags"))
                product.manufacturingPlacesTags = ManufacturingPlacesTags.pupolateCollection(obj.getJSONArray("manufacturing_places_tags"), product);
            if (obj.has("max_imgid"))
                product.maxImgid = obj.getString("max_imgid");
            if (obj.has("minerals_prev_tags"))
                product.mineralsPrevTags = MineralsPrevTags.pupolateCollection(obj.getJSONArray("minerals_prev_tags"), product);
            if (obj.has("minerals_tags"))
                product.mineralsTags = MineralsTags.pupolateCollection(obj.getJSONArray("minerals_tags"), product);
            if (obj.has("misc_tags"))
                product.miscTags = MiscTags.pupolateCollection(obj.getJSONArray("misc_tags"), product);
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
                product.novaGroupTags = NovaGroupTags.pupolateCollection(obj.getJSONArray("nova_group_tags"), product);
            if (obj.has("nova_groups_tags"))
                product.novaGroupsTags = NovaGroupsTags.pupolateCollection(obj.getJSONArray("nova_groups_tags"), product);
            if (obj.has("nucleotides_prev_tags"))
                product.nucleotidesPrevTags = NucleotidesPrevTags.pupolateCollection(obj.getJSONArray("nucleotides_prev_tags"), product);
            if (obj.has("nucleotides_tags"))
                product.nucleotidesTags = NucleotidesTags.pupolateCollection(obj.getJSONArray("nucleotides_tags"), product);
            if (obj.has("nutrient_levels_tags"))
                product.nutrientLevelsTags = NutrientLevelsTags.pupolateCollection(obj.getJSONArray("nutrient_levels_tags"), product);
            if (obj.has("nutrition_data"))
                product.nutritionData = obj.getString("nutrition_data");
            if (obj.has("nutrition_data_per_debug_tags"))
                product.nutritionDataPerDebugTags = NutritionDataPerDebugTags.pupolateCollection(obj.getJSONArray("nutrition_data_per_debug_tags"), product);
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
                product.nutritionGradesTags = NutritionGradesTags.pupolateCollection(obj.getJSONArray("nutrition_grades_tags"), product);
            if (obj.has("origins"))
                product.origins = obj.getString("origins");
            if (obj.has("origins_debug_tags"))
                product.originsDebugTags = OriginsDebugTags.pupolateCollection(obj.getJSONArray("origins_debug_tags"), product);
            if (obj.has("origins_tags"))
                product.originsTags = OriginsTags.pupolateCollection(obj.getJSONArray("origins_tags"), product);
            if (obj.has("other_information"))
                product.otherInformation = obj.getString("other_information");
            if (obj.has("other_nutritional_substances_tags"))
                product.otherNutritionalSubstancesTags = OtherNutritionalSubstancesTags.pupolateCollection(obj.getJSONArray("other_nutritional_substances_tags"), product);
            if (obj.has("packaging"))
                product.packaging = obj.getString("packaging");
            if (obj.has("packaging_debug_tags"))
                product.packagingDebugTags = PackagingDebugTags.pupolateCollection(obj.getJSONArray("packaging_debug_tags"), product);
            if (obj.has("packaging_tags"))
                product.packagingTags = PackagingTags.pupolateCollection(obj.getJSONArray("packaging_tags"), product);
            if (obj.has("photographers_tags"))
                product.photographersTags = PhotographersTags.pupolateCollection(obj.getJSONArray("photographers_tags"), product);
            if (obj.has("pnns_groups_1"))
                product.pnnsGroups1 = obj.getString("pnns_groups_1");
            if (obj.has("pnns_groups_2"))
                product.pnnsGroups2 = obj.getString("pnns_groups_2");
            if (obj.has("pnns_groups_1_tags"))
                product.pnnsGroups1Tags = PnnsGroups1Tags.pupolateCollection(obj.getJSONArray("pnns_groups_1_tags"), product);
            if (obj.has("pnns_groups_2_tags"))
                product.pnnsGroups2Tags = PnnsGroups2Tags.pupolateCollection(obj.getJSONArray("pnns_groups_2_tags"), product);
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
                product.purchasePlacesDebugTags = PurchasePlacesDebugTags.pupolateCollection(obj.getJSONArray("purchase_places_debug_tags"), product);
            if (obj.has("purchase_places_tags"))
                product.purchasePlacesTags = PurchasePlacesTags.pupolateCollection(obj.getJSONArray("purchase_places_tags"), product);
            if (obj.has("quality_tags"))
                product.qualityTags = QualityTags.pupolateCollection(obj.getJSONArray("quality_tags"), product);
            if (obj.has("quantity"))
                product.quantity = obj.getString("quantity");
            if (obj.has("quantity_debug_tags"))
                product.quantityDebugTags = QuantityDebugTags.pupolateCollection(obj.getJSONArray("quantity_debug_tags"), product);
            if (obj.has("recycling_instructions_to_discard"))
                product.recyclingInstructionsToDiscard = obj.getString("recycling_instructions_to_discard");
            if (obj.has("rev"))
                product.rev = obj.getInt("rev");
            if (obj.has("serving_quantity"))
                product.servingQuantity = obj.getString("serving_quantity");
            if (obj.has("serving_size"))
                product.servingSize = obj.getString("serving_size");
            if (obj.has("serving_size_debug_tags"))
                product.servingSizeDebugTags = ServingSizeDebugTags.pupolateCollection(obj.getJSONArray("serving_size_debug_tags"), product);
            if (obj.has("sortkey"))
                product.sortkey = obj.getLong("sortkey");
            if (obj.has("states"))
                product.states = obj.getString("states");
            if (obj.has("states_hierarchy"))
                product.statesHierarchy = StatesHierarchy.pupolateCollection(obj.getJSONArray("states_hierarchy"), product);
            if (obj.has("states_tags"))
                product.statesTags = StatesTags.pupolateCollection(obj.getJSONArray("states_tags"), product);
            if (obj.has("stores"))
                product.stores = obj.getString("stores");
            if (obj.has("stores_debug_tags"))
                product.storesDebugTags = StoresDebugTags.pupolateCollection(obj.getJSONArray("stores_debug_tags"), product);
            if (obj.has("stores_tags"))
                product.storesTags = StoresTags.pupolateCollection(obj.getJSONArray("stores_tags"), product);
            if (obj.has("traces"))
                product.traces = obj.getString("traces");
            if (obj.has("traces_from_ingredients"))
                product.tracesFromIngredients = obj.getString("traces_from_ingredients");
            if (obj.has("traces_hierarchy"))
                product.tracesHierarchy = TracesHierarchy.pupolateCollection(obj.getJSONArray("traces_hierarchy"), product);
            if (obj.has("traces_debug_tags"))
                product.tracesDebugTags = TracesDebugTags.pupolateCollection(obj.getJSONArray("traces_debug_tags"), product);
            if (obj.has("traces_from_user"))
                product.tracesFromUser = obj.getString("traces_from_user");
            if (obj.has("traces_lc"))
                product.tracesLc = obj.getString("traces_lc");
            if (obj.has("traces_tags"))
                product.tracesTags = TracesTags.pupolateCollection(obj.getJSONArray("traces_tags"), product);
            if (obj.has("unknown_ingredients_n"))
                product.unknownIngredientsN = obj.getInt("unknown_ingredients_n");
            if (obj.has("unknown_nutrients_tags"))
                product.unknownNutrientsTags = UnknownNutrientsTags.pupolateCollection(obj.getJSONArray("unknown_nutrients_tags"), product);
            if (obj.has("update_key"))
                product.updateKey = obj.getString("update_key");
            if (obj.has("vitamins_prev_tags"))
                product.vitaminsPrevTags = VitaminsPrevTags.pupolateCollection(obj.getJSONArray("vitamins_prev_tags"), product);
            if (obj.has("vitamins_tags"))
                product.vitaminsTags = VitaminsTags.pupolateCollection(obj.getJSONArray("vitamins_tags"), product);
        } catch (JSONException e) {
            String error = "";
        }
        return product;
    }

    private static Collection<String> pupolateCollection(JSONArray fields) {
        Collection<String> values = new ArrayList<>();
        for (int i = 0; i < fields.length(); i++) {
            try {
                values.add(fields.get(i).toString());
            } catch (JSONException exception) {

            }
        }
        return values;
    }

    public boolean create(DatabaseManager dm) {
        try {
            Dao<Product, Integer> dao = dm.getDao(Product.class);
            dao.create(this);
            return true;
        } catch (SQLException e) {
            String x = "";
           return false;
        }
    }
}
