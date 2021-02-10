// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

class Solution {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : A) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
                if (map.get(i) == A.length / 2) {
                    return i;
                }
            } else {
                map.put(i, 1);
            }
        }
        return 0;                
    }
}