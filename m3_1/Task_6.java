package m3_1;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите год");

        int a = scanner.nextInt();

        if ((a % 4 != 0 || (a % 100 == 0 && a % 400 != 0))) {
            System.out.println("обычный");
        } else {
            System.out.println("високосный");
        }
    }
}
