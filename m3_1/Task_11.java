package itShagMyProject.m3_1;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа для квадратного уравнения a, b, c");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int D = (b * b) - 4 * a * c;
        if (D < 0) {
            System.out.println("корней нет");
        } else if (D == 0) {
            System.out.println("Один корень " + (-b - Math.sqrt(D)) / (2 * a));
        } else {
            System.out.println("два корня \n" + (-b - Math.sqrt(D)) / (2 * a) + " " + (-b + Math.sqrt(D)) / (2 * a));
        }
    }
}
