// https://leetcode.com/problems/pascals-triangle-ii/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> top = new ArrayList<Integer>();
        top.add(1);
        data.add(top);
        for (int i = 1 ; i <= rowIndex ; i++) {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for (int j = 1 ; j < i ; j++) {
                cur.add(data.get(i - 1).get(j - 1) + data.get(i - 1).get((j)));
            }
            cur.add(1);
            data.add(cur);
        }
        return data.get(rowIndex);                
    }
}