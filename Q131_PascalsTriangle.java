// https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        for (int i = 0 ; i < numRows ; i++) {
            ret.add(new ArrayList<Integer>());
            for (int j = 0 ; j <= i ; j++) {
                ret.get(i).add(1);
            }
        }

        for (int i = 2 ; i < numRows ; i++) {
            for (int j = 1 ; j < i ; j++) {
                ret.get(i).set(j, ret.get(i-1).get(j-1) + ret.get(i-1).get(j));
            }
        }

        return ret;                
    }
}