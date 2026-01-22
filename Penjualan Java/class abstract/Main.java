package com.program;
import com.myclass.Penjual;
import com.myclass.Pembeli;
import com.myclass.Keyboard;
import com.myclass.Procesor;

public class Main {
    public static void main(String[] args) {


        Keyboard key1 = new Keyboard("Vortex Series VX7", 1000000, 97, "RGB", 87, "Outemu Blue");
        Keyboard key2 = new Keyboard("Keychron K2", 1200000, 27, "RGB", 84, "Gateron Brown");
        Keyboard key3 = new Keyboard("Rexus Daxa M84 Pro", 1500000, 11, "RGB", 84, "Gateron Red");
        key1.cetakInfoBarang();
        key1.tampilJenisBarang();
        key2.cetakInfoBarang();
        key3.cetakInfoBarang();

        Procesor proc1 = new Procesor("AMD Ryzen 5 3600", 3000000, 24, 3.6, 4.2);
        Procesor proc2 = new Procesor("Intel Core i5 10400", 2400000, 15, 2.9, 4.3);
        proc1.cetakInfoBarang();
        proc2.cetakInfoBarang();

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
