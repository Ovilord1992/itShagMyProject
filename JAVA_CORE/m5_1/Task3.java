package ItShag.itShagMyProject.m5_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int calc = 0;

        for (String k : str) {
            calc = calc + k.length();
        }

        System.out.println("Средняя длинна слова " + calc / str.length);
    }
}
