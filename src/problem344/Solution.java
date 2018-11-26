package problem344;

class Solution {
    public String reverseString(String s) {
        if(s.length()<=2){
            return s;
        }
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length-1;
        while (l<r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;

            r--;
            l++;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = ",";
        Solution solution = new Solution();
        s = solution.reverseString(s);
        System.out.println(s);
    }
}