package com.example.macosx.sneakersonlinestore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.macosx.sneakersonlinestore.ResponseServer.DataItem;

import java.util.List;

/**
 * Created by Hoidar on 3/29/18.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    List<DataItem> data;
    public static final String WebUrl = "http://192.168.20.15/online_store/index.php";

    public CustomAdapter(Context context, List<DataItem> dataItems) {
        this.context = context;
        this.data = dataItems;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.listitem, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.namabarang.setText(data.get(position).getNamabarang());
        holder.merk.setText(data.get(position).getMerk());
        holder.harga.setText(data.get(position).getHarga());
        holder.deskripsi.setText(data.get(position).getDeskripsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Namabarang", data.get(position).getNamabarang());
                intent.putExtra("merk",  data.get(position).getMerk());
                intent.putExtra("harga", data.get(position).getHarga());
                intent.putExtra("deskripsi", data.get(position).getDeskripsi());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView namabarang,merk,harga,deskripsi;
        public MyViewHolder(View itemView) {
            super(itemView);

            namabarang = itemView.findViewById(R.id.namabarang);
            merk = itemView.findViewById(R.id.merk);
            harga = itemView.findViewById(R.id.harga);
            deskripsi = itemView.findViewById(R.id.deskripsi);


        }
    }
}
