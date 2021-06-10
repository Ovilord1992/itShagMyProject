package m4_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solidDiamond1 (n);
    }

    public static void solidDiamond1(int L) {
        for (int N = 1; N <= 2 * L - 1; N++) {
            int a = L - N;
            int b = 2 * N - 1;
            if (N > L) {
                a = N - L;
                b = 4 * L - 2 * N -1;
            }
            for (int n = 0; n < a; n++) {
                System.out.print(" ");
            }
            for (int k = 0; k < b; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
