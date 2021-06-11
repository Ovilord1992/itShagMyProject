package itShagMyProject.m4_2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                if (j == 0 || j == i * 2 || i == n - 1)
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
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

