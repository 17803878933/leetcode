package problem123x;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maxProfit(int[] prices) {
        int f = 0;
        int d = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if(i == f){
                continue;
            }
            if (f < prices.length && prices[i] - prices[f] > d) {
                d = prices[i] - prices[f];
            } else {
                if(d > 0)
                    list.add(d);
                f = i;
                d = 0;
            }


        }
        System.out.println(list);
        return 0;
    }
}
