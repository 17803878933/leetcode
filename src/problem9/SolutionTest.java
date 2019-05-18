package problem9;


public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {-1,2323,2332,423224};
        for (int i = 0; i < a.length; i++) {
            boolean palindrome = solution.isPalindrome(a[i]);
            System.out.println(palindrome);
        }

    }

}
