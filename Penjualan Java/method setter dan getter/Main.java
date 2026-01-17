package com.program;
import com.myclass.Barang;
import com.myclass.Penjual;
import com.myclass.Pembeli;

public class Main {
    public static void main(String[] args) {
        // instansiasi objek dari class barang
        Barang barang1 = new Barang();
        barang1.setNamaBarang("Motherboard");
        barang1.setHargaBarang(550000);
        barang1.setStokBarang(77);
        barang1.cetakInfoBarang();


        //instansiasi objek dari class Penjual
        Penjual penjual1 = new Penjual();
        penjual1.setNama("Udin");
        penjual1.setUmur(21);
        penjual1.setJenisKelamin("Laki-laki");
        penjual1.setLamaKerjaPerTahun(2);
        penjual1.cetakInfoPenjual();

        // instansiasi objek dari clas Pembeli
        Pembeli pembeli1 = new Pembeli();
        pembeli1.setNama("Siti");
        pembeli1.setUmur(19);
        pembeli1.setJenisKelamin("Perempuan");
        pembeli1.setNoTelp("0812345671");
        pembeli1.setAlamat("Jakarta");
        pembeli1.cetakInfoPembeli();
    }
}
