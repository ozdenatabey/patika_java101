import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvliFiyat, kdvTutari, kdvOran;
        System.out.print("Lütfen KDV'sinin hesaplanmasını istediğiniz tutarı giriniz: ");
        tutar = input.nextDouble();
        boolean sinir = 0.0 < tutar && tutar < 1000.0;
        kdvOran = sinir ? 0.18 : 0.08;
        kdvliFiyat = tutar * kdvOran + tutar;
        kdvTutari = kdvliFiyat - tutar;
        System.out.println("KDV'siz fiyat: " + tutar);
        System.out.println("KDV'li fiyat: " + kdvliFiyat);
        System.out.println("KDV tutarı: " + kdvTutari);
    }
}
