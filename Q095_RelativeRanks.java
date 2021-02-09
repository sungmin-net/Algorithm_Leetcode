// https://leetcode.com/problems/relative-ranks/

class Solution {
    public String[] findRelativeRanks(int[] nums) {
        HashMap<Integer, Integer> numRankMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            int rank = 1;
            for (int j : numRankMap.keySet()) {
                if (j > num) {
                    rank++;
                }
            }
           numRankMap.put(num, rank);
           for (int j : numRankMap.keySet()) {
               if (j < num) {
                   numRankMap.replace(j, numRankMap.get(j) + 1);
               }
           }
        }
        System.out.println(numRankMap);
        String[] ret = new String[ nums.length ];
        for (int i = 0 ; i < nums.length ; i++) {
            ret[ i ] = numRankMap.get(nums[ i ]) + "";
            if (numRankMap.get(nums[ i ]) == 1) {
                ret[ i ] = "Gold Medal";
            }
            if (numRankMap.get(nums[ i ]) == 2) {
                ret[ i ] = "Silver Medal";
            }
            if (numRankMap.get(nums[ i ]) == 3) {
                ret[ i ] = "Bronze Medal";
            }
        }

        return ret;                
    }
}