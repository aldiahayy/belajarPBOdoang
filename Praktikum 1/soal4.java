package praktikum1;
import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double luasPermukaan, kecepatanAliran;

        System.out.println(">>> Program Menghitung Debit Air <<<");
        System.out.print("Masukan luas permukaan (m^2): ");
        luasPermukaan = sc.nextDouble();
        System.out.print("Masukan kecepatan aliran (m/s): ");
        kecepatanAliran = sc.nextDouble();

        System.out.println("\n>>> Hasil Perhitungan <<<");
        System.out.println("Luas permukaan   : " + luasPermukaan + " m^2");
        System.out.println("Kecepatan aliran : " + kecepatanAliran + " m/s");
        System.out.println("Debit air        : " + (luasPermukaan * kecepatanAliran) + " m^3/s");
    }
}
