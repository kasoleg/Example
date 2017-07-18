package com.kasyanov.vk.mvp.model.request;

public class Query {
    private int page;
    private int pageSize;

    public Query() {
        page = 0;
        pageSize = 10;
    }

    public Query(int page, int pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
