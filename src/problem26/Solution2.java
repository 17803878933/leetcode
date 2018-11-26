package problem26;

public class Solution2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int flag = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (i != flag) {
                    nums[flag++] = nums[i];
                } else {
                    flag++;
                }
            }
        }

        return flag;
    }
}
