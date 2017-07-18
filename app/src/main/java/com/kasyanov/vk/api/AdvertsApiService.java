package com.kasyanov.vk.api;

import com.kasyanov.vk.mvp.model.request.AdvertsRequest;
import com.kasyanov.vk.mvp.model.response.AdvertsResponse;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface AdvertsApiService {
    @Headers({
            "X-API-CLIENT: android_app",
            "X-API-KEY: doesnotexist"
    })
    @POST("/rpc-api-0.0.1/")
    Observable<AdvertsResponse> getCars(@Body AdvertsRequest request);
}
