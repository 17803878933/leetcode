package problem322;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int []coins = {186,419,83,408};
        int i = solution.coinChange(coins, 6249);
        System.out.println(i);
    }
}
