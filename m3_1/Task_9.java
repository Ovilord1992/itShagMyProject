package itShagMyProject.m3_1;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите координаты начальной точки, 2 числа x,y");
        int xy = scanner.nextInt();
        int yx = scanner.nextInt();
        System.out.println("введите координаты конечной точки точки, 2 числа x,y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        if (xy == x && yx != y) {
            System.out.println("отвес");
        } else if (yx == y && xy != x) {
            System.out.println("прямая");
        } else if (yx > y && x > xy) {
            System.out.println("спуск");
        } else if (yx < y && x > xy) {
            System.out.println("подъем");
        } else if (xy == x && yx == y) {
            System.out.println("точка");
        }

    }
}
