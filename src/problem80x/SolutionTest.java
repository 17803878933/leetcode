package problem80x;



public class SolutionTest {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int arrs[] = {1,1,1,2,2,3};
        int i1 = solution.removeDuplicates(arrs);
        System.out.println(i1);

        for(int i=0;i<arrs.length;i++){
            System.out.print(arrs[i]+" ");
        }

    }
}
