// https://leetcode.com/problems/delete-columns-to-make-sorted/

class Solution {
    public int minDeletionSize(String[] A) {
        int ret = 0;
        for (int i = 0 ; i < A[0].length() ; i++) {
            char run = 0;
            for (int j = 0 ; j < A.length ; j++) {
                if (run <= A[j].charAt(i)) {
                    run = A[j].charAt(i);
                } else {
//                    System.out.println("unsorted index : " + i);
                    ret++;
                    break;
                }
            }
        }
        return ret;                
    }
}