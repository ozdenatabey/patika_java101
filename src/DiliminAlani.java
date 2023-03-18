import java.util.Scanner;

public class DiliminAlani {
    public static void main(String[] args) {
        int r, aci;
        double alan, pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz: ");
        r = input.nextInt();
        System.out.print("Açı değerini giriniz: ");
        aci = input.nextInt();
        alan = (r * r * pi * aci) / 360;
        System.out.print("Daire diliminin alanı: " + alan);
    }
}
