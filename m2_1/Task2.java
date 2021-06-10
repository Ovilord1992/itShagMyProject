package m2_1;

public class Task2 {
    public static void main(String[] args) {
        int a = 998;
        int summ = 0;
        String s = Integer.toString(a);
        for (int i = 0; i < s.length(); i++) {
            summ = summ + (Character.getNumericValue(s.charAt(i)));
        }
        System.out.println(summ);
    }
}
