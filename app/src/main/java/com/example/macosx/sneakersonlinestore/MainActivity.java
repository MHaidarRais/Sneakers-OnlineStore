package com.example.macosx.sneakersonlinestore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.macosx.sneakersonlinestore.ApiRetrofit.ApiService;
import com.example.macosx.sneakersonlinestore.ApiRetrofit.InstanceRetrofit;
import com.example.macosx.sneakersonlinestore.ResponseServer.DataItem;
import com.example.macosx.sneakersonlinestore.ResponseServer.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    RecyclerView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.recyclerview);
        view.setLayoutManager(new LinearLayoutManager(this));
        getData();
    }

    private void getData() {
        ApiService api = InstanceRetrofit.getInstance();
        Call<Response> call = api.response_read_data();
        call.enqueue(new Callback<Response>() {

            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Boolean status = response.body().isSuccess();
                if(status){
                    List<DataItem> dataItems = response.body().getData();
                    CustomAdapter adapter = new CustomAdapter(MainActivity.this, dataItems);
                    view.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }
}