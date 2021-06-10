package m4_2;

import java.util.Scanner;

//50%

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Треугольник, прямой  угол вверх вправо \nЗадайте высоту треугольника: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = a, k = 0; i >= 0; i--, k++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int l = 0; l < k; l++) {
                if (l == 0 || l == k - 1 || i == 0)
                    System.out.print("+");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = a, k = 0; i >= 0; i--, k++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int l = 0; l < k; l++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
