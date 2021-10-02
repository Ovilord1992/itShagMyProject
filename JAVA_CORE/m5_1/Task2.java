package ItShag.itShagMyProject.m5_1;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder a = new StringBuilder();
        int iter = 1;
        while (a.length() < 1000 - ("" + iter).length()) {
            a.append(iter);
            iter++;
        }
        System.out.println("len str: " + a.length());
        System.out.printf("input num position: \"min value -> 1; max value -> %d\"%n", a.length());
        int n = scanner.nextInt();
        System.out.println(a.charAt(n - 1));

    }
}
