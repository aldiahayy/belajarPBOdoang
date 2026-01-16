package com.program;
import com.myclass.Barang;
import com.myclass.Penjual;
import com.myclass.Pembeli;

public class Main {
    public static void main(String[] args) {
        // instansiasi objek dari class barang
        Barang barang1 = new Barang();

        // akses propery dalam object
        barang1.namaBarang = "Shampo";
        barang1.hargaBarang = 7000;
        barang1.stokBarang = 100;

        // call method in object
        barang1.cetakInfoBarang();
        barang1.tambahStok(10);
        barang1.cetakInfoBarang();

        // cetak propety menggunakan object
        System.out.println(barang1.namaBarang);
        System.out.println(barang1.hargaBarang);
        System.out.println(barang1.stokBarang);

        // cetak method menggunakan object
        barang1.tambahStok(5);
        barang1.kurangiStok(3);
        System.out.println("Apakah stok barang 1 ada? : " + barang1.cekStok());

        Barang barang2  = new Barang();
        barang2.namaBarang = "Pasta Gigi";
        barang2.hargaBarang = 11000;
        barang2.stokBarang = 77;
        barang2.cetakInfoBarang();

        //instansiasi objek dari class Penjual
        Penjual penjual1 = new Penjual();
        penjual1.nama = "Udin";
        penjual1.umur = 21;
        penjual1.jenisKelamin = "Laki-laki";
        penjual1.lamaKerjaPerTahun = 2;
        penjual1.cetakInfoPenjual();

        // instansiasi objek dari clas Pembeli
        Pembeli pembeli1 = new Pembeli();
        pembeli1.nama = "Siti";
        pembeli1.umur = 19;
        pembeli1.jenisKelamin = "Perempuan";
        pembeli1.noTelp = "0812345671";
        pembeli1.alamat = "Jakarta";
        pembeli1.cetakInfoPembeli();
        pembeli1.nama = "Soleha";
        pembeli1.cetakInfoPembeli();
    }
}
