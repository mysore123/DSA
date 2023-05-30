// Q : Return no of subArrays which equal sum K

package arrays;

public class SubArrayEqualsK {

    public static void main(String[] args) {
        int[] array = {1,4,20,3,10,5};
        noOfSubArraysWhichEqualK(array, 33);
        firstSubArrayWhichEqualsK(array, 33);
    }

    private static void firstSubArrayWhichEqualsK(int[] array, int k) {
        // Using sliding window technique for array with all *positive integers*
        int right = 0;
        int left = 0;
        int sum = 0;
        while (right < array.length) {
            if (sum == k) {
                System.out.println("SubArray lies between indices : " + left + ", " + (right - 1));
                break;
            }

            else if (sum < k) {
                sum = sum + array[right];
                right++;
            }

            else {
                while (sum > k && left < right) {
                    sum = sum - array[left];
                    left++;
                }
            }
        }

        // TC : O(N)
        // SC : O(N)

    }

    private static void noOfSubArraysWhichEqualK(int[] array, int k) {
        int count = 0;
        for (int i = 0; i< array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println("Count of subArrays which equal " + k + " is: " + count);
        // TC : O(N2)
        // SC : O(1)
    }

}
