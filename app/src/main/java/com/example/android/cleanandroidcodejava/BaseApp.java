package com.example.android.cleanandroidcodejava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.cleanandroidcodejava.deps.DaggerDeps;
import com.example.android.cleanandroidcodejava.deps.Deps;
import com.example.android.cleanandroidcodejava.network.NetworkModule;

import java.io.File;

/**
 * Created by Arif Ikhsanudin on Tuesday, 13 November 2018.
 */

public class BaseApp extends AppCompatActivity {
    Deps deps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        deps = DaggerDeps
                .builder()
                .networkModule(new NetworkModule(cacheFile))
                .build();
    }

    public Deps getDeps() {
        return deps;
    }

}
