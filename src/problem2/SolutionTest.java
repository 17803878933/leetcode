package problem2;

import java.util.List;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int []a = {0};
        int []b = {5 , 6 , 4};
        ListNode l1 = new ListNode(0);
        ListNode l11 = l1;
        ListNode l2 = new ListNode(5);
        ListNode l22 = l2;
        for(int i=1;i<a.length;i++){
            l1.next = new ListNode(a[i]);
            l1 = l1.next;
        }

        for(int i=1;i<b.length;i++){
            l2.next = new ListNode(b[i]);
            l2 = l2.next;
        }

        ListNode listNode = solution.addTwoNumbers(l11, l22);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }

}
