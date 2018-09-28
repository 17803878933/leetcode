package nowcoder.problem3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        List list = new ArrayList();
        query(listNode, list);
        return (ArrayList) list;
    }

    private ListNode query(ListNode listNode, List list) {
        if(listNode == null){
            return null;
        }
        query(listNode.next,list);

        list.add(listNode.val);
        return listNode;

    }
}