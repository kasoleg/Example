package com.kasyanov.vk.mvp.model.request;

public class AdvertsParams {
    private Query query;

    public AdvertsParams(Query query) {
        this.query = query;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
