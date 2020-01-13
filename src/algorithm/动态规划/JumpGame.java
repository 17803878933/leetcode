package algorithm.动态规划;

//problem
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i - 1]) - 1;
            if(dp[i] < 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int []nums = {2,3,1,1,4};
        boolean b = canJump(nums);
        System.out.println(b);
    }
}
