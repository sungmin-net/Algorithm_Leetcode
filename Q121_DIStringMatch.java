// https://leetcode.com/problems/di-string-match/

class Solution {
    public int[] diStringMatch(String S) {
        int[] ret = new int[ S.length() + 1 ];
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0 ; i <= S.length() ; i++) {
            data.add(i);
        }
        int idx = 0;
        for (char c : S.toCharArray()) {
            if (c == 'I') {
                ret[ idx ] = data.get(0);
                data.remove(0);
            }
            if (c == 'D') {
                ret[ idx ] = data.get(data.size() - 1);
                data.remove(data.size() - 1);
            }
            idx++;
        }
        ret[ idx ] = data.get(0);

        return ret;
    }
}