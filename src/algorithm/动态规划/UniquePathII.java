package algorithm.动态规划;

public class UniquePathII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = 0;

                    if (i == 0 && j == 0) {
                        dp[i][j] = 1;
                    }


                    if (i > 0) {
                        dp[i][j] += dp[i - 1][j];
                    }

                    if (j > 0) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }



        return dp[n - 1][n - 1];


    }

    public static void main(String[] args) {
        int[][] nums = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int res = uniquePathsWithObstacles(nums);
        System.out.println(res);

    }
}
