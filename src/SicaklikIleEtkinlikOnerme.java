import java.util.Scanner;

public class SicaklikIleEtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz: ");
        heat = input.nextInt();
        if (heat < 25) {
            if (heat > 10) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
            if (heat <= 15 && heat > 5) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat <= 5){
                System.out.println("Kayağa gidebilirsiniz.");
            }
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
