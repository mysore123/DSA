package arrays;
// Print all subarrays of an array
public class SubArray {

    public static void main(String[] args) {
        int[] array = {1,2};

        allSubArrays(array);
    }

    private static void allSubArrays(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.println(array[k] + " ");
                }
                count++;
                System.out.println();
            }
        }
        System.out.println("Count: " + count);
    }

}


