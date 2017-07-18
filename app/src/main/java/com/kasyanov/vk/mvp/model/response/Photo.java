package com.kasyanov.vk.mvp.model.response;

public class Photo {
    /**
     * xxl : http://s9.media.am.ru/automobile_m3/document/xxl/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg
     * xl : http://s2.media.am.ru/automobile_m3/document/xl/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg
     * l : http://s9.media.am.ru/automobile_m3/document/l/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg
     * m : http://s4.media.am.ru/automobile_m3/document/m/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg
     * s : http://s2.media.am.ru/automobile_m3/document/s/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg
     * xs : http://s9.media.am.ru/automobile_m3/document/xs/f/48/f489a9a76c2a9a95cf6d969a544c8eda.jpg
     */

    private String xxl;
    private String xl;
    private String l;
    private String m;
    private String s;
    private String xs;

    public String getXxl() {
        return xxl;
    }

    public void setXxl(String xxl) {
        this.xxl = xxl;
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getXs() {
        return xs;
    }

    public void setXs(String xs) {
        this.xs = xs;
    }
}