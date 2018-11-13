package com.example.android.cleanandroidcodejava.home;

import android.util.Log;

import com.example.android.cleanandroidcodejava.models.CityListResponse;
import com.example.android.cleanandroidcodejava.network.NetworkError;
import com.example.android.cleanandroidcodejava.network.Service;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Arif Ikhsanudin on Tuesday, 13 November 2018.
 */

public class HomePresenter {
    private final Service service;
    private final HomeView view;
    private CompositeSubscription subscriptions;

    public HomePresenter(Service service, HomeView view) {
        this.service = service;
        this.view = view;
        this.subscriptions = new CompositeSubscription();
    }

    public void getCityList() {
        view.showWait();

        Subscription subscription = service.getCityList(new Service.GetCityListCallback() {
            @Override
            public void onSuccess(CityListResponse cityListResponse) {
                view.removeWait();
                view.getCityListSuccess(cityListResponse);
            }

            @Override
            public void onError(NetworkError networkError) {
                view.removeWait();
                view.onFailure(networkError.getAppErrorMessage());
            }

        });

        subscriptions.add(subscription);
    }
    public void onStop() {
        subscriptions.unsubscribe();
    }
}
