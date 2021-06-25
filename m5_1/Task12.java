package itShagMyProject.m5_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String[] a = scanner.nextLine().split(" ");
        String b = "[;:]-*\\){1,}|[;:]-*\\({1,}|[;:]-*\\]{1,}|[;:]-*\\[{1,}";
        for (String k : a) {
            if (k.replaceAll(b, "").equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
