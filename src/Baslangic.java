import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Not Ortalamanız: " + ortalama);

        boolean kosul = ortalama > 60;
        System.out.println(kosul ? "Geçtiniz" : "Kaldınız");
    }
}