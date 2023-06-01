package Math;

public class CountDigits {
    public static void main(String[] args) {
        int a = -8979790;
        System.out.println(countOfDigits(a));
    }

    private static int countOfDigits(int a) {
        int count = 0;
        if (a == 0) return 1;
        while (a != 0) {
            a = a / 10;
            count++;
        }
        return count;
    }
}
