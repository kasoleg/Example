package com.kasyanov.vk.application;

import android.app.Application;

import com.kasyanov.vk.di.components.ApplicationComponent;
import com.kasyanov.vk.di.components.DaggerApplicationComponent;
import com.kasyanov.vk.di.modules.ApplicationModule;

public class AMApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationComponent();
    }

    private void initializeApplicationComponent() {
        mApplicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this, "http://am.ru"))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
