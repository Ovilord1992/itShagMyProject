package m3_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки x, y");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Первая четверть");
        } else if (x < 0 && y > 0) {
            System.out.println("Вторая четверть");
        } else if (x < 0 && y < 0) {
            System.out.println("Третья четверть");
        } else if (x > 0 && y < 0) {
            System.out.println("Четвертая четверть");
        } else {
            System.out.println("находится на 0 линии");
        }
    }
}
