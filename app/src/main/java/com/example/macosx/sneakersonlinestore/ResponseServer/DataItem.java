package com.example.macosx.sneakersonlinestore.ResponseServer;

import com.google.gson.annotations.SerializedName;


public class DataItem{

	@SerializedName("merk")
	private String merk;

	@SerializedName("harga")
	private String harga;

	@SerializedName("id")
	private String id;

	@SerializedName("deskripsi")
	private String deskripsi;

	@SerializedName("namabarang")
	private String namabarang;

	public void setMerk(String merk){
		this.merk = merk;
	}

	public String getMerk(){
		return merk;
	}

	public void setHarga(String harga){
		this.harga = harga;
	}

	public String getHarga(){
		return harga;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setDeskripsi(String deskripsi){
		this.deskripsi = deskripsi;
	}

	public String getDeskripsi(){
		return deskripsi;
	}

	public void setNamabarang(String namabarang){
		this.namabarang = namabarang;
	}

	public String getNamabarang(){
		return namabarang;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"merk = '" + merk + '\'' + 
			",harga = '" + harga + '\'' + 
			",id = '" + id + '\'' + 
			",deskripsi = '" + deskripsi + '\'' + 
			",namabarang = '" + namabarang + '\'' + 
			"}";
		}
}