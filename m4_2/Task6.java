package itShagMyProject.m4_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Задайте высоту лестницы, \"Количество ступеней\" : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i < a * 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            if (i % 2 == 0){
                for (int l = 0; l < 1; l++) {
                    System.out.print(" *");
                }
            }else {
                for (int l = 0; l < 3; l++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
