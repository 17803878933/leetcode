package problem455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int i, j;
        for (i = 0, j = 0; i < g.length && j < s.length; ) {
            if (g[i] <= s[j]) {
                result++;
                i++;

            }
            j++;
        }
        return result;

    }
}
