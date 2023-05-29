package strings;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {-20,103,100};

        System.out.println(countOfEvenNumberOfDigits(array));
    }

    private static int countOfEvenNumberOfDigits(int[] arr) {
        int totalCount = 0;
        for (int ele : arr) {
            int count = 0;
            int temp = ele;
            do {
                temp = temp / 10;
                count++;
            } while (temp != 0);
            if (count % 2 == 0) totalCount++;
        }
        return totalCount;
    }
}
