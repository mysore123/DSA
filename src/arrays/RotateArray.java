/*
    Given an unsorted array arr[] of size N.
    Rotate the array to the left (counter-clockwise direction) by D steps,
    where D is a positive integer.
 */

package arrays;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};
        rotateArr(arr,69,77);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArr(int arr[], int d, int n)
    {
        d = d % n; //In case d is greater than size n then d = d % n;
        reverse(arr, 0, d-1); // 0,5
        reverse(arr, d, n-1); //
        reverse(arr, 0,n-1);
    }

    public static void reverse(int arr[], int start, int end) {
        int j = end;
        int i = start;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
