package problem215;

class Solution {
    //使用快速排序找到数组中第k大的元素，时间复杂度O(n)
    public int findKthLargest(int[] nums, int k) {

        return quickSort(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSort(int[] nums, int l, int r, int k) {

        if (l >= r) {
            return nums[k];
        }

        int p = partition(nums, l, r);
        if (p < k) {
            quickSort(nums, p + 1, r, k);
        } else if (p > k) {
            quickSort(nums, l, p - 1, k);
        }
        return nums[k];
    }


    private int partition(int[] nums, int l, int r) {
        int temp = nums[l];
        int i = l;
        int j = r;
        while (i < j) {
            while (i < j && nums[j] >= temp) j--;
            nums[i] = nums[j];
            while (i < j && nums[i] <= temp) i++;
            nums[j] = nums[i];

        }

        nums[i] = temp;
        return i;

    }

}