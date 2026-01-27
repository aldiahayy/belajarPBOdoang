package com.myclass;
public class Penjual extends User{

    // Propery
    private int lamaKerjaPerTahun;

    @Override
    public String tampilJenisUser() {
        return "ini Penjual";
    }

    // constructor
    public Penjual(String nama, int umur, String jenisKelamin, int lamaKerjaPerTahun){
        super(nama, umur, jenisKelamin);
        this.lamaKerjaPerTahun = lamaKerjaPerTahun;
    }

    // method atau behavior wajib
    public void cetakInfoUser() {
        super.cetakInfoUser();
        System.out.println(", Lama Kerja PerTahun : " + this.lamaKerjaPerTahun + "tahun.\n");
    }

    // Method Setter
    public void setLamaKerjaPerTahun(int lamaKerjaPerTahun){
        this.lamaKerjaPerTahun = lamaKerjaPerTahun;
    }

    // Method Getter
    public int getLamaKerjaPerTahun() {
        return this.lamaKerjaPerTahun;
    }
}
