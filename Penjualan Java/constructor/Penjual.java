package com.myclass;
public class Penjual {

    // Propery
    public String nama;
    public int umur;
    public String jenisKelamin;
    public int lamaKerjaPerTahun;

    // constructor
    public Penjual(String nama, int umur, String jenisKelamin, int lamaKerjaPerTahun){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.lamaKerjaPerTahun = lamaKerjaPerTahun;
    }

    // Method
    public void cetakInfoPenjual(){
        System.out.println("Nama Penjual : " + nama + ", Umur Penjual : " + umur + "tahun, Jenis Kelamin : " + jenisKelamin + ", Lama Kerja PerTahun : " + lamaKerjaPerTahun +"tahun.\n");
    }
}
