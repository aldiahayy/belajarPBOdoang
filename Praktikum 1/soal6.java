package praktikum1;
import java.util.Scanner;
public class soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai a: ");
        int a = sc.nextInt();
        System.out.print("Masukan nilai b: ");
        int b = sc.nextInt();
        int min = a;
        int max = a;
        if (b < a) min = b;
        if (b > a) max = b;
        System.out.println("Nilai MIN : " + min);
        System.out.println("Nilai MAX : " + max);
    }
}
