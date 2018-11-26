package test;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(5,5);
        map.put(4,4);
        map.put(3,3);
        map.put(2,2);
        for(Integer key : map.keySet()){
            System.out.println(key);
        }

    }
}
