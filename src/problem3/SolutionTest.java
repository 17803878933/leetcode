package problem3;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb";
        s = " ";
        s = "aba ";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println(result);


    }

}
