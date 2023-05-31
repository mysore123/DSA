/*
    Given an array of integers nums, calculate the pivot index of this array.
    The pivot index is the index where the sum of all the numbers strictly to the
    left of the index is equal to the sum of all the numbers strictly to the index's right.
    If the index is on the left edge of the array, then the left sum is 0 because there are no
    elements to the left. This also applies to the right edge of the array.
    Return the leftmost pivot index. If no such index exists, return -1.
*/

package arrays;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {2,5};
        System.out.println(pivotIndex(nums));
        System.out.println(optimizedPivotIndex(nums));
        System.out.println(map());

    }

    public static Boolean map() {
        String s = "anagram";
        String t = "margram";

        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArrS = s.toCharArray();
        char[] charArrT = t.toCharArray();

        for (char ele : charArrS) {
            if (map.containsKey(ele)) {
                map.computeIfPresent(ele, (k,v) -> v+1);
            }
            else {
                map.put(ele, 1);
            }
        }
        Boolean isAnagram = true;
        for (char ele : charArrT) {
            if (map.containsKey(ele)) {
                map.computeIfPresent(ele, (k,v) -> v-1);
            }
            else {
                isAnagram = false;
                break;
            }
        }
        if (!isAnagram) {
            return isAnagram;
        }

        AtomicReference<Boolean> matching = new AtomicReference<>(true);
        map.forEach((k,v) -> {
            if (v != 0) {
                matching.set(false);
            }
        });
        if (matching.get()) {
            return true;
        }

        return false;
    }

    public static int pivotIndex(int[] nums) {
        int requiredIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            if (i == 0) {
                rightSum = getSum(i+1, nums.length-1, nums);
            }
            else if (i == nums.length-1) {
                leftSum = getSum(0, i-1, nums);
            }
            else {
                leftSum = getSum(0, i-1, nums);
                rightSum = getSum(i+1, nums.length-1, nums);
            }

            if (leftSum == rightSum) {
                requiredIndex = i;
                break;
            }
        }
        return requiredIndex;
        //TC : ~~ O(N2)
        //SC : O(1)
    }

    public static int optimizedPivotIndex(int[] nums) {
        // Approach here is:
        // lSum + rSum + middleEle = totalSum
        // Thus, when current ele is middle ele, 2*lSum + middleEle = totalSum

        int totalSum = 0;
        int lSum = 0;

        int desiredIndex = -1;

        for (int i : nums) {
            totalSum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (2*lSum + nums[i] == totalSum) {
                desiredIndex = i;
                break;
            }
            lSum = lSum + nums[i];
        }
        return desiredIndex;
    }



    public static int getSum(int start, int end, int[] nums) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum+=nums[i];
        }
        return sum;
    }
}
