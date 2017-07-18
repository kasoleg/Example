package com.kasyanov.vk.mvp.model.request;

public class AdvertsRequest extends BaseRequest {
    private AdvertsParams params;

    public AdvertsRequest(AdvertsParams params) {
        method = "advert.getAdvertListByQuery";
        this.params = params;
    }

    public AdvertsParams getParams() {
        return params;
    }

    public void setParams(AdvertsParams params) {
        this.params = params;
    }
}
