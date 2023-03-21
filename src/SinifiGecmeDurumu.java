import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double i = 5.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if (mat >= 100 || mat <= 0){
            mat = 0;
            i--;
        }
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 100 || fizik <= 0){
            fizik = 0;
            i--;
        }
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 100 || turkce <= 0){
            turkce = 0;
            i--;
        }
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 100 || kimya <= 0){
            kimya = 0;
            i--;
        }
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if (muzik >= 100 || muzik <= 0){
            muzik = 0;
            i--;
        }

        double average = (mat + fizik + turkce + kimya + muzik) / i;
        System.out.println("Ortalamanız :" + average);
        if (average < 55){
            System.out.print("Sınıfta kaldınız !");
        }else{
            System.out.print("Tebrikler! Sınıfı geçtiniz.");
        }
    }
}
