package ItShag.itShagMyProject.m5_1;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] a = new String[100_000];
        int index = 0;
        while (index < 100_000){
            a[index] = index + "";
            index++;
        }

        int calc = (int) Arrays.stream(a).filter(s ->
                s.replace("13", "")
                        .replace("4", "")
                        .length() < s.length()).count();

        System.out.println(calc + " Техники придется исключить из " + a.length);
    }
}
