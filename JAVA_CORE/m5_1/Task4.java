package ItShag.itShagMyProject.m5_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        StringBuilder q = new StringBuilder();
        String glasReg = "[уеыаоэяию]";
        String soglReg = "[цкнгшщзхфвпрлджчсмтб]";
        for (String k : a) {
            String[] h = k.split("");
            if (h[0].replaceAll(glasReg, "").equals("")
                    && h[h.length - 1].replaceAll(soglReg, "").equals("")) {
                q.append(k).append(" ");
            }
        }
        System.out.println(q);
    }
}
