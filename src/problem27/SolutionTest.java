package problem27;

public class SolutionTest {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int arrs[] = {1, 0, 5, 0, 7};
        int i1 = solution.removeElement(arrs, 0);
        System.out.println(i1);
        for(Integer i:arrs){
            System.out.print(i+" ");
        }
    }
}
