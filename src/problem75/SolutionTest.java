package problem75;

public class SolutionTest {
    public static void main(String[] args) {

        int []nums = {2,0,2,1,1,0};

        Solution2 solution = new Solution2();
        solution.sortColors(nums);
        for(Integer i:nums){
            System.out.print(i);
        }

    }
}
