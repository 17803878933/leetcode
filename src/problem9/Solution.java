package problem9;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }

        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x = x / 10;
        }

        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                return false;
            }
        }

        return true;

    }
}