package ItShag.itShagMyProject.m5_1;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().toLowerCase().split("");
        String str1 = scanner.nextLine().trim().toLowerCase();
        int calc = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(str1)) {
                System.out.println("элемент " + str[i] + " индекс " + i);
                calc++;
            }
        }
        if (calc == 0) {
            System.out.println(str1 + " Такого символа нет");
        }
    }
}
