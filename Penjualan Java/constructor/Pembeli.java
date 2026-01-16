package com.myclass;
public class Pembeli {

    // Property
    public String nama;
    public int umur;
    public String jenisKelamin;
    public String noTelp;
    public String alamat;
    
    // constructor
    public Pembeli(String nama, int umur, String jenisKelamin, String noTelp, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.noTelp = noTelp;
        this.alamat = alamat;
    }

    // Method
    public void cetakInfoPembeli(){
        System.out.println("Nama Pembeli : " +  nama+ ", Umur Pembeli : " +  umur+"tahun, Jenis Kelamin : " + jenisKelamin + ", No Telepon : " + noTelp + ", Alamat Pembeli : " + alamat +".\n");
    }
}
