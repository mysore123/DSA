// Check if string is an anagram of another string

package strings;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(checkIfAnagram(str1, str2));
        System.out.println(checkIfAnagram2(str1, str2));

    }

    public static Boolean checkIfAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        char[] a1 = str1.toCharArray();
        Arrays.sort(a1);
        String s1 = new String(a1);

        char[] a2 = str2.toCharArray();
        Arrays.sort(a2);
        String s2 = new String(a2);

        return s1.equals(s2);

        // TS : O(nlogn)
    }

    //Efficient Solution
    public static Boolean checkIfAnagram2(String str1, String str2) {
        final int SIZE = 256;

        int frequencyCount[] = new int[SIZE];
        for (int i = 0; i < str1.length(); i++) {
            frequencyCount[str1.charAt(i)]++;
            frequencyCount[str2.charAt(i)]--;
        }

        for (int j : frequencyCount) {
            if (j != 0) return false;
        }

        return true;

        // TC : O(n)
    }


}
