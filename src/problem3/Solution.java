package problem3;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        char[] chars = s.toCharArray();
        int l = 0;
        int r = 0;
        int result = 0;
        while(l<chars.length && r<chars.length-1){
            int value = diff(chars,l,r,chars[r+1]);
            if(value == -1){
                r++;
            }else{
                l = value+1;
                r++;
            }
            result = Math.max(result,r-l+1);
        }
        return result;
    }

    private int diff(char []chars,int l,int r,char c){
        for(int i = l;i<=r;i++){
            if(chars[i] == c){
                return i;
            }
        }
        return -1;
    }
}