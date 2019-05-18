package problem2;


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int k = 0;  //表示进位
        int d = 0;  //表示余数
        ListNode l3 = new ListNode(-1);    //储存结果,带有头结点
        ListNode l4 = l3;
        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + k;
            k = temp / 10;
            d = temp % 10;
            l3.next = new ListNode(d);
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode ln;
        if (l1 == null) {
             ln = l2;
        } else {
             ln = l1;
        }
        while (ln != null) {
            int temp = ln.val + k;
            k = temp / 10;
            d = temp % 10;
            l3.next = new ListNode(d);
            l3 = l3.next;
            ln = ln.next;
        }


        if (k != 0) {
            l3.next = new ListNode(k);
        }


        return l4.next;
    }
}