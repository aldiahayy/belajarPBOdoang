package com.myclass;
// class barang
public class Barang {
    // property atau attribut
    public String namaBarang;
    public int hargaBarang;
    public int stokBarang;

    // method atau behavior
    public void tambahStok(int jmlTambah){
        stokBarang += jmlTambah;
        System.out.println("Stok barang berhasil ditambahkan menjadi : " + stokBarang + "\n");
    }

    public void kurangiStok(int jmlKurang){
        stokBarang -= jmlKurang;
        System.out.println("Stok barang berhasil dikurangi menjadi : " + stokBarang + "\n");
    }

    public boolean cekStok(){
        if (stokBarang > 0){
            return true;
        }else{
            return false;
        }
    }

    public void cetakInfoBarang(){
        System.out.println("Nama barang : " + namaBarang + ", Harga Barang : Rp." + hargaBarang + ", Stok Barang : " + stokBarang + "pcs\n");
    }
}
