import java.util.Scanner;

public class Atmproject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int password = 5678;
        int balance = 5000;
        int enteredpasword;
        System.out.println("Lütfen şifrenizi giriniz:");
        enteredpasword = keyboard.nextInt();
        if (enteredpasword == password) {
            System.out.println("Girilen şifre doğru sisteme aktarılıyorsunuz...");
        } else {
            System.out.println("Girilen şifre yanlış lütfen tekrar deneyin.");
            return ;
        }
        while (true) {
            System.out.println("1.Bakiyenizi Görüntüleyin");
            System.out.println("2.Para çekme");
            System.out.println("3.Para Yatırma");
            System.out.println("4.Çıkış");
            System.out.println("Lütfen seçiminizi yapınız:");
            var choice = keyboard.nextInt();
            if (choice == 1) {
                System.out.println("Bakiyeniz:" + balance + "TL");
            } else if (choice == 2) {
                while (true) {
                System.out.println("Çekmek istediğiniz tutarı giriniz:");
                int withdraw = keyboard.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Yetersiz bakiye lütfen geçerli bir tutar giriniz.");
                    }
                    else {
                        balance -= withdraw;
                        System.out.println("Yeni bakiyeniz:" + balance + "TL");
                        break;
                    }
                }
            } else if (choice == 3) {
                System.out.println("Yatırmak istediğiniz tutarı giriniz:");
                int deposit = keyboard.nextInt();
                balance += deposit;
                System.out.println("Yeni bakiyeniz:" + balance + "TL");
            } else if (choice == 4) {
                System.out.println("Çıkış yapılıyor...");
                break;
            } else {
                System.out.println("Geçersiz seçim yaptınız!");
                return;
            }
        }
    }
}