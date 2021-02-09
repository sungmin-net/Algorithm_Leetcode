// https://leetcode.com/submissions/detail/174417087/

class Solution {
    public int binaryGap(int N) {
        ArrayList<Integer> onesIndexes = new ArrayList<Integer>();
        for (int i = 0 ; i < 32 ; i++) {
            if (((1 << i) & N) > 0 ) {
                onesIndexes.add(i);
            }
        }
        if (onesIndexes.size() == 0 || onesIndexes.size() == 1) {
            return 0;
        }
        int maxDistance = 0;
        for (int i = 0 ; i < onesIndexes.size() - 1 ; i++) {
            maxDistance = Math.max(maxDistance, onesIndexes.get(i + 1) - onesIndexes.get(i));
        }

        return maxDistance;                
    }
}