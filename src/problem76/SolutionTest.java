package problem76;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String s1 = solution.minWindow(s, t);
        System.out.println(s1);
    }


}
