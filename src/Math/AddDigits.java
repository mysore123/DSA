/*
    Given an integer num, repeatedly add all its digits until the result has only one digit,
     and return it.
     eg :   Input: num = 38
            Output: 2
            Explanation: The process is
            38 --> 3 + 8 --> 11
            11 --> 1 + 1 --> 2
            Since 2 has only one digit, return it.
 */

package Math;

import java.util.*;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(19));
    }

    public static int addDigits(int num) {
        int result = getSum(num);

        while (result >= 10) {
            result = getSum(result);
        }

        return result;
    }

    public static int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }
}
