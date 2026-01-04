package jan4;
class SepedaMotor {
    //field atau variabel
    static String warna = "HITAM";           // Class variable
    static String jenisTransmisi = "MANUAL"; // Class variable
    double kecepatan = 0;                    // instance variable


    // method atau fungsion
    double speedUp(double increment) {           // double increment : Parameter
        double velocity = kecepatan + increment; // local variable
        return velocity;
    }
}
/* keterangan :
1. instance Variables atau sering disebut juga non-static fields (dideklarasikan
   tanpa menggunakan modifier static) merupakan variable-variabel yang unik
   untuk setiap object (setiap object akan memiliki nilai Instance variables-nya sendiri)

2. Class Variables atau sering disebut juga static field adalah variabel yang
   dideklarasikan menggunakan modifier static. Secara teori hanya ada satu
   copy untuk Class Variable berapapun banyaknya object hasil instan dari
   class tersebut. Class Variables ini dapat digunakan tanpa kita harus terlebih dahulu
   membuat instan dari classnya.

3. Local Variables mirip seperti bagaimana object menyimpan nilai state ke
   dalam field, sebuah method juga akan menyimpan nilai state sementara
   (temporary state) di dalam local variables (variabel lokal). Local variables ini
   hanya dapat dikenali atau diakses di dalam method tempat dimana local
   variable ini di deklarasikan.

4. Parameter Variables atau biasa disebut parameter saja, merupakan variabel
   variabel yang menjadi input sebuah method. Variabel ini dituliskan bersama
   deklarasi tipe datanya di dalam kurung yang diletakkan setelah nama method.
 */
