package com.myclass;
public class Procesor extends Barang{

    // property
    public double frekuensiDasar = 0;
    public double turboBoost = 0;

    // constructor
    public Procesor(String namaBarang, int hargaBarang, int stokBarang, double frekuensiDasar, double turboBoost){
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.stokBarang = stokBarang;
        this.frekuensiDasar = frekuensiDasar;
        this.turboBoost = turboBoost;
    }

    // setter dan getter
    public void setFrekuensiDasar(double frekuensiDasar){
        this.frekuensiDasar = frekuensiDasar;
    }
    public double getFrekuensiDasar(){
        return this.frekuensiDasar = frekuensiDasar;
    }
    public void setTurboBoost(double turboBoost){
        this.turboBoost = turboBoost;
    }
    public double getTurboBoost(){
        return this.turboBoost = turboBoost;
    }
}
