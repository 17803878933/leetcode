package algorithm.动态规划;

/**
 * 求解会议最大价值
 * 会议编号：1 2 3 4 5 6 7   8
 * <p>
 * 开始时间：1 3 0 4 3 5 6   8
 * 结束时间：4 5 6 7 8 9 10  11
 * 会议价值：5 1 8 4 6 3 2   4
 * pre 0 0 0 1 0 2 3   5
 */
public class Meeting {
    //使用递归求解
    public static int solve(int[] b, int[] e, int[] v, int n) {
        if (n == 0) {
            return v[n];
        }
        //选择第n个会议
        //找到结束时间小于等于第n个会议的开始时间
        int i;
        boolean flag = false;  //没有找到为false
        int selectN;
        for (i = n - 1; i >= 0; i--) {
            if (e[i] <= b[n]) {
                flag = true;
                break;
            }
        }
        if (flag) {
            selectN = solve(b, e, v, i) + v[n];
        } else {
            //没有找到
            selectN = v[n];
        }


        //不选择第n个会议
        int discardN = solve(b, e, v, n - 1);
        return Math.max(selectN, discardN);
    }


    //使用动态规划求解
    public static int dpSolve(int[] b, int[] e, int[] v) {
        //1.根据起始和结束时间 求出与第n个会议相容的上一个会议
        int[] pre = new int[b.length];
        for (int i = 0; i < pre.length; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (b[i] >= e[j]) {
                    pre[i] = j;
                    break;
                }
            }
            if (j == -1) {
                //如果找不到
                pre[i] = -1;
            }

        }

        int[] opt = new int[b.length];  //存放每一步求出的最优解
        opt[0] = v[0];
        for (int i = 1; i < pre.length; i++) {
            if (pre[i] == -1) {
                opt[i] = Math.max(v[i], opt[i - 1]);
            } else {
                opt[i] = Math.max(opt[pre[i]] + v[i], opt[i - 1]);
            }
        }

        return opt[opt.length - 1];
    }

    public static void main(String[] args) {
        int b[] = {1, 3, 0, 4, 3, 5, 6, 8};
        int e[] = {4, 5, 6, 7, 8, 9, 10, 11};
        int v[] = {5, 1, 8, 4, 6, 3, 2, 4};

        System.out.println(solve(b, e, v, b.length - 1));
        System.out.println(dpSolve(b, e, v));
    }
}
