package com.myclass;
public class Keyboard extends Barang{

    // property
    public String backlight = "tidak ada backlight";
    public int banyakKeys = 0;
    public String tipeSwitch = "tidak ada switch";

    // constructor
    public Keyboard(String namaBarang, int hargaBarang, int stokBarang, String backlight, int banyakKeys, String tipeSwitch){
        super(namaBarang, hargaBarang, stokBarang);
        this.backlight = backlight;
        this.banyakKeys = banyakKeys;
        this.tipeSwitch = tipeSwitch;
    }

    // setter dan getter
    public void setBacklight(String backlight){
        this.backlight = backlight;
    }
    public String getBacklight(){
        return this.backlight = backlight;
    }
    public void setBanyakKeys(int banyakKeys){
        this.banyakKeys = banyakKeys;
    }
    public int getBanyakKeys(){
        return this.banyakKeys = banyakKeys;
    }
    public void setTipeSwitch(String tipeSwitch){
        this.tipeSwitch = tipeSwitch;
    }
    public String getTipeSwitch(){
        return this.tipeSwitch = tipeSwitch;
    }

    // Overriding
    @Override
    public void cetakInfoBarang(){
        super.cetakInfoBarang();
        System.out.println(", Backlight : " + this.backlight +", Banyak Keys : " + this.banyakKeys+", Tipe Switch : " + this.tipeSwitch +"\n");
    }
}
