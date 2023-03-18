import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. kenarın uzunluğunu giriniz: ");
        a = input.nextDouble();
        System.out.print("Lütfen 2. kenarın uzunluğunu giriniz: ");
        b = input.nextDouble();
        c = Math.sqrt(a * a + b * b);
        System.out.print("Girilen kenarların hipotenüsü: " + c);
    }
}
