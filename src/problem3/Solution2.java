package problem3;

import java.util.HashSet;
import java.util.Set;

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        char[] chars = s.toCharArray();

        int l = 0;
        int r = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();
        while (r < s.length()) {
//            if (set.contains(chars[r])) {
//                set.remove(chars[l]);
//                l++;
//                set.add(chars[r]);
//                r++;
//
//            } else {
//                set.add(chars[r]);
//                r++;
//            }
            if(set.contains(chars[r])){
                set.remove(chars[l]);
                r++;
                l++;
            }else {
                set.add(chars[r]);
                r++;
            }

            res = Math.max(set.size(), res);
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "pwwkews";
        int i = new Solution2().lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}