package m4_2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    System.out.println(reverseNumber(a));
}

    private static String reverseNumber(int num) {
        int vh = 0;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse + num % 10;
            num = num / 10;
            vh++;
        }
        return "Сумма: " + reverse + "\nКоличество цифр: " + vh;
    }
}
