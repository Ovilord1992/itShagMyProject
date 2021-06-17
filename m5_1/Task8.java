package ItShag.itShagMyProject.m5_1;

import java.util.Scanner;
//TODO convet to C++

public class Task8 {
    public static void main(String[] args) {
        String lang = "";
        StringBuilder name = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split("");

        int iter = 0;
        for (String k: a) {
            if (k.equals(k.toUpperCase()) && !lang.equals("C++")){
                lang = "Java";
                a[iter] = "_" + a[iter].toLowerCase();
            }
            if (k.equals("_") && !lang.equals("Java")){
                lang = "C++";
                a[iter] = a[iter].replace("_[A-Z]", k.toUpperCase());
            }
            iter++;
        }
        for (String k: a) {
            name.append(k);
        }
        System.out.println(lang + "\n" +name);

    }
}
