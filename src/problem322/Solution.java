package problem322;

import javax.xml.bind.SchemaOutputResolver;

class Solution {
    //递归 小规模 复杂度高
    public int coinChange2(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }

        int res = 1000000;
        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i])
                res = Math.min(coinChange2(coins, amount - coins[i]) + 1, res);
        }
        return res;
    }

    public int coinChange(int[] coins, int amount) {

        int[] opt = new int[amount + 1];
        opt[0] = 0;
        for (int i = 1; i < opt.length; i++) {
            int value = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && opt[i - coins[j]] != Integer.MAX_VALUE) {
                    value = Math.min(opt[i - coins[j]] + 1, value);
                }
            }

            opt[i] = value;
        }
        return opt[amount] == Integer.MAX_VALUE ? -1 : opt[amount];
    }


}