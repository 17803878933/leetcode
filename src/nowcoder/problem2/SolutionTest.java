package nowcoder.problem2;

public class SolutionTest {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        String str = "   ";
        StringBuffer stringBuffer = new StringBuffer(str);
        String s = solution.replaceSpace(stringBuffer);
        System.out.println(s);
    }
}
