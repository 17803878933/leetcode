package problem125;

class Solution {
    public static void main(String[] args) {
        String s = ",,";
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome2(s);
        System.out.println(palindrome);

    }

        public boolean isPalindrome2(String s) {
            if (s.isEmpty()) {
                return true;
            }
            int head = 0, tail = s.length() - 1;
            char cHead, cTail;
            while(head <= tail) {
                cHead = s.charAt(head);
                cTail = s.charAt(tail);
                if (!Character.isLetterOrDigit(cHead)) {
                    head++;
                } else if(!Character.isLetterOrDigit(cTail)) {
                    tail--;
                } else {
                    if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                        return false;
                    }
                    head++;
                    tail--;
                }
            }

            return true;
    }
}