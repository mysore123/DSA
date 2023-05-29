package strings;

import java.util.Arrays;

public class RichestWealthLeetode {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int customer = 0; customer < accounts.length; customer++) {
            int wealth = 0;
            for (int bank = 0; bank < accounts[customer].length; bank++) {
                wealth += accounts[customer][bank];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}
