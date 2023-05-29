package strings;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] array = {
                    {1,2,3},
                    {4,5},
                    {6,7,8,12}
            };
            int target = sc.nextInt();
            System.out.println(search(array, target));
    }

    private static boolean search(int[][] array, int target) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    found  = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        return found;
    }
}
