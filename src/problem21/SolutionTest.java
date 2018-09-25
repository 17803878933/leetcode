package problem21;

public class SolutionTest {
    public static void main(String[] args) {
        int []a = {1,2,3};
        int []b = {1,3,5};
        ListNode l1;
        ListNode p;
        l1 = new ListNode(a[0]);
        p = l1;
        for(int i=1;i<a.length;i++){
            p.next = new ListNode(a[i]);
            p = p.next;
        }

        ListNode l2;
        ListNode q;
        l2 = new ListNode(b[0]);
        q = l2;
        for(int i=1;i<b.length;i++){
            q.next = new ListNode(b[i]);
            q = q.next;
        }

        Solution2 solution = new Solution2();
        ListNode newList = solution.mergeTwoLists(l1,l2);

        while (newList != null){
            System.out.println(newList.val);
            newList = newList.next;
        }


    }

}
