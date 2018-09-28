package nowcoder.problem5;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        System.out.println(solution.pop());
        solution.push(5);
        System.out.println(solution.pop());
    }
}
