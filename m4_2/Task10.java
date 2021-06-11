package itShagMyProject.m4_2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String z = scanner.nextLine();
        String[] a = z.split("");
        String[] zero = {
                "  ****  ",
                " *    * ",
                " *    * ",
                " *    * ",
                "  ****  "};
        String[] one = {
                "    *   ",
                "  * *   ",
                "    *   ",
                "    *   ",
                "  ***** "};
        String[] tho = {
                "   ***  ",
                "  *   * ",
                "      * ",
                "    *   ",
                "  ******"};
        String[] thre = {
                "   ***  ",
                "      * ",
                "     *  ",
                "      * ",
                "   ***  "};
        String[] four = {
                "  *   * ",
                "  *   * ",
                "   **** ",
                "      * ",
                "      * "};
        String[] five = {
                "  ****  ",
                "  * *   ",
                "      * ",
                "  *   * ",
                "   ***  "};
        String[] six = {
                "   ***  ",
                "  *   * ",
                "  * *   ",
                "  *   * ",
                "   ***  "};
        String[] seven = {
                "  ***** ",
                "      * ",
                "    *   ",
                "   *    ",
                "  *     "};
        String[] eath = {
                "   ***  ",
                "  *   * ",
                "    *   ",
                "  *   * ",
                "   ***  "};
        String[] then = {
                "   ***  ",
                "  *   * ",
                "   ** * ",
                "      * ",
                "   ***  "};

        String[][] cancat = new String[a.length][zero.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("1")) {
                System.arraycopy(one, 0, cancat[i], 0, zero.length);
            }
            if (a[i].equals("0")) {
                System.arraycopy(zero, 0, cancat[i], 0, zero.length);
            }
            if (a[i].equals("2")) {
                System.arraycopy(tho, 0, cancat[i], 0, zero.length);
            }
            if (a[i].equals("3")) {
                System.arraycopy(thre, 0, cancat[i], 0, zero.length);
            }
            if (a[i].equals("4")) {
                System.arraycopy(four, 0, cancat[i], 0, zero.length);
            }
            if (a[i].equals("5")) {
                System.arraycopy(five, 0, cancat[i], 0, zero.length);
            }
            if (a[i].equals("6")) {
                System.arraycopy(six, 0, cancat[i], 0, zero.length);
            }
            if (a[i].equals("7")) {
                System.arraycopy(seven, 0, cancat[i], 0, zero.length);
            }
            if (a[i].equals("8")) {
                System.arraycopy(eath, 0, cancat[i], 0, zero.length);
            }
            if (a[i].equals("9")) {
                System.arraycopy(then, 0, cancat[i], 0, zero.length);
            }
        }

        for (int i = 0; i < zero.length; i++) {
            for (String[] strings : cancat) {
                System.out.print(strings[i]);
            }
            System.out.println();
        }
    }
}
