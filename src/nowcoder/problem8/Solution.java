package nowcoder.problem8;

public class Solution {
    public int JumpFloor(int target) {
        if(target == 1){
            return 1;
        }

        return 2*JumpFloor(target-1);

    }
}
