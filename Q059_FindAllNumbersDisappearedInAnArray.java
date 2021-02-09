// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int n : nums) {
            set.add(n);
        }

        for (int i = 1 ; i <= nums.length ; i++) {
            if (!set.contains(i)) {
                ret.add(i);
            }
        }
        return ret;                
    }
}