package praktikum1;
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double luas, keliling;
        int pilihan;
        System.out.println(">>> Program Hitung Luas Dan Keliling Bangun Datar <<<");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Layang-layang");
        System.out.println("7. Belah Ketupat");
        System.out.println("8. Lingkaran");
        System.out.print("Masukan pilihan (1-8): ");
        pilihan = sc.nextInt();

        switch (pilihan){
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = sc.nextDouble();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                break;

            case 2: // Persegi Panjang
                System.out.print("Masukkan panjang: ");
                double panjang = sc.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = sc.nextDouble();
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                break;

            case 3: // Segitiga
                System.out.print("Masukkan alas: ");
                double alas = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = sc.nextDouble();
                System.out.print("Masukkan sisi A: ");
                double sisiA = sc.nextDouble();
                System.out.print("Masukkan sisi B: ");
                double sisiB = sc.nextDouble();
                System.out.print("Masukkan sisi C: ");
                double sisiC = sc.nextDouble();
                luas = 0.5 * alas * tinggi;
                keliling = sisiA + sisiB + sisiC;
                break;

            case 4: // Jajar Genjang
                System.out.print("Masukkan alas: ");
                double alasJG = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiJG = sc.nextDouble();
                System.out.print("Masukkan sisi miring: ");
                double sisiMiring = sc.nextDouble();
                luas = alasJG * tinggiJG;
                keliling = 2 * (alasJG + sisiMiring);
                break;

            case 5: // Trapesium
                System.out.print("Masukkan sisi sejajar A: ");
                double a = sc.nextDouble();
                System.out.print("Masukkan sisi sejajar B: ");
                double b = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = sc.nextDouble();
                System.out.print("Masukkan sisi C: ");
                double c = sc.nextDouble();
                System.out.print("Masukkan sisi D: ");
                double d = sc.nextDouble();
                luas = 0.5 * (a + b) * t;
                keliling = a + b + c + d;
                break;

            case 6: // Layang-layang
                System.out.print("Masukkan diagonal 1: ");
                double d1 = sc.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = sc.nextDouble();
                System.out.print("Masukkan sisi A: ");
                double s1 = sc.nextDouble();
                System.out.print("Masukkan sisi B: ");
                double s2 = sc.nextDouble();
                luas = 0.5 * d1 * d2;
                keliling = 2 * (s1 + s2);
                break;

            case 7: // Belah Ketupat
                System.out.print("Masukkan diagonal 1: ");
                double dk1 = sc.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double dk2 = sc.nextDouble();
                System.out.print("Masukkan sisi: ");
                double sisiBK = sc.nextDouble();
                luas = 0.5 * dk1 * dk2;
                keliling = 4 * sisiBK;
                break;

            case 8: // Lingkaran
                System.out.print("Masukkan jari-jari: ");
                double r = sc.nextDouble();
                luas = Math.PI * r * r;
                keliling = 2 * Math.PI * r;
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        System.out.println("\n>>> HASIL PERHITUNGAN <<<");
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);
    }
}
