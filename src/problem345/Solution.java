package problem345;

class Solution {
    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        while (l < r) {
            while (l < r && (chars[l] != 'a' && chars[l] != 'e' && chars[l] != 'i' && chars[l] != 'o' && chars[l] != 'u'
                    && chars[l] != 'A' && chars[l] != 'E' && chars[l] != 'I' && chars[l] != 'O' && chars[l] != 'U')) {
                l++;
            }
            while (l < r && (chars[r] != 'A' && chars[r] != 'E' && chars[r] != 'I' && chars[r] != 'O' && chars[r] != 'U'
                    && chars[r] != 'a' && chars[r] != 'e' && chars[r] != 'i' && chars[r] != 'o' && chars[r] != 'u')) {
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

    public static void main(String[] args) {
        String s = "oA";
        Solution solution = new Solution();
        s = solution.reverseVowels(s);
        System.out.println(s);
    }
}