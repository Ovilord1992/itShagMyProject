package itShagMyProject.m5_1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split("");
        if (a.length <= 50) {

            for (int i = 1; i <= a.length; i++) {
                for (int j = 0; j < a.length - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(a[j]);
                }
                System.out.println();
            }
            for (int i = 1; i < a.length; i++) {
                for (int j = a.length - i, k = i; j > 0; j--, k++) {
                    System.out.print(a[k]);
                }
                System.out.println();
            }
        } else {
            System.out.println("длинна строки больше 50 символов");
        }


    }
}
