package m3_1;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        int summ = 0;
        int summ1 = 0;

        for (int i = 0; i < a.length(); i++) {
            if (i < 3) {
                summ = summ + Integer.parseInt(String.valueOf(a.charAt(i)));
            } else {
                summ1 = summ1 + Integer.parseInt(String.valueOf(a.charAt(i)));
            }
        }
        System.out.println((summ == summ1) ? "Счастливое" : "Не счастливое");
    }
}
