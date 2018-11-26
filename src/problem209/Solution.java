package problem209;

public class Solution {
    //使用滑动窗口解决问题
    public int minSubArrayLen(int s, int[] nums) {
        //窗口左边界
        int l = 0;
        //窗口右边界
        int r = 0;
        int[] sums = new int[nums.length + 1];
        sums[0] = 0;
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        int res = nums.length + 1;
        while (l <= r && r < nums.length) {

            if (sums[r] - sums[l - 1] < s) {
                r++;
            } else if (sums[r] - sums[l - 1] > s) {
                l++;
            } else {
                System.out.println(l + " " + r);
                res = Math.min(r - l + 1, res);
                r++;
            }
        }

        if (res == nums.length + 1) {
            return 0;
        } else {
            return res;
        }
    }

    public int minSubArrayLen2(int s, int[] nums) {

        if (s <= 0 || nums == null)
            throw new IllegalArgumentException("Illigal Arguments");

        // sums[i]存放nums[0...i-1]的和
        int[] sums = new int[nums.length + 1];
        sums[0] = 0;
        for (int i = 1; i <= nums.length; i++)
            sums[i] = sums[i - 1] + nums[i - 1];

        int res = nums.length + 1;
        for (int l = 0; l < nums.length; l++)
            for (int r = l; r < nums.length; r++) {
                // 使用sums[r+1] - sums[l] 快速获得nums[l...r]的和
                if (sums[r + 1] - sums[l] >= s) {
                    res = Math.min(res, r - l + 1);
                    System.out.println(l + "   " + r);
                    break;
                }

            }

        if (res == nums.length + 1)
            return 0;

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};

        int i = solution.minSubArrayLen2(5, nums);
        System.out.println(i);
    }
}
