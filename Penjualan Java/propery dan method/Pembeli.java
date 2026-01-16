package com.myclass;
public class Pembeli {

    // Property
    public String nama;
    public int umur;
    public String jenisKelamin;
    public String noTelp;
    public String alamat;

    // Method
    public void cetakInfoPembeli(){
        System.out.println("Nama Pembeli : " + nama + ", Umur Pembeli : " + umur +"tahun, Jenis Kelamin : " + jenisKelamin + ", No Telepon : " + noTelp + ", Alamat Pembeli : " + alamat +".\n");
    }
}
