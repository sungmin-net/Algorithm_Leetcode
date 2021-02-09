// https://leetcode.com/problems/rotate-string/

class Solution {
    public boolean rotateString(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) {
            return false;
        }
        if (A.equals("") && B.equals("")) {
            return true;
        }

        ArrayList<Integer> entries = new ArrayList<Integer>();
        int compSize = A.length();
        int compCnt = 0;
        int idxA = 0;
        int idxB = 0;
        for (int i = 0 ; i < A.length() ; i++) {
            if (A.charAt(i) == B.charAt(0)) {
                entries.add(i);
            }
        }
//        System.out.println("Entries : " + entries);
        for (int e : entries) {
            idxA = e;
            idxB = 0;
            compCnt = 0;
//            System.out.println("Start A idx is " + e);
            boolean isFound = true;
            while (compCnt < compSize) {
//                System.out.println(A.charAt(idxA % compSize) + " =? " + B.charAt(idxB % compSize));
                if (A.charAt(idxA % compSize) != B.charAt(idxB % compSize)) {
                    isFound = false;
                    break;
                }
                compCnt++;
                idxA++;
                idxB++;

            }
            if (isFound) {
//                System.out.println("Found A idx is " + e);
                return true;
            }
        }
        return false;
    }
}