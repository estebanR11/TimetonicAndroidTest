package com.esteban.timetonictest.data;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface TimetonicApiService {

    @FormUrlEncoded
    @POST("/createSesskey")
    Call<LoginResponse> login(
            @Field("email") String email,
            @Field("password") String password
    );
}

