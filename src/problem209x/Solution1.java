package problem209x;

//时间复杂度O(n)
//空间复杂度O(1)
public class Solution1 {
    //使用滑动窗口解决问题
    public int minSubArrayLen(int s, int[] nums) {
        //窗口左边界
        int l = 0;
        //窗口右边界
        int r = -1;
        int sum = 0;
        int res = nums.length + 1;

        while (l < nums.length) {
            if (r + 1 < nums.length && sum < s) {
                sum += nums[++r];
            } else {// r已经到头 或者 sum >= s
                sum -= nums[l];
                l++;
            }
            if (sum >= s) {
                res = Math.min(res, r - l + 1);
            }
        }
        if (res == nums.length + 1) {
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] nums = {2,3,1,2,4,3};

        int i = solution.minSubArrayLen(7, nums);
        System.out.println(i);
    }
}
