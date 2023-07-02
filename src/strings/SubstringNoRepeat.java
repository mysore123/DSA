package strings;

/* 3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring
without repeating characters.
eg.
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
*/

// Approach : Use sliding window with a hashset

import java.util.HashSet;
import java.util.Set;

public class SubstringNoRepeat {
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(findLongestDistinctSubstring(input));
    }

    private static int findLongestDistinctSubstring(String input) {
        int left = 0,right = 0;
        int maxLength = 1;
        if (input.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        set.add(input.charAt(right));
        right++;
        while (right < input.length()) {
            if (set.contains(input.charAt(right))) {
                while (input.charAt(right) != input.charAt(left)) {
                    set.remove(input.charAt(left));
                    left++;
                }
                set.remove(input.charAt(left));
                left++;
            }
            set.add(input.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }


}
