package com.example.android.cleanandroidcodejava.home;

import com.example.android.cleanandroidcodejava.models.CityListResponse;

/**
 * Created by Arif Ikhsanudin on Tuesday, 13 November 2018.
 */

public interface HomeView {

    void showWait();
    void removeWait();
    void onFailure(String appErrorMessage);
    void getCityListSuccess(CityListResponse cityListResponse);

}
