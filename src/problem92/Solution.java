package problem92;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode head2 = head;
        for (int i = 1; i < m; i++) {
            head2 = head2.next;
        }
        ListNode head3 = head2;
        for (int i = m; i <= n; i++) {
            ListNode temp = head2;
            head2 = head2.next;
            temp.next = head3.next;
        }
    }
}
