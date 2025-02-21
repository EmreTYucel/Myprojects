import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        boolean hasLowGrade = false;

        System.out.print("1. dersin notu: ");
        int firstGrade = keyboard.nextInt();
        total += firstGrade;
        int highestgrade = firstGrade;
        int lowestgrade = firstGrade;

        for (int i = 2; i <= 5; i++) {
            System.out.print(i + ". dersin notu: ");
            int grade = keyboard.nextInt();
            total += grade;

            highestgrade = Math.max(highestgrade, grade);
            lowestgrade = Math.min(lowestgrade, grade);

            if (grade < 30) {
                hasLowGrade = true;
            }
        }      
        double average = total / 5.0;
        System.out.println("Ortalama:" + average);
        System.out.println("En yüksek not:" + highestgrade);
        System.out.println("En düşük not:" + lowestgrade);

        if (hasLowGrade) {
            System.out.println("Düşük not aldığınız dersler var!!!");
        }

        if (average >= 50) {
            System.out.println("Dersi geçtiniz:)");
        } else {
            System.out.println("Dersten kaldınız:(");
        }
    }
}
