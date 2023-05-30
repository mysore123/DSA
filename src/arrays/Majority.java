package arrays;

public class Majority {
    public static void main(String[] args) {
        int[] arr = {5,22,29,12,32,69,1,75};
        System.out.println(majorityWins(arr, 8, 29, 96));
    }

    public static int majorityWins(int arr[], int n, int x, int y) {
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) countX++;
            if (arr[i] == y) countY++;
        }
        if (countX == countY) {
            return Math.min(x,y);
        }
        else return ((countX > countY) ? x : y);
    }
}
