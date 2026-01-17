package com.myclass;
public class Penjual {

    // Propery
    public String nama;
    public int umur;
    public String jenisKelamin;
    public int lamaKerjaPerTahun;

    // constructor
    public Penjual(){}
    public Penjual(String nama, int umur, String jenisKelamin, int lamaKerjaPerTahun){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.lamaKerjaPerTahun = lamaKerjaPerTahun;
    }

    // method atau behavior wajib
    public void cetakInfoPenjual() {
        System.out.println("Nama Penjual : " + this.nama + ", Umur Penjual : " + this.umur + "tahun, Jenis Kelamin : " + this.jenisKelamin + ", Lama Kerja PerTahun : " + this.lamaKerjaPerTahun + "tahun.\n");
    }

    // Method Setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setLamaKerjaPerTahun(int lamaKerjaPerTahun){
        this.lamaKerjaPerTahun = lamaKerjaPerTahun;
    }

    // Method Getter
    public String getNama(){
        return this.nama;
    }
    public int getUmur(){
        return this.umur;
    }
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    public int getLamaKerjaPerTahun() {
        return this.lamaKerjaPerTahun;
    }
}
