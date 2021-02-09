// https://leetcode.com/problems/self-dividing-numbers/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = left ; i <= right ; i++) {
            if (isSelfDiv(i)) {
                ret.add(i);                                
            }            
        }
        return ret;
    }
                
    private boolean isSelfDiv(int i) {
        String s = String.valueOf(i);        
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int j = Integer.valueOf(String.valueOf(c));            
            
            if (j == 0) {
                return false;
            }
            if ( i % j != 0) {
                return false;
            }
        }
        return true;
    }
}