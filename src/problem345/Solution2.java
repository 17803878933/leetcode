package problem345;

public class Solution2 {
    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        while (l < r) {
            while (l < r && isVowels(chars[l])) {
                l++;
            }
            while (l < r && isVowels(chars[r])) {
                r--;
            }
            if (l < r) {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
            }

            r--;
            l++;
        }

        return new String(chars);
    }
    
    public boolean isVowels(char c){
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'
                && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U';
            
    }

    public static void main(String[] args) {
        String s = "oA";
        Solution solution = new Solution();
        s = solution.reverseVowels(s);
        System.out.println(s);
    }
}
