package itShagMyProject.m5_1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(searchSubSTR(scanner.nextLine()));
    }

    private static String searchSubSTR(String str) {
        String[] a = {"bb", "ab", "ac", "abc", "acb", "ba",
                "bc", "bac", "bca", "ca", "cb", "cab", "cba"};
        String reg = "a{3}|b{2,3}|c{3}";

        for (String k : a) {
            if (str.replaceAll(reg, "").length() < str.length()) {
                return "не слово";
            }
            if (str.replaceAll(k, "").length() < str.length() - (k.length() * 2)) {
                return "не слово";
            }
        }
        return "слово";
    }
}
