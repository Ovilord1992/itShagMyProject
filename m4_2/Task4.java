package itShagMyProject.m4_2;

import java.util.Scanner;
//TODO переписать на встроенный repeat

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a / 2; i++) {
            if (i == 0) {
                System.out.println(repeat(' ', a / 2 - i)
                        + repeat('*', 1));
            }else {
                System.out.println(repeat(' ', a / 2 - i)
                        +repeat('*', 1) + repeat(' ', 2 * i - 1)
                        + repeat('*', 1));
            }
        }
        if (a % 2 != 0) {
            System.out.println(repeat('*', 1)
                    + repeat(' ', a - 2)
                    + repeat('*', 1));
        }
        for (int i = a / 2 - 1; i >= 0; i--) {
            if (i ==0) {
                System.out.println(repeat(' ', a / 2 - i)
                        + repeat('*', 1));
            }else {
                System.out.println(repeat(' ', a / 2 - i)
                        +repeat('*', 1)
                        + repeat(' ', 2 * i - 1)
                        + repeat('*', 1));
            }

        }

        for (int i = 0; i < a / 2; i++) {
            System.out.println(repeat(' ', a / 2 - i)
                    + repeat('*', 2 * i + 1));
        }
        if (a % 2 != 0) {
            System.out.println(repeat('*', a));
        }
        for (int i = a / 2 - 1; i >= 0; i--) {
            System.out.println(repeat(' ', a / 2 - i)
                    + repeat('*', 2 * i + 1));
        }
    }


    public static String repeat(char ch, int times) {
        char[] buf = new char[times];
        for (int i = 0; i < times; i++) {
            buf[i] = ch;
        }
        return new String(buf);
    }
}
