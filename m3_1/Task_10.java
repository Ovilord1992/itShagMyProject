package m3_1;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество квартир на этаже");
        double n = scanner.nextInt();
        System.out.println("Введите квартиру");
        double m = scanner.nextInt();

        System.out.println(((m / n) % 9) != 0 ? "подъезд " + (int) (m / n / 9 + 1) :
                "подъезд " + (int) (m / n / 9));

    }
}
