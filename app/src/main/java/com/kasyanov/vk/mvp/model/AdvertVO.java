package com.kasyanov.vk.mvp.model;

public class AdvertVO {
    private String brand;
    private String model;
    private String generation;
    private String price;
    private String year;
    private String mileage;
    private String imageUrl;

    public AdvertVO(String brand, String model, String generation, String price, String year, String mileage, String imageUrl) {
        this.brand = brand;
        this.model = model;
        this.generation = generation;
        this.price = price;
        this.year = year;
        this.mileage = mileage;
        this.imageUrl = imageUrl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
