package algorithm.kmp;

public class KmpTest2 {
    private int findSubString(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int i = 0;    //指向c1的指针
        int j = 0;    //指向c2的指针

        int[] next = getNext(s2);
        while (i < c1.length && j < c2.length) {
            if (c1[i] == c2[j]) {
                i++;
                j++;
            } else if (next[j] >= 0) {
                j = next[j];
            } else {  //当next[j] == -1时 i++
                i++;
            }
        }

        return j == c2.length ? i - j : -1;
    }

    private int[] getNext(String s) {
        if (s.length() == 1) {
            return new int[]{-1};
        }
        char[] c = s.toCharArray();

        int[] next = new int[s.length()];
        next[0] = -1;
        next[1] = 0;

        int i = 2;
        int k = 0;
        while (i < next.length) {
            if (c[i - 1] == c[k]) {
//                k++;
//                next[i] = k;
//                i++;
                next[i++] = ++k;
            } else if (k > 0) {
                k = next[k];
            } else { //即k=0时
                next[i++] = 0;
            }
        }

        return next;
    }
}
