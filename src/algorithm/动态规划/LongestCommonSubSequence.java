package algorithm.动态规划;

public class LongestCommonSubSequence {
    public static int lcs(int[][] dp, String a, String b) {
        if (a.length() <= 0 || b.length() <= 0) {
            return 0;
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (b.charAt(j - 1) == a.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[a.length()][b.length()];
    }

    public static String buildCommonSubsequence(int[][] dp, int l, String a, String b) {
        int i = dp.length - 1;
        int j = dp[0].length - 1;
        StringBuilder sb = new StringBuilder();
        while (l > 0) {
            if (dp[i][j] == dp[i - 1][j]) {
                i--;
            } else if (dp[i][j] == dp[i][j - 1]) {
                j--;
            }else {
                sb.append(a.charAt(i-1));
                l--;
                i--;
                j--;
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "abcbdb";
        String b = "acbbabdbb";
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        int res = lcs(dp, a, b);
        System.out.println(res);

        String s = buildCommonSubsequence(dp, res, a, b);
        System.out.println(s);

    }
}
