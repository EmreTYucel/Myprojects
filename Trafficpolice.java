import java.util.Scanner;

public class Trafficpolice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Lütfen aracın hızını giriniz (km/s): ");
        int speed = keyboard.nextInt();

        if (speed > 130) {
            System.out.println("Hızınız: " + speed + " km/s. Ehliyetinize el konuldu!");
        } else {
            int ticket = 0;
            int speeddifference = speed - 90;
            int interval = speeddifference / 20;

            switch (interval) {
                case 0:
                    ticket = 1000;
                    break;
                case 1:
                    ticket = 2000;
                    break;
                default:
                    ticket = 0;
            }

            if (ticket > 0) {
                System.out.println("Hızınız: " + speed + " km/s. " + ticket + " TL ceza yazıldı!");
            } else {
                System.out.println("Hızınız: " + speed + " km/s. Hız sınırına uygun yol alıyorsunuz.");
            }
        }
    }
}
