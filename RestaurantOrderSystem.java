import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalPrice = 0;
        int choice;

        do {
            System.out.println("\n--- Restoran Menü ---");
            System.out.println("1. Pizza - 120 TL");
            System.out.println("2. Burger (100gr) - 80 TL");
            System.out.println("3. Spagetti - 70 TL");
            System.out.println("4. Penne Arabiata - 75 TL");
            System.out.println("5. Fettuccine Alfredo - 85 TL");
            System.out.println("6. Tavuk Sote(Pirinç pilavı ile servis edilir 120 gr tavuk içerir) - 125 TL");
            System.out.println("7. Steak (Yanında özel sosla gelir) - 150 TL");
            System.out.println("8. Kuzu Pirzola - 160 TL");
            System.out.println("9. Çoban Salata - 50 TL");
            System.out.println("10. Sezar Salata - 60 TL");
            System.out.println("11. Akdeniz Salata - 55 TL");
            System.out.println("12. Ton Balıklı Salata - 65 TL");
            System.out.println("13. Çıkış ve Hesap Göster");
            System.out.print("Seçiminizi yapın: ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    totalPrice += 100;
                    System.out.println("Pizza eklendi.");
                    break;
                case 2:
                    totalPrice += 80;
                    System.out.println("Burger eklendi.");
                    break;
                case 3:
                    totalPrice += 70;
                    System.out.println("Spagetti eklendi.");
                    break;
                case 4:
                    totalPrice += 75;
                    System.out.println("Penne Arabiata eklendi.");
                    break;
                case 5:
                    totalPrice += 85;
                    System.out.println("Fettuccine Alfredo eklendi.");
                    break;
                case 6:
                    totalPrice += 125;
                    System.out.println("Tavuk Sote eklendi.");
                    break;
                case 7:
                    totalPrice += 150;
                    System.out.println("Steak eklendi.");
                    break;
                case 8:
                    totalPrice += 160;
                    System.out.println("Kuzu Pirzola eklendi.");
                    break;
                case 9:
                    totalPrice += 50;
                    System.out.println("Çoban Salata eklendi.");
                    break;
                case 10:
                    totalPrice += 60;
                    System.out.println("Sezar Salata eklendi.");
                    break;
                case 11:
                    totalPrice += 55;
                    System.out.println("Akdeniz Salata eklendi.");
                    break;
                case 12:
                    totalPrice += 65;
                    System.out.println("Ton Balıklı Salata eklendi.");
                    break;
                case 13:
                    System.out.println("Sipariş tamamlandı. Toplam hesap: " + totalPrice + " TL");
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }
        } while (choice != 13);
    }
}

