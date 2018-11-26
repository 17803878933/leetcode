package problem75;

public class Solution2 {
    //三路快排
    public void sortColors(int[] nums) {
        int zero = -1;   //数组[0...zero]为0
        int two = nums.length;  //数组[two...nums.length]为2

        for (int i = 0; i < two; i++) {
            if (nums[i] == 0) {
                swap(nums, ++zero, i);
            } else if (nums[i] == 2) {
                swap(nums, i, --two);
                i--;
            }
        }
    }

    private void swap(int[] nums, int zero, int i) {
        int temp = nums[zero];
        nums[zero] = nums[i];
        nums[i] = temp;
    }

    //三路快排
    public void sortColors2(int[] nums) {
        int zero = -1;   //数组[0...zero]为0
        int two = nums.length;  //数组[two...nums.length]为2

        for (int i = 0; i < two; i++) {
            if (nums[i] == 0) {
                swap(nums, zero + 1, i);
                zero++;
            } else if (nums[i] == 2) {
                swap(nums, i, two - 1);
                two--;
                i--;
            }
        }
    }



}
