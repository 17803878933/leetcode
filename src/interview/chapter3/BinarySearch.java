package interview.chapter3;

import java.util.Arrays;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {  //在区间[l..r]中查找target
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {  //在区间[l..mid-1]中查找target
                r = mid - 1;
            } else {                 //在区间[mid+1..r]中查找target
                l = mid + 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 6, 7, 234, 25, 2};
        Arrays.sort(arr);
        for(Integer i:arr){
            System.out.print(i+" ");
        }

        System.out.println();
        BinarySearch binarySearch = new BinarySearch();
        int i = binarySearch.binarySearch(arr, 6);
        System.out.println(i);

    }
}
