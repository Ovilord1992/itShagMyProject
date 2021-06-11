package itShagMyProject.m3_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время от 0-24" +
                "\n 0-6 -> ночь " +
                "\n 7-11 -> утро " +
                "\n 12-19 -> день " +
                "\n 20-24 -> вечер");

        int a = scanner.nextInt();

        if (a >= 0 && a <= 6) {
            System.out.println("доброй ночи");
        } else if (a > 6 && a <= 11) {
            System.out.println("доброе утро");
        } else if (a > 11 && a <= 19) {
            System.out.println("добрый день");
        } else if (a > 19 && a < 24) {
            System.out.println("добрый вечер");
        } else {
            System.out.println("такого времени не существет");
        }
    }
}
