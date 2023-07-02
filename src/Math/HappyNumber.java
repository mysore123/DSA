package Math;

// Leetcode - https://leetcode.com/problems/happy-number/
// Logic is if it is not a HappyNumber then as we keep squaring the numbers we reach a previous
// squared result, thus we can say it is not a happy number.

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int no = 19;
        Set<Integer> set = new HashSet<>();
        System.out.println(isHappyNumber(no, set));
    }

    private static Boolean isHappyNumber(int no, Set<Integer> set) {
        if (no == 0)
            return false;
        if (no == 1)
            return true;
        int sum = sumOfDigits(no);
        if (set.contains(sum)) {
            return false;
        }
        set.add(sum);
        return isHappyNumber(sum, set);
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num / 10;
            num = num / 10;
            sum = sum + (lastDigit * lastDigit);
        }
        return sum;
    }
}
