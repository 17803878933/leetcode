package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        double[][] arr = new double[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextDouble();
            arr[i][1] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1][0] > arr[j][0]) {
                    double temp1 = arr[j - 1][0];
                    double temp2 = arr[j - 1][1];

                    arr[j - 1][0] = arr[j][0];
                    arr[j - 1][1] = arr[j][1];

                    arr[j][0] = temp1;
                    arr[j][1] = temp2;

                }
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][1];
        }

        int res = 0;
        if (sum > t) {
            for (int i = 0; i < n; i++) {
                t = t - (int) arr[i][1];
                if (t < 0) {
                    res += arr[i][0] * (t + (int) arr[i][1]);
                    System.out.println(res);
                } else {
                    res += arr[i][0] * arr[i][1];
                }

            }
        } else {
            res += t - sum;
            for (int i = 0; i < n; i++) {
                res += arr[i][0] * arr[i][1];
            }

            System.out.println(res);
        }

    }
//    3 500 0.6 100  0.8 200 0.7 100
//    2 100 0.7 70 0.6 50
}

//中南大学上机题（三）
//        每日编程中遇到任何疑问、意见、建议请公众号留言或直接撩Q474356284(备注每日编程)
//
//        鲁大师和他的朋友们经常去一家奇怪的餐厅,为什么说奇怪呢,一是餐厅提供的菜品比较奇怪,二是餐厅的付费规则比较奇怪,每个人有不同的折扣率和折扣上限(单人从总价里折算的最高金额),超过折扣上限的原价付费。这次鲁大师和蔚然晨风以及朋友们一共N个人去这家餐厅吃饭,他们点的菜品总价是T,现在告诉你每个人的折扣率z和折扣上限H请告诉他们最少需要支付多少钱。
//
//        输入格式：
//        输入数据有多组,每组占N+1行,第一行是N和T,接下来N行,每行两个数字z和H(输入数据保证最后结果为int型,0<N<100)
//
//        输出格式：
//        对于每组输入数据,输出一行,对应一个要求的答案。
//
//        输入样例：
//        2 100
//        0.7 70
//        0.6 50
//        3 500
//        0.6 100
//        0.8 200
//        0.7 100
//        1 100
//        0.6 100
//        输出样例：
//        65
//        390
//        60
