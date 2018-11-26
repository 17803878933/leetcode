package problem283;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int arrs[] = {1, 0, 5, 0, 7};
        solution.moveZeroes(arrs);
        for(Integer i:arrs){
            System.out.print(i+" ");
        }
    }
}
