package problem209x;

//时间复杂度O(n2)
//空间复杂度O(n)
public class Solution {
    //使用滑动窗口解决问题
    public int minSubArrayLen(int s, int[] nums) {

        int[] sums = new int[nums.length + 1];
        sums[0] = 0;
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        int res = nums.length + 1;
        for (int l = 0; l < nums.length; l++) {
            for (int r = l; r < nums.length; r++) {
                if (sums[r + 1] - sums[l] >= s) {
                    res = Math.min(r - l + 1, res);
                    break;
                }
            }
        }

        if (res == nums.length + 1) {
            return 0;
        }

        return res;
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

        int i = solution.minSubArrayLen3(5, nums);
        System.out.println(i);
    }

    public int minSubArrayLen3(int s, int[] nums) {

        if(s <= 0 || nums == null)
            throw new IllegalArgumentException("Illigal Arguments");

        int l = 0 , r = -1; // nums[l...r]为我们的滑动窗口
        int sum = 0;
        int res = nums.length + 1;

        while(l < nums.length){   // 窗口的左边界在数组范围内,则循环继续

            if(r + 1 < nums.length && sum < s)
                sum += nums[++r];
            else // r已经到头 或者 sum >= s
                sum -= nums[l++];

            if(sum >= s)
                res = Math.min(res, r - l + 1);
        }

        if(res == nums.length + 1)
            return 0;
        return res;
    }
}
