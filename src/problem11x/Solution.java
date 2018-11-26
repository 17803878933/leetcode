package problem11x;

import java.util.TreeSet;

class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        while (l < r) {
            int temp = Math.min(height[l], height[r]) * (r - l);
            res = Math.max(res, temp);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int []arrs = {1,2,3,4,5};
        int res = solution.maxArea(arrs);
        System.out.println(res);

    }
}