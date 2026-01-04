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
