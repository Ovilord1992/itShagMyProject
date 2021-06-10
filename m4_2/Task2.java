package m4_2;

import java.util.Scanner;
//25%

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Треугольник, прямой  угол вверх вправо \nЗадайте высоту треугольника: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        for (int i = 0, k = a; i < a; i++, k--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int l = k; l > 0; l--) {
                if (l == k || l == 1 || i == 0)
                    System.out.print("+");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


        for (int i = 0, k = a; i < a; i++, k--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int l = k; l > 0; l--) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
