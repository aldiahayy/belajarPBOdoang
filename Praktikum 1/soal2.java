package praktikum1;
// segitiga
class Segitiga {
    double alas, tinggi, sisiA, sisiB, sisiC;

    void setNilai(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }

    void printState() {
        System.out.println(">>> Segitiga <<<");
        System.out.println("Alas     : " + alas);
        System.out.println("Tinggi   : " + tinggi);
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}

// persegi panjang
class PersegiPanjang{
    double panjang, lebar;

    void setNilai(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas(){
        return panjang * lebar;
    }

    double hitungKeliling(){
        return 2 * (panjang + lebar);
    }

    void printState(){
        System.out.println(">>> Persegi Panjang <<<");
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}

// persegi
class Persegi{
    double sisi;

    void setNilai(double sisi){
        this.sisi = sisi;
    }

    double hitungLuas(){
        return sisi * sisi;
    }

    double hitungKeliling(){
        return 4 * sisi;
    }

    void printState(){
        System.out.println(">>> Persegi <<<");
        System.out.println("Lebar    : " + sisi);
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}

// lingkaran
class Lingkaran{
    double jariJari;
    final double PI = 3.14;

    void setNilai(double jariJari){
        this.jariJari = jariJari;
    }

    double hitungLuas(){
        return PI * jariJari * jariJari;
    }

    double hitungKeliling(){
        return 2 * PI * jariJari;
    }

    void printState(){
        System.out.println(">>> Lingkaran <<<");
        System.out.println("Jari-jari : " + jariJari);
        System.out.println("Luas      : " + hitungLuas());
        System.out.println("Keliling  : " + hitungKeliling());
    }
}

// jajar genjang
class JajarGenjang{
    double alas, tinggi, sisiMiring;

    void setNilai(double alas, double tinggi, double sisiMiring){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    double hitungLuas(){
        return alas * tinggi;
    }

    double hitungKeliling(){
        return 2 * (alas + sisiMiring);
    }

    void printState(){
        System.out.println(">>> Jajar Genjang <<<");
        System.out.println("Alas     : " + alas);
        System.out.println("Tinggi   : " + tinggi);
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}

// trapesium
class Trapesium {
    double sisiA, sisiB, sisiC, sisiD, tinggi;

    void setNilai(double sisiA, double sisiB, double sisiC, double sisiD, double tinggi) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.sisiD = sisiD;
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        return 0.5 * (sisiA + sisiB) * tinggi;
    }

    double hitungKeliling() {
        return sisiA + sisiB + sisiC + sisiD;
    }

    void printState() {
        System.out.println(">>> Trapesium <<<");
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}

// belah ketupat
class BelahKetupat {
    double diagonal1, diagonal2, sisi;

    void setNilai(double diagonal1, double diagonal2, double sisi) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }

    double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    double hitungKeliling() {
        return 4 * sisi;
    }

    void printState() {
        System.out.println(">>> Belah Ketupat <<<");
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}

// layang-layang
class LayangLayang {
    double diagonal1, diagonal2, sisiA, sisiB;

    void setNilai(double diagonal1, double diagonal2, double sisiA, double sisiB) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    double hitungKeliling() {
        return 2 * (sisiA + sisiB);
    }

    void printState() {
        System.out.println(">>> Layang-layang <<<");
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}

public class soal2 {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        s.setNilai(6, 4, 5, 5, 6);
        s.printState();

        System.out.println();

        PersegiPanjang pp = new PersegiPanjang();
        pp.setNilai(3 , 4);
        pp.printState();

        System.out.println();

        Persegi p = new Persegi();
        p.setNilai(5);
        p.printState();

        System.out.println();

        Lingkaran l = new Lingkaran();
        l.setNilai(7);
        l.printState();

        System.out.println();

        JajarGenjang jg = new JajarGenjang();
        jg.setNilai(4, 5, 6);
        jg.printState();

        System.out.println();

        Trapesium t = new Trapesium();
        t.setNilai(6, 10, 5, 5, 4);
        t.printState();

        System.out.println();

        BelahKetupat bk = new BelahKetupat();
        bk.setNilai(6, 8, 5);
        bk.printState();

        System.out.println();

        LayangLayang ll = new LayangLayang();
        ll.setNilai(6, 8, 5, 4);
        ll.printState();
    }
}
