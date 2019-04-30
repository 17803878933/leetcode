package problem455;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int []g = {1,2,3};
        int []s = {1,1,2,3};
        int re = solution.findContentChildren(g,s);
        System.out.println(re);
    }


}
