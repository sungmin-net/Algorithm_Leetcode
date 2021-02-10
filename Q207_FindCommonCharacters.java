// https://leetcode.com/problems/find-common-characters/

class Solution {
    public List<String> commonChars(String[] A) {
        List<String> ret = new ArrayList<>();
        for (char c : A[0].toCharArray()) {
            String s = String.valueOf(c);
            boolean isAllin = true;
            for (int i = 1 ; i < A.length ; i++) {
                if (!A[i].contains(s)) {
                    isAllin = false;
                    break;
                }
                A[i] = A[i].substring(0, A[i].indexOf(s)) 
                        + A[i].substring(A[i].indexOf(s) + 1);
            }
            if (isAllin) {
                ret.add(s);
            }
        }
        return ret;
    }
}