package problem51;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private int n;
    List<String> strList = new ArrayList<>();
    List<List<String>> result = new ArrayList<>();
    private int[] arr = new int[n];

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        int i = 0;
        solveNQueens(i, n);
        result.add(strList);
        return result;

    }

    private void solveNQueens(int i, int n) {
        if (i == n) {

        }

        for (int j = 0; j < n; j++) {
            if (place(i, j)) {
                arr[i] = j;
                solveNQueens(i + 1, n);
            }
        }
    }

    private boolean place(int i, int j) {
        if (i == 1) {
            return true;
        }
        int k = 0;
        while (k<i){

        }

        return false;
    }


}
