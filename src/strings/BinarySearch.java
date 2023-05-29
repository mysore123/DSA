package strings;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,456,78,9023,56,12};
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        System.out.println(binarySearch(arr,start,end, 9023));
    }

    private static boolean binarySearch(int[] arr, int start, int end, int target) {

        boolean found = false;
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) found = true;

        else if (arr[mid] > target) {
            start = 0;
            end = mid;
            return binarySearch(arr, start , end, target);
        }

        else {
            start = mid;
            end = arr.length - 1;
            return binarySearch(arr, start, end, target);
        }

        return found;
    }
}
