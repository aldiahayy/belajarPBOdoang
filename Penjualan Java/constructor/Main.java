package com.program;
import com.myclass.Barang;
import com.myclass.Penjual;
import com.myclass.Pembeli;

public class Main {
    public static void main(String[] args) {
        // instansiasi objek dari class barang
        Barang barang1 = new Barang("Shampo");
        // call method in object
        barang1.cetakInfoBarang();

        Barang barang2 = new Barang("Pasta Gigi", 11000);
        barang2.cetakInfoBarang();

        Barang barang3 = new Barang("Sabun Mandi", 9500, 25);
        barang3.cetakInfoBarang();

        Barang barang4 = new Barang();
        barang4.cetakInfoBarang();


        //instansiasi objek dari class Penjual
        Penjual penjual1 = new Penjual("Udin", 21, "Laki-laki", 2);
        penjual1.cetakInfoPenjual();

        // instansiasi objek dari clas Pembeli
        Pembeli pembeli1 = new Pembeli("Siti", 19, "Perempuan", "0812345671", "Jakarta");
        pembeli1.cetakInfoPembeli();

    }
}
