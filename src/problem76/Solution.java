package problem76;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),0);
        }
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),1);
        }

        int l = 0;
        int r = 0;
        int count = t.length();
        int head = 0;
        int len = t.length();
        while(r<s.length()){
            if(map.get(s.charAt(r)) > 0){
                count--;
            }
            map.put(s.charAt(r),map.get(s.charAt(r))-1);
            r++;
            while(count==0){
                if(r-l < len){
                    head = l;
                    len = r-l+1;
                }

                if(map.get(s.charAt(l)) == 0){
                    count++;
                }
                map.put(s.charAt(l),map.get(s.charAt(l))+1);
                l++;
            }


        }
        return s.substring(head,head+len);
    }
}