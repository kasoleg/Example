package com.kasyanov.vk.mvp.model.response;

import java.util.List;

public class Contact {
    /**
     * seller : Дмитрий
     * phones : [{"phone":"+7 (916) 930-53-44","time":null,"ext":null}]
     * city : Москва
     * address : М. Отрадное
     * anonymous : false
     */

    private String seller;
    private String city;
    private String address;
    private boolean anonymous;
    private List<Phone> phones;

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}