/*
    Given an array A of positive integers. Your task is to find the leaders in the array.
    An element of array is leader if it is greater than or equal to all the elements to
    its right side. The rightmost element is always a leader.
*/

package arrays;

import java.util.ArrayList;


public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders(arr, 6));
    }

    static ArrayList<Integer> leaders(int arr[], int n){
        int maxOnRight = Integer.MIN_VALUE;
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if  (arr[i] > maxOnRight){
                maxOnRight = arr[i];
                newList.add(arr[i]);
            }
        }
        return reverse(newList);
    }

    private static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        int j = arr.size() - 1;
        int i = 0;
        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j , temp);
            i++;
            j--;
        }
        return arr;
    }

}
