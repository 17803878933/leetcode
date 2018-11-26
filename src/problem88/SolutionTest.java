package problem88;

public class SolutionTest {
    public static void main(String[] args) {

        int []nums1 = {1,2,3,0,0,0};
        int []nums2 = {2,5,6};
//
//        int []nums1 = {2,0};
//        int []nums2 = {1};

        //int []nums1 = {4,5,6,0,0,0};
        int m = 3;
        //int []nums2 = {1,2,3};
        int n = 3;

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        for(Integer i:nums1){
            System.out.print(i);
        }


    }
}
