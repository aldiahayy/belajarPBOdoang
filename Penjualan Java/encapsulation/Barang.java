// semua property itu access modifier nya itu private
// semua method yang ada di class barang itu protected jika class nya tidak ingin di instansiasi
package com.myclass;
// class barang
public class Barang {
    // property atau attribut
    // semua private
    private String namaBarang = "belum ada nama";
    private int hargaBarang = 0;
    private int stokBarang = 0;

    // Constructor
    //Overloading
    protected Barang(){}

    protected Barang(String namaBarang){
        this.namaBarang = namaBarang;
    }
    protected Barang(String namaBarang, int hargaBarang){
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }
    protected Barang(String namaBarang, int hargaBarang, int stokBarang){
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.stokBarang = stokBarang;
    }

    // method atau behavior wajib
    // Overloading
    protected void tambahStok(){
        stokBarang += 1;
        System.out.println("Stok barang berhasil ditambahkan menjadi : " + stokBarang + "\n");
    }
    protected void tambahStok(int jmlTambah){
        stokBarang += jmlTambah;
        System.out.println("Stok barang berhasil ditambahkan menjadi : " + stokBarang + "\n");
    }
    protected void kurangiStok(){
        stokBarang -= 1;
        System.out.println("Stok barang berhasil dikurangi menjadi : " + stokBarang + "\n");
    }
    protected void kurangiStok(int jmlKurang){
        stokBarang -= jmlKurang;
        System.out.println("Stok barang berhasil dikurangi menjadi : " + stokBarang + "\n");
    }
    // Masih ada stok barang atau tidak?
    protected boolean cekStok(){
        if (stokBarang > 0){
            return true;
        }else{
            return false;
        }
    }
    protected boolean cekStok(boolean status){
        if (status){
        // stok barang masih ada?
            if (stokBarang > 0){
                return true;
            }else{
                return false;
            }
        }else{
        // stok barang sudah habis?
            if (stokBarang > 0){
                return false;
            }else{
                return true;
            }
        }
    }
    protected void cetakInfoBarang(){
        System.out.print("Nama barang : " + this.namaBarang + ", Harga Barang : Rp." + this.hargaBarang + ", Stok Barang : " + this.stokBarang + "pcs");
    }

    // Method Setter
    protected void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }
    protected void setHargaBarang(int hargaBarang){
        this.hargaBarang= hargaBarang;
    }
    protected void setStokBarang(int stokBarang){
        this.stokBarang = stokBarang;
    }

    // Method Getter
    protected String getNamaBarang(){
        return this.namaBarang;
    }
    protected int getHargaBarang(){
        return this.hargaBarang;
    }
    protected int getStokBarang(){
        return this.stokBarang;
    }
}
