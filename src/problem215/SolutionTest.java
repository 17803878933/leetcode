package problem215;

public class SolutionTest {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int arrs[] = {3,2,1,5,6,4};
        int i1 = solution.findKthLargest(arrs,2);
        System.out.println(i1);
        for(Integer item :arrs){
            System.out.print(item+" ");
        }

    }
}
