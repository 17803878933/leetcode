package problem206;

public class SolutionTest {
    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        head.next = null;
        for (int i = 8; i >= 0; i--) {
            ListNode n = new ListNode(i);
            n.next = null;
            ListNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }

        Solution s = new Solution();
        head = s.reverseList(head);

        ListNode temp = head;
        while (temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
    }

}
