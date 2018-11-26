package problem27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                if(j != i){
                    swap(nums,j++,i);
                }else {
                    j++;
                }
            }
        }

        return j;
    }

    private void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}
