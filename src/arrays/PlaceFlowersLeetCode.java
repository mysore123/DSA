package arrays;

public class PlaceFlowersLeetCode {
    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,0};
        System.out.println(canPlaceFlowers(flowerbed, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (n == 0) break;
                if (ifFlowerCanBeAdded(flowerbed, i)) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return (n == 0);
    }

    public static Boolean ifFlowerCanBeAdded(int[] flowerbed, int index) {
        if (index == 0) {
            return index + 1 == flowerbed.length || flowerbed[index + 1] == 0;
        }
        else if (index == flowerbed.length - 1) {
            return flowerbed[flowerbed.length-2] == 0;
        }
        else return flowerbed[index - 1] == 0 && flowerbed[index + 1] == 0;
    }
}
