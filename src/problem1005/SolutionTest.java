package problem1005;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int []A = {2,-3,-1,5,-4};
        int K = 2;
        int res = solution.largestSumAfterKNegations(A,K);
        System.out.println(res);

    }


}
