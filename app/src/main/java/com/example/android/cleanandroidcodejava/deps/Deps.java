package com.example.android.cleanandroidcodejava.deps;

import com.example.android.cleanandroidcodejava.home.HomeActivity;
import com.example.android.cleanandroidcodejava.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Arif Ikhsanudin on Tuesday, 13 November 2018.
 */

@Singleton
@Component(modules = {NetworkModule.class})
public interface Deps {
    void inject(HomeActivity homeActivity);
}
