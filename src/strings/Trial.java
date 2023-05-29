package strings;

import java.util.Arrays;

public class Trial {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr = {0,1,3};
        swap (arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] a) {
        a[0] = 20;
    }
}
