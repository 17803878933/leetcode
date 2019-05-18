package algorithm.kmp;

public class KmpTest {
    private int findSubString(String str1, String str2) {
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        int[] next = getNext(str2);
        int i1 = 0, i2 = 0;
        while (i1 < a1.length && i2 < a2.length) {
            if (a1[i1] == a2[i2]) {
                i1++;
                i2++;
            } else if (next[i2] == -1) {
                i1++;
            } else {
                i2 = next[i2];
            }
        }

        return i2 == a2.length ? i1 - i2 : -1;
    }

    private int[] getNext(String str2) {
        if (str2.length() == 1) {
            return new int[]{-1};
        }
        //标记
        int k = 0;
        int[] next = new int[str2.length()];
        next[0] = -1;
        next[1] = 0;
        char[] c = str2.toCharArray();
        int i = 2;
        while (i < c.length) {
            if (c[i] == c[k]) {       //相等
                next[i++] = ++k;
            } else if (k > 0) {        //继续向前找
                k = next[k];
            } else {
                next[i++] = 0;
            }
        }
        return next;
    }



    public static void main(String[] args) {
        KmpTest kmpTest = new KmpTest();
        String s = "ababcababtk";
        String s2 = "abt";
        int[] next = kmpTest.getNext(s);

        System.out.println(kmpTest.findSubString(s,s2));
    }
}
