package itShagMyProject.m5_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder name = new StringBuilder();

        String lang = "";

        String[] a = scanner.nextLine().split("");
        String aMod = Arrays.toString(a).replaceAll("_", "");

        if (Arrays.toString(a).length() == aMod.length()) {
            lang = "Java";
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals(a[i].toUpperCase())) {
                    name.append("_").append(a[i].toLowerCase());
                } else {
                    name.append(a[i]);
                }
            }

        } else {
            lang = "C++";
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals("_")) {
                    a[i + 1] = a[i + 1].toUpperCase();
                } else {
                    name.append(a[i]);
                }
            }
        }

        System.out.println("lang " + lang + "\n" + name);


    }
}
