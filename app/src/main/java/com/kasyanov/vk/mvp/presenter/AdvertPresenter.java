package com.kasyanov.vk.mvp.presenter;

import com.kasyanov.vk.api.AdvertsApiService;
import com.kasyanov.vk.db.Storage;
import com.kasyanov.vk.mapper.AdvertMapper;
import com.kasyanov.vk.mvp.model.AdvertVO;
import com.kasyanov.vk.mvp.model.request.AdvertsRequest;
import com.kasyanov.vk.mvp.model.response.AdvertsResponse;
import com.kasyanov.vk.mvp.view.MainView;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;

public class AdvertPresenter extends BasePresenter<MainView> implements Observer<AdvertsResponse> {
    @Inject
    protected AdvertsApiService mApiService;
    @Inject
    protected AdvertMapper mAdvertMapper;
    @Inject
    protected Storage mStorage;

    @Inject
    public AdvertPresenter() {
    }

    public void getAdverts(AdvertsRequest advertsRequest) {
        getView().onShowDialog("Loading adverts...");
        Observable<AdvertsResponse> carsResponseObservable = mApiService.getCars(advertsRequest);
        subscribe(carsResponseObservable, this);
    }

    @Override
    public void onCompleted() {
        getView().onHideDialog();
        getView().onShowToast("Adverts loading complete!");
    }

    @Override
    public void onError(Throwable e) {
        getView().onHideDialog();
        getView().onShowToast("Error loading adverts " + e.getMessage());
    }

    @Override
    public void onNext(AdvertsResponse carsResponse) {
        if (carsResponse != null) {
            if (carsResponse.getResult() != null) {
                List adverts = carsResponse.getResult().getAdverts();
                List<AdvertVO> advertsVO = mAdvertMapper.mapAdverts(carsResponse.getResult().getAdverts());
                mStorage.saveAdverts(adverts);
                getView().onAdvertLoaded(advertsVO);
            }
        }
    }

    public void getAdvertsFromDatabase() {
        List<AdvertVO> adverts = mAdvertMapper.mapAdverts(mStorage.getSavedAdverts());
        getView().onAdvertLoaded(adverts);
    }
}
