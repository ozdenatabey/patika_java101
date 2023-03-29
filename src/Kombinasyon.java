import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        // C(n,r) = n! / (r! * (n-r)!)
        int n, r, nFac = 1, rFac = 1, subFac = 1, fac;
        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Kombinasyon oluşturulacak eleman sayısını giriniz: ");
        r = input.nextInt();
        int sub = n - r;
        for (int i = 1; i <= n; i++) {
            nFac = nFac * i;
        }
        for (int i = 1; i <= r; i++) {
            rFac = rFac * i;
        }
        for (int i = 1; i <= sub; i++) {
            subFac = subFac * i;
        }
        fac = nFac / (rFac * subFac);
        System.out.print("Kombinasyon= " + fac);
    }
}
