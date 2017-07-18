package com.kasyanov.vk.mvp.view;

import com.kasyanov.vk.mvp.model.AdvertVO;

import java.util.List;

public interface MainView extends BaseView {
    void onAdvertLoaded(List<AdvertVO> adverts);

    void onShowDialog(String message);

    void onHideDialog();

    void onShowToast(String message);
}