package itShagMyProject.m4_2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(reverseNumber(a));
    }

    private static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        return reverse;
    }
}
