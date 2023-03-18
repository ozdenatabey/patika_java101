import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        double a, b, alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen 1. kenarın uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen 2. kenarın uzunluğunu giriniz: ");
        b = input.nextInt();
        alan = (a * b) / 2;
        System.out.print("Üçgenin alanı= " + alan);
    }
}
