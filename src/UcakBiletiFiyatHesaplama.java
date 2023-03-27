import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        int age, range, way;
        double price = 0, discount = 0, total = 0;
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        range = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        way = input.nextInt();

        if (age < 0){
          isError = true;
        } else if (age < 12) {
            discount = 0.3;
        } else if (age < 24) {
            discount = 0.1;
        } else if (age >= 65) {
            discount = 0.3;
        } else {
            discount = 0;
        }

        if (range < 0){
            isError = true;
        } else {
            price = range * 0.10;
        }

        if (way == 1) {
            total = price - (price * discount);
        } else if (way == 2) {
            total = 2 * ((price - (price * discount)) - (price - (price * discount)) * 0.2);
        } else{
            isError = true;
        }

        if(isError){
            System.out.print("Hatalı veri girdiniz!");
        } else{
            System.out.print("Toplam tutar: " + total + "TL");
        }
    }
}
