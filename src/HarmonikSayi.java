import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int n;
        double total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        for (double i = 1; i <= n; i++) {
            total += 1 / i;
        }
        System.out.print("Girilen sayının harmonik değeri: " + total);
    }
}
