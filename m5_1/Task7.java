package ItShag.itShagMyProject.m5_1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().replaceAll("[0-9]","_").split("");
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(a[i].toUpperCase())){
                a[i] = a[i].toLowerCase();
            }else if (a[i].equals(a[i].toLowerCase())){
                a[i] = a[i].toUpperCase();
            }
        }
        StringBuilder z = new StringBuilder();
        for (String k: a) {
            z.append(k);
        }

        System.out.println(z);
    }
}
