package problem227;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {
    public int calculate(String s) {
        List<String> list = prefix(s);
        //用于存放整数
        Stack<Integer> stack = new Stack<>();
        for (String str : list) {
            if (str.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (str.equals("-")) {
                stack.push(stack.pop() - stack.pop());
            } else if (str.equals("*")) {
                stack.push(stack.pop() * stack.pop());

            } else if (str.equals("/")) {
                stack.push(stack.pop() / stack.pop());
            } else {//如果是数字，直接入栈
                //将字符型数字转化成int型
                char[] c = str.toCharArray();
                //整型数字临时结果t
                int t = 0;
                for (int i = 0; i < c.length; i++) {

                    int a = (int) (c[i] - '0');
                    for (int j = i + 1; j < c.length; j++) {
                        a *= 10;
                    }
                    t += a;

                }
                //System.out.println(t);
                stack.push(t);
            }
        }

        return stack.pop();
    }


    private List<String> prefix(String s) {
        //用于存储运算符号
        Stack<String> stack = new Stack<>();
        //用于存放前缀式
        List<String> list = new ArrayList<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            if (s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == ')') {
                stack.push(s.substring(i, i + 1));
            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                while (stack.size() >0 && (stack.peek().equals("*") || stack.peek().equals("/"))) {
                    list.add(stack.pop());
                }
                stack.push(s.substring(i, i + 1));
            } else if (s.charAt(i) == '(') {
            String str = stack.pop();
            while (!str.equals(")")) {
                list.add(str);
                str = stack.pop();
            }
        } else {//当字符为数字是直接拼接到字符串
            int b = i;
            while (i >= 0 && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                i--;
            }
            //将数字添加到链表中
            list.add(s.substring(++i, b + 1));
        }

    }
    //将栈中的运算符添加到链表中
        while(stack.size()>0)

    {
        list.add(stack.pop());
    }

        System.out.println(list);
        return list;


}
}
