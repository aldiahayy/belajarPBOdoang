package praktikum1;
import java.util.Scanner;
public class soal7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai a: ");
        int a = sc.nextInt();
        System.out.print("Masukan nilai b: ");
        int b = sc.nextInt();
        System.out.print("Masukan nilai c: ");
        int c = sc.nextInt();
        System.out.print("Masukan nilai d: ");
        int d= sc.nextInt();
        System.out.print("Masukan nilai e: ");
        int e = sc.nextInt();

        int min = a;
        int max = a;

        if (b < min) min = b;
        if (b > max) max = b;

        if (c < min) min = c;
        if (c > max) max = c;

        if (d < min) min = d;
        if (d > max) max = d;

        if (e < min) min = e;
        if (e > max) max = e;

        System.out.println("Nilai MIN : " + min);
        System.out.println("Nilai MAX : " + max);
    }
}
