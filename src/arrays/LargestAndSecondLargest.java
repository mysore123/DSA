package arrays;

import java.util.ArrayList;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        int[] arr = {80,80,80};
        System.out.println(largestAndSecondLargest(3, arr));
    }

    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        int max = arr[0];
        int secondMax = -1;
        for (int i = 1; i < sizeOfArray; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        ArrayList<Integer> arrNew = new ArrayList<>();
        arrNew.add(max);
        arrNew.add(secondMax);
        return arrNew;
    }
}
