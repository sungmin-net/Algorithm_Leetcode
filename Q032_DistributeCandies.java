// https://leetcode.com/problems/distribute-candies/

class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> candiKinds = new HashSet<Integer>();
        for (int i : candies) {
            candiKinds.add(i);
        }
        int maxSisterCandiCount = candies.length / 2;
        return Math.min(maxSisterCandiCount, candiKinds.size());
    }    
}