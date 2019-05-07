package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] w = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] y = {'1', '0', 'x', '9', '8', '7', '6', '5', '4', '3', '2',};
        String str = scanner.nextLine();
        char[] c = str.toCharArray();
        if (c.length != 18) {
            System.out.println("输入的身份证号码有误！");
        }

        int[] arr = new int[17];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = c[i] - 48;
            sum += arr[i] * w[i];
        }

        int x = sum % 11;
        if (y[x] == c[17]) {
            System.out.println(str + "正确");
        } else {
            System.out.println(str + "不正确");
        }


    }
}
//北京理工大学上机题（一）
//        每日编程中遇到任何疑问、意见、建议请公众号留言或加入每日编程群聊739635399
//
//        身份证号的校验身份证号码共18位，最后一位是校验位A[18] : aaaaaabbbbbbbbcccd
//
//        校验的规则是如下：
//
//        前十七位的权值分别是：
//
//        W[17]:7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2
//        x=(A[0]*W[0]+A[1]*W[1]+A[2]*W[2]+...+A[16]*W[16]) mod 11
//        x和校验位y的对应规则对应如下：
//        x:0 1 2 3 4 5 6 7 8 9 10
//        y:1 0 x 9 8 7 6 5 4 3 2
//        若y等于d则身份证号码正确
//        输出格式：aaaaaabbbbbbbbcccd 正确
//        若y不等于d则身份证号码不正确
//        输出格式：应为:aaaaaabbbbbbbbcccy
//        输入格式：
//        身份证号码
//
//        输出格式：
//        身份证号码 正确或者不正确
//        输入样例：
//        52242619811105565x
//        输出样例：
//        52242619811105565x 正确