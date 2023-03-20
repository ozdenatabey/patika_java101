import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.print("\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.print(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.print(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.print(n1 + " x " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print(n1 + " / " + n2 + " = " + (n1 / n2));
                }
                else{
                    System.out.print("Bölünen sayı 0 olamaz!");
                }
            default:
                System.out.print("Hatalı giriş yaptınız..");
        }
    }
}
