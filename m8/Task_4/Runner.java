package Task_4;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws Exception {
        int[] a = new int[]{1,3,5,8,56, 22};
        System.out.println(runBinarySearchIteratively(a, 3, 0, 5));
    }

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) throws Exception {
        int index = Integer.MAX_VALUE;
        int z = 0;
        for (int k : sortedArray){
            if (z != 0){
                if (k < z){
                    throw new  Exception();
                }
            }
            z = k;
        }

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
