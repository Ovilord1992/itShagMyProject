package ItShag.itShagMyProject.m5_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().replaceAll(":", "").split("[\s]");
        for (String k: a) {
            if (k.length() % 2 == 0){
                System.out.println(k);
            }
        }
    }
}
