package com.kasyanov.vk.modules.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.kasyanov.vk.BaseActivity;
import com.kasyanov.vk.R;
import com.kasyanov.vk.databinding.ActivityMainBinding;
import com.kasyanov.vk.di.components.DaggerAdvertComponent;
import com.kasyanov.vk.di.modules.AdvertModule;
import com.kasyanov.vk.modules.home.adapter.AdvertAdapter;
import com.kasyanov.vk.modules.home.adapter.EndlessAdvertsScrollListener;
import com.kasyanov.vk.mvp.model.AdvertVO;
import com.kasyanov.vk.mvp.model.request.AdvertsParams;
import com.kasyanov.vk.mvp.model.request.AdvertsRequest;
import com.kasyanov.vk.mvp.model.request.Query;
import com.kasyanov.vk.mvp.presenter.AdvertPresenter;
import com.kasyanov.vk.mvp.view.MainView;
import com.kasyanov.vk.utils.NetworkUtils;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<ActivityMainBinding> implements MainView {
    private AdvertAdapter mAdvertAdapter;
    private AdvertsRequest advertsRequest;

    @Inject
    protected AdvertPresenter mPresenter;

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        initializeList();
        initializeRequest();

        if (NetworkUtils.isNetworkAvailable(this)) {
            mPresenter.getAdverts(advertsRequest);
        } else {
            mPresenter.getAdvertsFromDatabase();
        }
    }

    private void initializeRequest() {
        advertsRequest = new AdvertsRequest(new AdvertsParams(new Query()));
    }

    private void initializeList() {
        binding.advertList.setHasFixedSize(true);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        binding.advertList.setLayoutManager(linearLayoutManager);
        mAdvertAdapter = new AdvertAdapter(getLayoutInflater());
        binding.advertList.setAdapter(mAdvertAdapter);
        binding.advertList.addOnScrollListener(new EndlessAdvertsScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                advertsRequest.getParams().getQuery().setPage(page);
                mPresenter.getAdverts(advertsRequest);
            }
        });
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void resolveDaggerDependency() {
        DaggerAdvertComponent.builder()
                .applicationComponent(getApplicationComponent())
                .advertModule(new AdvertModule(this))
                .build()
                .inject(this);
    }

    @Override
    public void onAdvertLoaded(List<AdvertVO> adverts) {
        mAdvertAdapter.addAdverts(adverts);
    }

    @Override
    public void onShowDialog(String message) {
        if (mAdvertAdapter.getItemCount() == 0) {
            showDialog(message);
        }
    }

    @Override
    public void onHideDialog() {
        hideDialog();
    }

    @Override
    public void onShowToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
