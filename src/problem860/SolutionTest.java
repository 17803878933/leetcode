package problem860;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int []bills = {5,5,10,10,5,20,5,10,5,5};
        boolean re = solution.lemonadeChange(bills);
        System.out.println(re);
    }


}
