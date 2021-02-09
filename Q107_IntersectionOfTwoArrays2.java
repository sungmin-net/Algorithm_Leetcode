// https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int idx1 = 0;
        int idx2 = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();

        while (idx1 < nums1.length && idx2 < nums2.length) {
            if (nums1[idx1] == nums2[idx2]) {
                al.add(nums1[idx1]);
                idx1++;
                idx2++;
                continue;
            }
            if (nums1[idx1] > nums2[idx2]) {
                idx2++;
            } else {
                idx1++;
            }
        }

        int[] ret = new int[ al.size() ];
        for (int i = 0 ; i < al.size() ; i++) {
            ret[i] = al.get(i);
        }

        return ret;
    }
}