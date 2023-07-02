package strings;

import java.util.ArrayList;
import java.util.List;

public class LargestLeetCode {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));


    }

    public static String largestNumber(int[] nums) {
        String maxNum = "0";

        for (int i = 0; i < nums.length; i++) {

            String innerNum = "";
            int j = i;
            innerNum = innerNum.concat(String.valueOf(nums[j]));
            j++;

            while (j != i) {
                if (j == nums.length) {
                    j = 0;
                }
                if (j == i) {
                    break;
                }
                innerNum = innerNum.concat(String.valueOf(nums[j]));
                j++;
            }
            maxNum = String.valueOf(Math.max(Integer.parseInt(innerNum), Integer.parseInt(maxNum)));
        }
        return maxNum;
    }
}
