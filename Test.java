package itShagMyProject;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] mass = new int [] {3,2,1};
        for (int element : mass){
            element = 0;
        }
        System.out.println(mass[0]);
    }
}
