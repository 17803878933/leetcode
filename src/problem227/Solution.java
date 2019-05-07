package problem227;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public double calculate(String s) {
        List<String> list = prefix(s);
        //用于存放整数
        Stack<Double> stack = new Stack<>();
        for (String str : list) {
            if (str.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (str.equals("-")) {
                stack.push(stack.pop() - stack.pop());
            } else if (str.equals("*")) {
                stack.push(stack.pop() * stack.pop());

            } else if (str.equals("-")) {
                stack.push(stack.pop() / stack.pop());
            } else {//如果是数字，直接入栈
                //将字符型数字转化成double型并添加到栈中
                stack.push(stringToDouble(str));
            }
        }

        return stack.pop();
    }

    //将中缀式字符创转化成前缀式
    private List<String> prefix(String s) {
        //用于存储运算符号
        Stack<String> stack = new Stack<>();
        //用于存放前缀式
        List<String> list = new ArrayList<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (op(s.charAt(i))) {
                stack.push(s.substring(i, i + 1));
            } else if (s.charAt(i) == '(') {
                String str = stack.pop();
                while (!str.equals(")")) {
                    list.add(str);
                    str = stack.pop();
                }
            } else {//当字符为数字是直接拼接到字符串
                int b = i;
                while (i >= 0 && !op(s.charAt(i)) && s.charAt(i) != '(') {
                    i--;
                }
                //将数字添加到链表中
                list.add(s.substring(++i, b + 1));
            }

        }
        //将栈中的运算符添加到链表中
        while (stack.size() > 0) {
            list.add(stack.pop());
        }

        System.out.println(list);
        return list;


    }
    //将一个字符串型转化成double型
    private double stringToDouble(String s){
        char []c = s.toCharArray();
        double t = 0;
        for (int i = 0; i < c.length; i++) {
            if(i != s.indexOf('.')){
                double a = c[i] - '0';
                if (i < s.indexOf('.')){
                    for (int j = i + 1; j < s.indexOf('.'); j++) {
                        a *= 10;
                    }
                }else {
                    for (int j = i; j > s.indexOf('.'); j--) {
                        a *= 0.1;
                    }
                }

                t += a;
            }
        }
        return t;
    }

    //判断一个字符是否是字符串
    private boolean op(char c) {
        if (c == '+' || c == '-' || c == '*'
                || c == '/' || c == ')') {
            return true;
        }

        return false;
    }

//    private List<String> prefix2(String s) {
//        //用于存储运算符号
//        Stack<String> stack = new Stack<>();
//        //用于存放前缀式
//        List<String> list = new ArrayList<>();
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*'
//                    || s.charAt(i) == '/' || s.charAt(i) == ')') {
//                stack.push(s.substring(i, i + 1));
//            } else if (s.charAt(i) == '(') {
//                String str = stack.pop();
//                while (!str.equals(")")) {
//                    list.add(str);
//                    str = stack.pop();
//                }
//            } else {//当字符为数字是直接拼接到字符串
//                int b = i;
//                while (i >= 0 && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
//                    i--;
//                }
//                //将数字添加到链表中
//                list.add(s.substring(++i, b + 1));
//            }
//
//        }
//        //将栈中的运算符添加到链表中
//        while (stack.size() > 0) {
//            list.add(stack.pop());
//        }

//        System.out.println(list);
//        return list;


//    }


}
