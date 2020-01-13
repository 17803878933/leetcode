package algorithm.动态规划;

/**
 * 使用动态规划解决斐波那契数列问题
 */
public class Fib {

    //使用递归法解决斐波那契数列问题
    public static int resFib(int n) {
        if (n == 0) {
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return resFib(n - 1) + resFib(n - 2);
    }

    //使用动态规划解决斐波那契数列
    public static int dpFib(int n) {
        if (n == 0) {
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n - 1];
    }

    public static void main(String[] args) {
        int n = 23;
        int res = resFib(n);
        System.out.println(res);

        int re = dpFib(n);
        System.out.println(re);
    }

}
