package com.esteban.timetonictest.data;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    private static final String BASE_URL = "https://timetonic.com/";

    private TimetonicApiService apiService;

    public ApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(TimetonicApiService.class);
    }

    public Call<LoginResponse> login(String email, String password) {
        return apiService.login(email, password);
    }
}
