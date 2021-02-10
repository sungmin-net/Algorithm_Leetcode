// https://leetcode.com/problems/minimum-absolute-difference/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0 ; i < arr.length - 1 ; i++) {
            int curDiff = Math.abs(arr[i + 1] - arr[i]);
            if (minDiff > curDiff) {
                minDiff = curDiff;
                ret = new ArrayList<>();
                List<Integer> curPair = new ArrayList<>();
                curPair.add(arr[i]);
                curPair.add(arr[i + 1]);
                ret.add(curPair);
            } else if (minDiff == curDiff) {
                List<Integer> curPair = new ArrayList<>();
                curPair.add(arr[i]);
                curPair.add(arr[i + 1]);
                ret.add(curPair);
            }
        }
        return ret;        
    }
}