package nowcoder.problem6;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }
        int res = array[0];
        for(int i=1;i<array.length;i++){
            if(res > array[i]){
                res = array[i];
            }
        }

        return res;
    }
}