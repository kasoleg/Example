package com.kasyanov.vk.di.components;

import com.kasyanov.vk.di.modules.AdvertModule;
import com.kasyanov.vk.di.scopes.PerActivity;
import com.kasyanov.vk.modules.home.MainActivity;

import dagger.Component;

@PerActivity
@Component(modules = AdvertModule.class, dependencies = ApplicationComponent.class)
public interface AdvertComponent {
    void inject(MainActivity activity);
}
