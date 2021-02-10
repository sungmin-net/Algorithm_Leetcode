// https://leetcode.com/problems/last-stone-weight/

class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }        
        int theLast = stones.length - 1;
        int secondLast = stones.length - 2;
        Arrays.sort(stones);
        while (stones[secondLast] != 0) {
//            System.out.println(Arrays.toString(stones));
            if (stones[theLast] == stones[secondLast]) {
                stones[theLast] = 0;
                stones[secondLast] = 0;
            } else if (stones[theLast] > stones[secondLast]) {
                stones[theLast] = stones[theLast] - stones[secondLast];
                stones[secondLast] = 0;
            } else {
                stones[secondLast] = stones[secondLast] - stones[theLast];
                stones[theLast] = 0;
            }
            Arrays.sort(stones);
        }
        return stones[theLast];                
    }
}