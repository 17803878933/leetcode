package problem1005;

import java.util.Arrays;

public class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                index = i;
                break;
            }
        }

        for (int i = 0; i < Math.min(index, K); i++) {
            A[i] = Math.abs(A[i]);
        }

        if(index != 0)
            Arrays.sort(A);

        if (K > index) {
            K -= index;
            if (K % 2 != 0) {
                A[0] = 0-A[0];
            }
        }

        int res = 0;
        for (int i = 0; i < A.length; i++) {
            res += A[i];
        }
        return res;
    }
}
