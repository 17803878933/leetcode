package problem860;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] m = {0, 0};
        for(int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                m[0]++;
            } else if (bills[i] == 10) {
                if (m[0] < 1) {
                    System.out.println(m[0]+"++++++"+m[1]);
                    return false;
                } else {
                    m[0] -= 1;
                    m[1] += 1;
                }

            } else {
                if((m[0] < 1 || m[1] < 1) && m[0] < 3){
                    System.out.println(m[0]+"++++++"+m[1]);
                    return false;
                }
                if(m[1] >=1){
                        m[0] -= 1;
                        m[1] -= 1;
                }else {
                    m[0] -= 3;
                }
            }
        }

        return true;
    }
}