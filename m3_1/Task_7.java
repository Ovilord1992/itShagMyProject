package itShagMyProject.m3_1;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите символ для определения раскладки");

        char x = scanner.next().charAt(0);

        if ((x >= 'a' && x <= 'z')) {
            System.out.println("lat lowerCase");
        } else if ((x >= 'а' && x <= 'я')) {
            System.out.println("kir lowerCase");
        } else if ((x >= 'A' && x <= 'Z')) {
            System.out.println("lat upperCase");
        } else if ((x >= 'А' && x <= 'Я')) {
            System.out.println("kir upperCase");
        } else if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
            System.out.println("num");
        } else {
            System.out.println("symbol not detected");
        }

    }
}
