
public class Quee {
    int n = 10;
    int[] q = new int[n];

    public boolean place(int i, int j) {
        if (i == 1) return true;
        int k = 1;
        while (k < i) {
            if (q[k] == j || Math.abs(q[k] - j) == Math.abs(i - k)) {
                return false;
            }
            k++;
        }

        return true;
    }

    public void queen(int i, int n) {
        if (i > n) {
        } else {
            for (int j = 1; j <= n; j++) {
                if (place(i, j)) {
                    q[i] = j;
                    queen(i + 1, n);
                }
            }
        }

    }

}
