package com.kasyanov.vk.mvp.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Advert {
    /**
     * id : d3b75234
     * link : http://msk.am.ru/used/mazda/cx_7/prv--d3b75234/
     * brand : Mazda
     * brandId : 10
     * model : CX-7
     * modelId : 865
     * generation : 1 поколение [рестайлинг]
     * generationId : 5239
     * modification : 2.3 T AT AWD (238 л. с.)
     * pseudoModel :
     * year : 2011
     * prices : {"EUR":13480,"USD":14285,"RUR":930000}
     * transmission : Автомат
     * condition : отличное
     * mileage : 118000
     * engineVol : 2.3
     * engineType : Бензин
     * enginePower : 238
     * driveType : Полный
     * bodyType : Кроссовер
     * wheel : Левый
     * country :
     * warranty : false
     * cleared : true
     * views : 172
     * color : белый
     * colorCode : ffffff
     * colorEffect : Перламутр
     * doorsNum : 5
     * photos : [{"xxl":"http://s9.media.am.ru/automobile_m3/document/xxl/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg","xl":"http://s2.media.am.ru/automobile_m3/document/xl/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg","l":"http://s9.media.am.ru/automobile_m3/document/l/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg","m":"http://s4.media.am.ru/automobile_m3/document/m/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg","s":"http://s2.media.am.ru/automobile_m3/document/s/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg","xs":"http://s9.media.am.ru/automobile_m3/document/xs/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg"},{"xxl":"http://s1.media.am.ru/automobile_m3/document/xxl/6/4b/64be8cae67d5429987185163d79dcec0.jpg","xl":"http://s8.media.am.ru/automobile_m3/document/xl/6/4b/64be8cae67d5429987185163d79dcec0.jpg","l":"http://s9.media.am.ru/automobile_m3/document/l/6/4b/64be8cae67d5429987185163d79dcec0.jpg","m":"http://s8.media.am.ru/automobile_m3/document/m/6/4b/64be8cae67d5429987185163d79dcec0.jpg","s":"http://s2.media.am.ru/automobile_m3/document/s/6/4b/64be8cae67d5429987185163d79dcec0.jpg","xs":"http://s9.media.am.ru/automobile_m3/document/xs/6/4b/64be8cae67d5429987185163d79dcec0.jpg"},{"xxl":"http://s3.media.am.ru/automobile_m3/document/xxl/1/38/138d72d8e55847347ee15f981b94d1b2.jpg","xl":"http://s6.media.am.ru/automobile_m3/document/xl/1/38/138d72d8e55847347ee15f981b94d1b2.jpg","l":"http://s7.media.am.ru/automobile_m3/document/l/1/38/138d72d8e55847347ee15f981b94d1b2.jpg","m":"http://s2.media.am.ru/automobile_m3/document/m/1/38/138d72d8e55847347ee15f981b94d1b2.jpg","s":"http://s10.media.am.ru/automobile_m3/document/s/1/38/138d72d8e55847347ee15f981b94d1b2.jpg","xs":"http://s5.media.am.ru/automobile_m3/document/xs/1/38/138d72d8e55847347ee15f981b94d1b2.jpg"},{"xxl":"http://s7.media.am.ru/automobile_m3/document/xxl/2/4e/24eb7de23158c0645ad8aa79282ccc54.jpg","xl":"http://s8.media.am.ru/automobile_m3/document/xl/2/4e/24eb7de23158c0645ad8aa79282ccc54.jpg","l":"http://s9.media.am.ru/automobile_m3/document/l/2/4e/24eb7de23158c0645ad8aa79282ccc54.jpg","m":"http://s8.media.am.ru/automobile_m3/document/m/2/4e/24eb7de23158c0645ad8aa79282ccc54.jpg","s":"http://s10.media.am.ru/automobile_m3/document/s/2/4e/24eb7de23158c0645ad8aa79282ccc54.jpg","xs":"http://s9.media.am.ru/automobile_m3/document/xs/2/4e/24eb7de23158c0645ad8aa79282ccc54.jpg"},{"xxl":"http://s6.media.am.ru/automobile_m3/document/xxl/8/e4/8e4fec58e1e752c0c36e4f4baec0fc45.jpg","xl":"http://s3.media.am.ru/automobile_m3/document/xl/8/e4/8e4fec58e1e752c0c36e4f4baec0fc45.jpg","l":"http://s8.media.am.ru/automobile_m3/document/l/8/e4/8e4fec58e1e752c0c36e4f4baec0fc45.jpg","m":"http://s9.media.am.ru/automobile_m3/document/m/8/e4/8e4fec58e1e752c0c36e4f4baec0fc45.jpg","s":"http://s5.media.am.ru/automobile_m3/document/s/8/e4/8e4fec58e1e752c0c36e4f4baec0fc45.jpg","xs":"http://s4.media.am.ru/automobile_m3/document/xs/8/e4/8e4fec58e1e752c0c36e4f4baec0fc45.jpg"},{"xxl":"http://s2.media.am.ru/automobile_m3/document/xxl/c/d9/cd9e5677e52bfd7c0dc2961400eceae3.jpg","xl":"http://s7.media.am.ru/automobile_m3/document/xl/c/d9/cd9e5677e52bfd7c0dc2961400eceae3.jpg","l":"http://s4.media.am.ru/automobile_m3/document/l/c/d9/cd9e5677e52bfd7c0dc2961400eceae3.jpg","m":"http://s9.media.am.ru/automobile_m3/document/m/c/d9/cd9e5677e52bfd7c0dc2961400eceae3.jpg","s":"http://s1.media.am.ru/automobile_m3/document/s/c/d9/cd9e5677e52bfd7c0dc2961400eceae3.jpg","xs":"http://s10.media.am.ru/automobile_m3/document/xs/c/d9/cd9e5677e52bfd7c0dc2961400eceae3.jpg"}]
     * city : Москва
     * vip : true
     * seller : individual
     * dealerIsOfficial : false
     * up : true
     * haggle : true
     * date : 15.11.2016 14:08
     * new : 0
     * actualizationDate : 16.11.2016 16:05
     * createdAt : 15.11.2016 14:08
     * phones : +7 (916) 930-53-44
     * owners : 1
     * options :
     * contacts : {"seller":"Дмитрий","phones":[{"phone":"+7 (916) 930-53-44","time":null,"ext":null}],"city":"Москва","address":"М. Отрадное","anonymous":false}
     * techStruct :
     * faults :
     * impressions : 0
     * description :
     * status : null
     * statusId : 1
     * hasVideo : false
     * isCrashed : false
     * isCustom : true
     * isSubNew : false
     * videos : []
     * isPaidPub : false
     * paidPubEndDate : null
     * paidPubDays : null
     * pubEndDate : 01.01.1970 0:00
     * kladdrId : 175849
     */

    private String id;
    private String link;
    private String brand;
    private int brandId;
    private String model;
    private int modelId;
    private String generation;
    private int generationId;
    private String modification;
    private String pseudoModel;
    private String year;
    private Prices prices;
    private String transmission;
    private String condition;
    private String mileage;
    private String engineVol;
    private String engineType;
    private String enginePower;
    private String driveType;
    private String bodyType;
    private String wheel;
    private String country;
    private boolean warranty;
    private boolean cleared;
    private String views;
    private String color;
    private String colorCode;
    private String colorEffect;
    private String doorsNum;
    private String city;
    private boolean vip;
    private String seller;
    private boolean dealerIsOfficial;
    private boolean up;
    private boolean haggle;
    private String date;
    @SerializedName("new")
    private String newX;
    private String actualizationDate;
    private String createdAt;
    private String phones;
    private String owners;
    private String options;
    private Contact contacts;
    private String techStruct;
    private String faults;
    private int impressions;
    private String description;
    private Object status;
    private int statusId;
    private boolean hasVideo;
    private boolean isCrashed;
    private boolean isCustom;
    private boolean isSubNew;
    private boolean isPaidPub;
    private Object paidPubEndDate;
    private Object paidPubDays;
    private String pubEndDate;
    private String kladdrId;
    private List<Photo> photos;
    private List<?> videos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getGenerationId() {
        return generationId;
    }

    public void setGenerationId(int generationId) {
        this.generationId = generationId;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public String getPseudoModel() {
        return pseudoModel;
    }

    public void setPseudoModel(String pseudoModel) {
        this.pseudoModel = pseudoModel;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getEngineVol() {
        return engineVol;
    }

    public void setEngineVol(String engineVol) {
        this.engineVol = engineVol;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    public boolean isCleared() {
        return cleared;
    }

    public void setCleared(boolean cleared) {
        this.cleared = cleared;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorEffect() {
        return colorEffect;
    }

    public void setColorEffect(String colorEffect) {
        this.colorEffect = colorEffect;
    }

    public String getDoorsNum() {
        return doorsNum;
    }

    public void setDoorsNum(String doorsNum) {
        this.doorsNum = doorsNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public boolean isDealerIsOfficial() {
        return dealerIsOfficial;
    }

    public void setDealerIsOfficial(boolean dealerIsOfficial) {
        this.dealerIsOfficial = dealerIsOfficial;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isHaggle() {
        return haggle;
    }

    public void setHaggle(boolean haggle) {
        this.haggle = haggle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNewX() {
        return newX;
    }

    public void setNewX(String newX) {
        this.newX = newX;
    }

    public String getActualizationDate() {
        return actualizationDate;
    }

    public void setActualizationDate(String actualizationDate) {
        this.actualizationDate = actualizationDate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public Contact getContacts() {
        return contacts;
    }

    public void setContacts(Contact contacts) {
        this.contacts = contacts;
    }

    public String getTechStruct() {
        return techStruct;
    }

    public void setTechStruct(String techStruct) {
        this.techStruct = techStruct;
    }

    public String getFaults() {
        return faults;
    }

    public void setFaults(String faults) {
        this.faults = faults;
    }

    public int getImpressions() {
        return impressions;
    }

    public void setImpressions(int impressions) {
        this.impressions = impressions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public boolean isHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public boolean isIsCrashed() {
        return isCrashed;
    }

    public void setIsCrashed(boolean isCrashed) {
        this.isCrashed = isCrashed;
    }

    public boolean isIsCustom() {
        return isCustom;
    }

    public void setIsCustom(boolean isCustom) {
        this.isCustom = isCustom;
    }

    public boolean isIsSubNew() {
        return isSubNew;
    }

    public void setIsSubNew(boolean isSubNew) {
        this.isSubNew = isSubNew;
    }

    public boolean isIsPaidPub() {
        return isPaidPub;
    }

    public void setIsPaidPub(boolean isPaidPub) {
        this.isPaidPub = isPaidPub;
    }

    public Object getPaidPubEndDate() {
        return paidPubEndDate;
    }

    public void setPaidPubEndDate(Object paidPubEndDate) {
        this.paidPubEndDate = paidPubEndDate;
    }

    public Object getPaidPubDays() {
        return paidPubDays;
    }

    public void setPaidPubDays(Object paidPubDays) {
        this.paidPubDays = paidPubDays;
    }

    public String getPubEndDate() {
        return pubEndDate;
    }

    public void setPubEndDate(String pubEndDate) {
        this.pubEndDate = pubEndDate;
    }

    public String getKladdrId() {
        return kladdrId;
    }

    public void setKladdrId(String kladdrId) {
        this.kladdrId = kladdrId;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<?> getVideos() {
        return videos;
    }

    public void setVideos(List<?> videos) {
        this.videos = videos;
    }
}