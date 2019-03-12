package problem3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();

        int l = 0;
        int r = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            if (map.get(chars[r]) != null) {
                l = map.get(chars[r]) + 1;
                map.put(chars[r], r);
                r++;
            } else {
                map.put(chars[r], r);
                r++;
            }
            res = Math.max(r - l, res);
        }

        return res;
    }

    public static void main(String[] args) {
//        String s = "qrsvbspk";
//        String s = "pwwkewsw";
//        String s = "abcabcbb";//3
        String s = "abba";
        int i = new Solution().lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}