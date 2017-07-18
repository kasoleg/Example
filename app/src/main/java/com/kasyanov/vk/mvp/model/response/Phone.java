package com.kasyanov.vk.mvp.model.response;

public class Phone {
    /**
     * phone : +7 (916) 930-53-44
     * time : null
     * ext : null
     */

    private String phone;
    private Object time;
    private Object ext;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getTime() {
        return time;
    }

    public void setTime(Object time) {
        this.time = time;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }
}