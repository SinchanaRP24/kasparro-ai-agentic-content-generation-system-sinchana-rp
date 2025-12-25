package models;

import java.util.List;

public class Product {

    private String name;
    private String concentration;
    private List<String> skinType;
    private List<String> keyIngredients;
    private List<String> benefits;
    private String howToUse;
    private String sideEffects;
    private int price;

    public Product(
            String name,
            String concentration,
            List<String> skinType,
            List<String> keyIngredients,
            List<String> benefits,
            String howToUse,
            String sideEffects,
            int price
    ) {
        this.name = name;
        this.concentration = concentration;
        this.skinType = skinType;
        this.keyIngredients = keyIngredients;
        this.benefits = benefits;
        this.howToUse = howToUse;
        this.sideEffects = sideEffects;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getConcentration() {
        return concentration;
    }

    public List<String> getSkinType() {
        return skinType;
    }

    public List<String> getKeyIngredients() {
        return keyIngredients;
    }

    public List<String> getBenefits() {
        return benefits;
    }

    public String getHowToUse() {
        return howToUse;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public int getPrice() {
        return price;
    }
}

