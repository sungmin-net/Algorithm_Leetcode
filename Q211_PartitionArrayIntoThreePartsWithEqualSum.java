// https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/

class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        if (sum % 3 != 0) {
            return false;
        }
//        System.out.println("sum : " + sum);
        int partSum = sum / 3;
//        System.out.println("partSum : " + partSum);
        int curSum = 0;
        int part = 0;
        for (int i = 0 ; i < A.length ; i++) {
            curSum += A[i];
            if (curSum == partSum) {
                part++;
                curSum = 0;
            }
        }
//        System.out.println("part : " + part);
        return part == 3;                
    }
}