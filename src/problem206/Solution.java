package problem206;

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode head2 = new ListNode(-1);
        while (head != null){
            ListNode temp = head;
            head = head.next;
            temp.next = head2.next;
            head2.next = temp;
        }

        return head2.next;
    }
}

