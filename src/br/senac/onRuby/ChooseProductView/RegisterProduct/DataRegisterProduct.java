package br.senac.onRuby.ChooseProductView.RegisterProduct;

import java.time.LocalDate;

public class DataRegisterProduct {
    
    private Integer idClothes;
    private String categoryClothes;
    private String nameClothes;
    private int quantityClothes;
    private float unitPrice;
    private String sizeClothes;   
    private String nameProvider;
    
    public Integer getIdClothes() {
        return idClothes;
    }

    public void setIdClothes(Integer idClothes) {
        this.idClothes = idClothes;
    }
    
    public String getCategoryClothes() {
        return categoryClothes;
    }

    public void setCategoryClothes(String nameClothes) {
        this.categoryClothes = categoryClothes;
    }
    
    public String getNameClothes() {
        return nameClothes;
    }

    public void setNameClothes(String nameClothes) {
        this.nameClothes = nameClothes;
    }
    
    public int getQuantityClothes() {
        return quantityClothes;
    }

    public void setQuantityClothes(int quantityClothes) {
        this.quantityClothes = quantityClothes;
    }
    
    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public String getSizeClothes() {
        return sizeClothes;
    }

    public void setSizeClothes(String sizeClothes) {
        this.sizeClothes = sizeClothes;
    }
    
    public String getNameProvider() {
        return nameProvider;
    }

    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }
}
