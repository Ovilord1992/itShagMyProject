package itShagMyProject.m4_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n * 6; j++) {
                if (j == 1 || i == n - 1 || i == 0 || j == n * 6)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n * 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

