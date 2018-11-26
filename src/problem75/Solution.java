package problem75;

class Solution {
    //计数排序法
    public void sortColors(int[] nums) {
        int[] cout = new int[3];
        for (int i = 0; i < nums.length; i++) {
            cout[nums[i]]++;
        }

        int index = 0;
        for (int i = 0; i < cout[0]; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i < cout[1]; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < cout[2]; i++) {
            nums[index++] = 2;
        }
    }


}
