package m3_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели, числом от 1-7: ");
        int a = scanner.nextInt();

        switch (a) {
            case (1) -> System.out.println("понедельник");
            case (2) -> System.out.println("вторник");
            case (3) -> System.out.println("среда");
            case (4) -> System.out.println("четверг");
            case (5) -> System.out.println("пятница");
            case (6) -> System.out.println("суббота");
            case (7) -> System.out.println("воскресенье");
            default -> System.out.println("такого дня не существует");
        }
    }
}
