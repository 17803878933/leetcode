package problem52;


class Solution {
    private int total = 0;
    private int []arr;
    public int totalNQueens(int n) {
        arr = new int[n];
        queen(0,n);
        return total;
    }

    private void queen(int i,int n){
        if(i == n){
            total++;
            return;
        }

        for(int j=0;j<n;j++){
            if(place(i,j)){
                arr[i] = j;
                queen(i+1,n);
            }
        }

    }

    private boolean place(int i,int j){
        if(i == 0){
            return true;
        }

        int k = 0;
        while (k<i){
            if(arr[k] == j || Math.abs(arr[k] - j) == Math.abs(k-i)){
                return false;
            }
            k++;
        }
        return true;
    }

    public void disp(){
        System.out.println(total);
    }

}