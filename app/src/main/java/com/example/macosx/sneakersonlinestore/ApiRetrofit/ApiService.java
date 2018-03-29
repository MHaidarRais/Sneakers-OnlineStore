package com.example.macosx.sneakersonlinestore.ApiRetrofit;

import com.example.macosx.sneakersonlinestore.ResponseServer.Response;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Hoidar on 3/29/18.
 */

public interface ApiService {
    @GET("read_data.php")
    Call<Response> response_read_data();
}
