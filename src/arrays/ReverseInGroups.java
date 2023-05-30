package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseInGroups {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverseInGroups(arr,5,2);
        System.out.println(arr);
    }

    private static void reverseInGroups(ArrayList<Integer> arr, int size, int k) {
        for (int i = 0; i < size; i = i + k) {
            int left = i;
            int right = Math.min(i + k - 1, size - 1);

            reverse(arr, left, right);
        }
    }

    private static void reverse(ArrayList<Integer> arr, int start, int end) {
        // reverse an array
        int j = end;
        int i = start;
        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j , temp);
            i++;
            j--;
        }
    }
}
