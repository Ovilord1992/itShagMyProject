package m3_1;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println((
                x % 2 == 0 && y % 2 == 0
                        || x % 2 != 0 && y % 2 != 0) ? "YES" : "");
    }
}
