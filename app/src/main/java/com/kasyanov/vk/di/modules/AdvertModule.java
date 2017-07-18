package com.kasyanov.vk.di.modules;

import com.kasyanov.vk.api.AdvertsApiService;
import com.kasyanov.vk.di.scopes.PerActivity;
import com.kasyanov.vk.mvp.view.MainView;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class AdvertModule {
    private MainView mView;

    public AdvertModule(MainView view) {
        mView = view;
    }

    @PerActivity
    @Provides
    AdvertsApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(AdvertsApiService.class);
    }

    @PerActivity
    @Provides
    MainView provideView() {
        return mView;
    }
}
