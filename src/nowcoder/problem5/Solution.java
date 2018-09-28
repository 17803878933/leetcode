package nowcoder.problem5;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.size() == 0){
            throw new IllegalArgumentException("Queue is null");
        }
        for (int i = stack1.size() - 1; i > 0; i--) {
            stack2.push(stack1.pop());
        }

        int res = stack1.pop();

        for(int i=0;i<stack2.size();i++){
            stack1.push(stack2.pop());
        }

        return res;
    }
}
