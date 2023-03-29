import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        for (int i = 1, j = 1; i <= n || j <= n; i *= 4, j *= 5) {
            if (i <= n) {
                System.out.println(i);
            }
            if (j <= n) {
                System.out.println(j);
            }
        }
    }
}
