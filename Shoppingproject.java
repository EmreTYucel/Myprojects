import java.util.Scanner;

public class Shoppingproject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalprice=0;
        boolean discount = false;
        for(;;){
            System.out.println("Lütfen ürün seçimi yapınız:\n1.Peynir\n2.Yumurta\n3.Marul");
            int choice = keyboard.nextInt();
            switch (choice){
                case 1:totalprice+=100;
                break;
                case 2:totalprice+=70;
                break;
                case 3:totalprice+=30;
                break;
                case 0:
                    System.out.println("İndirim kuponunuz var mı?(1:Evet/2:Hayır)");
                    int coupon = keyboard.nextInt();
                    if(coupon==1){
                        discount=true;
                    }
                    if (discount){
                        totalprice*=0.9;
                    }
                    System.out.println("Toplam Fiyat:"+totalprice+"TL");
                    return;
                default:
                    System.out.println("Geçersiz seçim yaptınız...");
            }
        }
    }
}