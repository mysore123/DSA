package arrays;

import java.util.ArrayList;

public class InsertAtIndex {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        insertAtIndex(arr,6,2,90);
        System.out.println(arr);
    }

    public static void insertAtIndex(int arr[],int sizeOfArray,int index,int element) {

        if (index == sizeOfArray - 1) {
            arr[index] = element;
        }
        else {
            ArrayList<Integer> newArr = new ArrayList<>();
            for (int i = index; i < arr.length; i++) {
                newArr.add(arr[i]);
            }
            arr[index] = element;
            for (int i = index + 1, j = 0; i < sizeOfArray; i++) {
                arr[i] = newArr.get(j);
                j++;
            }
        }
    }
}
