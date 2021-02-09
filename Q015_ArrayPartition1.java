// https://leetcode.com/problems/array-partition-i/

class Solution {
    public int arrayPairSum(int[] nums) {
        // 1. arrange nums using merge sort
        int[] buf = new int[ nums.length ];
        int start = 0;
        int end = nums.length - 1;
        mergeSort(nums, buf, start, end);

        // 2. sum of odd index values
        int sum = 0;
        for (int i = 0 ; i < nums.length ; i += 2) {
            sum += nums[i];
        }        
        return sum;
    }
    
    private static void mergeSort(int[] nums, int[] buf, int start, int end) {
        int mid = 0;
        if (start < end) {
            mid = (start + end) / 2;
            mergeSort(nums, buf, start, mid);
            mergeSort(nums, buf, mid + 1, end);
            mergeSortInternal(nums, buf, start, mid, end);
        }
    }
    
    private static void mergeSortInternal(int nums[], int[] buf, int start, int mid, int end) {
        int i = 0;
        int j = 0;
        int k = 0;
        int t = 0;
        i = start;
        j = mid + 1;
        k = start;
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                buf[k] = nums[i];
                i++;
            } else {
                buf[k] = nums[j];
                j++;
            }
            k++;
        }

        if (i > mid) {
            for (t = j; t <= end ; t++, k++) {
                buf[k] = nums[t];
            }
        } else {
            for (t = i ; t <= mid ; t++, k++) {
                buf[k] = nums[t];
            }
        }
        for (t = start ; t <= end ; t++) {
            nums[t] = buf[t];
        }
    }    
}