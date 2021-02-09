// https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0 ; i < nums1.length ; i++) {
            for (int j = 0 ; j < nums2.length ; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }

        int i = 0;
        int[] ret = new int[ set.size() ];
        for (int a : set) {
            ret[ i++ ] = a;
        }
        return ret;                
    }
}