// https://leetcode.com/problems/next-greater-element-i/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        int[] ret = new int[ nums1.length ];
        int retIdx = 0;
        for (int num : nums1) {
            // find index of nums2
            int numIdx = -1;
            for (int j = 0 ; j < nums2.length ; j++) {
                if (nums2[j] == num) {
                    numIdx = j;
                    break;
                }
            }
            // find next greater num in nums2
            boolean isFound = false;
            for (int j = numIdx ; j < nums2.length ; j++) {
                if (nums2[j] > num) {
                    isFound = true;
                    ret[ retIdx++ ] = nums2[j];
                    break;
                }
            }
            if (!isFound) {
                ret[ retIdx++ ] = -1;
            }
        }
        return ret;                
    }
}