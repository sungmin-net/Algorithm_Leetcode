// https://leetcode.com/problems/longest-harmonious-subsequence/

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ret = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                ret = Math.max(ret, map.get(key) + map.get(key + 1));
            }
        }
        return ret;                
    }
}