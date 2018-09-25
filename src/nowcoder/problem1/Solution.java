package nowcoder.problem1;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int[][] array) {
        return Find(target, array, array.length, array[0].length);
    }

    private boolean Find(int target, int[][] array, int rows, int cols) {
        if (rows > 0 && cols > 0) {
            int row = 0;
            int col = cols - 1;
            while (row < rows && col >= 0) {
                if (target == array[row][col]) {
                    return true;
                } else if (target < array[row][col]) {
                    col--;
                } else {
                    row++;
                }
            }
        }

        return false;
    }

}
