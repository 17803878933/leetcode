package problem21;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0);
        ListNode ceil = newList;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                ceil.next = l1;
                l1 = l1.next;
            }else {
                ceil.next = l2;
                l2 = l2.next;
            }

            ceil = ceil.next;
        }



        if(l1 == null){
            ceil.next = l2;
        }else {
            ceil.next = l1;
        }

        return newList.next;
    }

}