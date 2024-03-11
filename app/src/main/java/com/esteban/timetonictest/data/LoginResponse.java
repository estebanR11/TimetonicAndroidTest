package com.esteban.timetonictest.data;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("success")
    private boolean success;

    @SerializedName("session_token")
    private String sessionToken;

    public boolean isSuccess() {
        return success;
    }

    public String getSessionToken() {
        return sessionToken;
    }
}
