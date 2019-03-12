package problem447;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int j=0;j<points.length;j++){
                if(i!=j){
                    int temp = dis(points[i][0],points[i][1],points[j][0],points[j][1]);
                    if(map.get(temp) != null){
                        map.put(temp,map.get(temp)+1);
                    }else {
                        map.put(temp,1);
                    }
                }
            }

            for(Integer key:map.keySet()){
                res += map.get(key)*(map.get(key)-1);
            }
        }

        return res;
    }

    private int dis(int i, int i1, int i2, int i3) {
        return  (int)(Math.pow(i2-i,2)+Math.pow(i3-i1,2));
    }


    public static void main(String[] args) {
        int[][] arrs = {{0, 0}, {1, 0}, {2, 0}};

        Solution solution = new Solution();
        int i = solution.numberOfBoomerangs(arrs);
        System.out.println(i);
    }
}
