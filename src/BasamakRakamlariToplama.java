import java.util.Scanner;

public class BasamakRakamlariToplama {
    public static void main(String[] args) {
        int num, tempNum, basNum, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        num = input.nextInt();
        tempNum = num;
        while (tempNum != 0) {
            basNum = tempNum % 10;
            tempNum /= 10;
            result += basNum;
        }
        System.out.print(result);
    }
}
