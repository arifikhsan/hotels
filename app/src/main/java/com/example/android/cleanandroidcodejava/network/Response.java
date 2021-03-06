package com.example.android.cleanandroidcodejava.network;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Arif Ikhsanudin on Tuesday, 13 November 2018.
 */

public class Response {
    @SerializedName("status")
    public String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @SuppressWarnings({"unused", "used by Retrofit"})
    public Response() {
    }

    public Response(String status) {
        this.status = status;
    }
}

