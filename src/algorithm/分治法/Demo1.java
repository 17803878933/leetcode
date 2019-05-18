package algorithm.分治法;

/**
 * 求解最大连续子数组问题
 * <1>使用分治求解</1>
 * <2>使用贪心算法求解</2>
 */
public class Demo1 {

    public static int maxSubSequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        return maxSubSequence(arr, 0, arr.length - 1);
    }

    private static int maxSubSequence(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }

        int mid = left + (right - left) / 2;
        int maxLeftSum = 0;
        int maxRightSum = 0;
        maxLeftSum = maxSubSequence(arr, left, mid);
        maxRightSum = maxSubSequence(arr, mid + 1, right);

        int leftMidSum = 0;
        int maxLeftMidSum = -10000000;
        for (int i = mid; i >= left; i--) {
            leftMidSum += arr[i];
            if (leftMidSum > maxLeftMidSum) {
                maxLeftMidSum = leftMidSum;
            }
        }

        int rigthMidSum = 0;
        int maxRightMidSum = -1000000;
        for (int i = mid + 1; i <= right; i++) {
            rigthMidSum += arr[i];
            if (rigthMidSum > maxRightMidSum) {
                maxRightMidSum = rigthMidSum;
            }
        }


        return Math.max(Math.max(maxLeftSum, maxLeftMidSum+maxRightMidSum), Math.max(maxRightSum, maxLeftMidSum+maxRightMidSum));
    }

    public static void main(String[] args) {
        int []arr = {1,2};
        int res = maxSubSequence(arr);
        System.out.println(res);
    }
}
