package problem227;

import javax.sound.midi.Soundbank;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //double d = solution.calculate("1.345+((2.945+378.8)*4.7357)-5.987");
        Solution2 solution2 = new Solution2();
        String s = "1+2*5/3+6/4*2";
        int res = solution2.calculate(s);
        System.out.println(res);

    }
}
