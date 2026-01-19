package com.myclass;
public class Pembeli {

    // Property
    public String nama;
    public int umur;
    public String jenisKelamin;
    public String noTelp;
    public String alamat;
    
    // constructor
    public Pembeli(){}
    public Pembeli(String nama, int umur, String jenisKelamin, String noTelp, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.noTelp = noTelp;
        this.alamat = alamat;
    }

    // method atau behavior wajib
    public void cetakInfoPembeli(){
        System.out.println("Nama Pembeli : " +  this.nama+ ", Umur Pembeli : " +  this.umur+"tahun, Jenis Kelamin : " + this.jenisKelamin + ", No Telepon : " + this.noTelp + ", Alamat Pembeli : " + this.alamat +".\n");
    }

    //Method Setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    // Method Getter
    public String getNama(){
        return this.nama;
    }
    public int getUmur(){
        return this.umur;
    }
    public String getJenisKelamin(){
        return this.jenisKelamin;
    }
    public String getNoTelp(){
        return this.noTelp;
    }
    public String getAlamat(){
        return this.alamat;
    }
}
