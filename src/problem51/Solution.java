package problem51;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<String>> result = new ArrayList<>();
    private int[] arr;

    public List<List<String>> solveNQueens(int n) {
        arr = new int[n];
        solveNQueens(0, n);
        return result;

    }

    private void solveNQueens(int i, int n) {
        if (i == n) {
            disp(arr);
        }else{
            for (int j = 0; j < n; j++) {
                if (place(i, j)) {
                    arr[i] = j;
                    solveNQueens(i + 1, n);
                }
            }
        }

    }

    private boolean place(int i, int j) {
        if (i == 0) {
            return true;
        }
        int k = 0;
        while (k<i){
            if(Math.abs(arr[k]-j) == Math.abs(k - i) || arr[k] == j){
                return false;
            }
            k++;
         }

        return true;
    }

    private void disp(int arr[]){
        List<String> strList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int j=0;j<arr.length;j++){
                if(j<arr[i]){
                    stringBuilder.append(".");
                }else if(j>arr[i]){
                    stringBuilder.append(".");
                }else {
                    stringBuilder.append("Q");
                }
            }

            strList.add(stringBuilder.toString());
        }
        result.add(strList);

    }

    public void prin(){
        System.out.println(result);

    }


}
