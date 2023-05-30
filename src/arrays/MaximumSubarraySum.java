package arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};

        bruteSubArraySum(array);
        betterSybArraySum(array);
        optimizedSubArraySum(array);
    }

    //BRUTE FORCE APPROACH
    private static void bruteSubArraySum(int[] array) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k]);
                    sum += array[k];
                }
                max_sum = Math.max(max_sum, sum);
                System.out.print("] ");
            }
        }
        System.out.println("\nBrute Max Sum: " + max_sum);
        
        // TC : almost O(N3)
        // SC : O(1) 
    }

    private static void betterSybArraySum(int[] array) {
        // Instead of using 3rd loop to calculate all subArrays and then get sum, we can directly find sum.
       int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i< array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                max_sum = Math.max(sum, max_sum);
            }
        }
        System.out.println("Better Max Sum: " + max_sum);
        // TC : almost O(N2)
        // SC : O(1)
    }

    private static void optimizedSubArraySum(int[] array) {
        //Kadane's Algorithm
        int res = array[0];
        int max_sum = array[0];
        for (int i = 1; i < array.length; i++) {
            max_sum = Math.max(max_sum + array[i], array[i]);
            res = Math.max(max_sum, res);
        }
        System.out.println("Optimized Max Sum: " + res);

        // TC : almost O(N)
        // SC : O(1)
    }
}
