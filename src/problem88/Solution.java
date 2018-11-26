package problem88;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexNums1 = 0;
        int indexNums2 = 0;
        while (indexNums1 < m && indexNums2 < n) {
            if (nums1[indexNums1] > nums2[indexNums2]) {
                for (int i = m; i > indexNums1; i--) {
                    nums1[i] = nums1[i-1];
                }
                nums1[indexNums1++] = nums2[indexNums2++];
                m = m + 1;
            } else {
                indexNums1++;
            }
        }

        if (indexNums1 == m) {
            while (indexNums2 < n) {
                nums1[indexNums1++] = nums2[indexNums2++];
            }
        }
    }

    public int[] merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int indexNums1 = 0;
        int indexNums2 = 0;
        int indexTemp = 0;
        while (indexNums1 < m && indexNums2 < n) {
            if (nums1[indexNums1] <= nums2[indexNums2]) {
                temp[indexTemp++] = nums1[indexNums1++];
            } else {
                temp[indexTemp++] = nums2[indexNums2++];
            }
        }

        if (indexNums1 == m) {
            while (indexNums2 < n) {
                temp[indexTemp++] = nums2[indexNums2++];
            }
        } else {
            while (indexNums1 < m) {
                temp[indexTemp++] = nums2[indexNums1++];
            }
        }

        return temp;
    }
}