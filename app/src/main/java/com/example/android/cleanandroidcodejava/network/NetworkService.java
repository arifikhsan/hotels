package com.example.android.cleanandroidcodejava.network;

import com.example.android.cleanandroidcodejava.models.CityListResponse;

import javax.annotation.Generated;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Arif Ikhsanudin on Tuesday, 13 November 2018.
 */

public interface NetworkService {

    @GET("v1/city")
    Observable<CityListResponse> getCityList();

}
