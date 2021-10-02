package ItShag.itShagMyProject.m5_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine()
                .replaceAll("[,_.:;!?\s]", "")
                .toLowerCase();
        String b = scanner.nextLine()
                .replaceAll("[,_.:;!?\s]", "")
                .toLowerCase();
        scanner.close();

        System.out.println((sortString(a).equalsIgnoreCase(sortString(b))) ? "Yes" : "No");
    }

    public static String sortString(String inputString) {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
