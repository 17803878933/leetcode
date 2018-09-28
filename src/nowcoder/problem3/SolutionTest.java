package nowcoder.problem3;

import java.util.ArrayList;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(11);
        ListNode tail = listNode;
        for(int i=12;i<18;i++){
            ListNode temp = new ListNode(i);
            tail.next = temp;
            tail = tail.next;
        }

        ArrayList<Integer> list = solution.printListFromTailToHead(listNode);
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
