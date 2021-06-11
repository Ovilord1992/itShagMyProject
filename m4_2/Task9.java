package itShagMyProject.m4_2;

import java.util.Scanner;

public class Task9 {
    public static void create(int trees, int rows) {
        int gap = rows + trees - 1;
        while (trees > 0) {
            for (int i = 0; i < rows; i++) {
                System.out.print(" ".repeat(gap - i -1));
                System.out.print("*".repeat(i * 2 + 1));
                System.out.println();
            }
            rows++;
            trees--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        create(scanner.nextInt(), scanner.nextInt());
    }
}
