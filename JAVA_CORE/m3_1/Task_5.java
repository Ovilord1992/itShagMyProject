package itShagMyProject.m3_1;

import java.awt.*;
import java.util.Scanner;

public class Task_5 {
    public static int[] mes = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] yearS = {"Обезьяна", "Петух", "Собака", "Свинья", "Крыса", "Бык", "Тигр", "Кролик", "Дракон", "Змея", "Лошадь", "Коза"};

    public static void main(String[] args) {
        String sign = null;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b > 12 || b <= 0) {
            System.out.println("такого месяца нет");
        } else if (a > mes[b - 1] || a <= 0) {
            System.out.println("не верное число");
        } else {
            //знак года
            int yearSum = c % 12;

            if ((b == 1) && (a <= 20) || (b == 12) && (a >= 22)) {
                sign = "Козерог";
            } else if ((b == 1) || (b == 2) && (a <= 19)) {
                sign = "Водолей";
            } else if ((b == 2) || (b == 3) && (a <= 20)) {
                sign = "Рыбы";
            } else if ((b == 3) || (b == 4) && (a <= 19)) {
                sign = "Овен";
            } else if ((b == 4) || (b == 5) && (a <= 21)) {
                sign = "Телец";
            } else if ((b == 5) || (b == 6) && (a <= 21)) {
                sign = "Близнецы";
            } else if ((b == 6) || (b == 7) && (a <= 23)) {
                sign = "Рак";
            } else if ((b == 7) || (b == 8) && (a <= 23)) {
                sign = "Лев";
            } else if ((b == 8) || (b == 9) && (a <= 23)) {
                sign = "Девы";
            } else if ((b == 9) || (b == 10) && (a <= 23)) {
                sign = "Весы";
            } else if ((b == 10) || (b == 11) && (a <= 22)) {
                sign = "Скорпион";
            } else if (b == 12) {
                sign = "Стрелец";
            }


            System.out.println(sign);
            System.out.println(yearS[yearSum]);
        }

    }

}

