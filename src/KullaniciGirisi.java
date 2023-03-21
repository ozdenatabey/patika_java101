import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password, question;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        username = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız..");
        } else {
            System.out.print("Bilgileriniz yanlış!\nParolanızı sıfırlamak ister misiniz? ");
            question = input.nextLine();
            if (question.equals("evet")){
                System.out.print("Yeni şifreniz: ");
                password = input.nextLine();
                if (password.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı. Lütfen başka şifre girin.");
                } else {
                    System.out.print("Şifreniz başarıyla oluşturuldu.");
                }
            }
        }
    }
}
