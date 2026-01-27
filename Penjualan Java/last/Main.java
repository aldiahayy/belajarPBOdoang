package com.program;
import com.myclass.Penjual;
import com.myclass.Pembeli;
import com.myclass.Keyboard;
import com.myclass.Procesor;
import com.myclass.Transaksi;

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
        Penjual penjual1 = new Penjual("Udin", 21, "Laki-laki", 2);
        penjual1.cetakInfoUser();

        // instansiasi objek dari clas Pembeli
        Pembeli pembeli1 = new Pembeli("Siti", 19, "Perempuan", "0812345671","Jakarta");
        pembeli1.cetakInfoUser();

        Transaksi transaksi1 = new Transaksi(penjual1, pembeli1, key1);
        Transaksi transaksi2 = new Transaksi(penjual1, pembeli1, proc1);

        System.out.println(proc1.getStokBarang());
    }
}
