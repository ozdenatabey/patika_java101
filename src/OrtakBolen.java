import java.util.Scanner;

public class OrtakBolen {
    public static void main(String[] args) {
        int num, k = 0, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı değerini giriniz: ");
        num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                k += i;
                count++;
            }
        }
        System.out.println("0'dan " + num + " sayısına kadar 3 ve 4'e tam bölünebilen sayıların toplamı = " + k);
        System.out.println("Bu sayıların adedi 0'da dahil olduğu için " + count + " adettir.");
        System.out.println("Dolayısıyla bu sayıların ortalaması => " + k + " / " + count + " = " + k/count);
    }
}
