package com.example.macosx.sneakersonlinestore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView namaa,merkk,hargaa,deskripsii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        namaa = findViewById(R.id.namaa);
        merkk = findViewById(R.id.merkk);
        hargaa = findViewById(R.id.hargaa);
        deskripsii = findViewById(R.id.deskripsii);

        String namabarang = getIntent().getStringExtra("Namabarang");
        String merk = getIntent().getStringExtra("merk");
        String harga = getIntent().getStringExtra("harga");
        String deskripsi = getIntent().getStringExtra("deskripsi");

        namaa.setText(namabarang);
        merkk.setText(merk);
        hargaa.setText(harga);
        deskripsii.setText(deskripsi);

    }
}
