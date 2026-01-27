package com.myclass;

// class user bersifat abstract
abstract class User {
    // Property
    private String nama = "tidak ada nama";
    private int umur = 0;
    private String jenisKelamin = "tidak ada jenis kelamin";

    public abstract String tampilJenisUser();

    public User(String nama, int umur, String jenisKelamin){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    // method atau behavior wajib
    public void cetakInfoUser(){
        System.out.print("Nama : " +  this.nama+ ", Umur : " +  this.umur+"tahun, Jenis Kelamin : " + this.jenisKelamin);
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
}
