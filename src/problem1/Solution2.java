package problem1;

import java.util.HashMap;
import java.util.Map;
// 开辟哈希表
// 时间复杂度: O(n)
// 空间复杂度: O(n)
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return new int[]{i, map.get(nums[i])};
            }
            map.put(target - nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arrs = {2, 7, 11, 15};

        Solution solution = new Solution();
        int[] ints = solution.twoSum(arrs, 9);
        for (Integer item : ints) {
            System.out.println(item);
        }
    }
}
