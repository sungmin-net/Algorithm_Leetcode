// https://leetcode.com/problems/degree-of-an-array/

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.replace(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        int maxFrequency = 0;
        ArrayList<Integer> maxFrequencyValues = new ArrayList<Integer>();
        for (int n : map.keySet()) {
            if (maxFrequency < map.get(n)) {
                maxFrequency = map.get(n);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) == maxFrequency) {
                maxFrequencyValues.add(n);
            }
        }
        int minLength = Integer.MAX_VALUE;
        for (int i : maxFrequencyValues) {
            int start = 0;
            int end = nums.length - 1;
            while (nums[ start ] != i || nums[ end ] != i) {
                if (nums[ start ] != i) {
                    start++;
                }
                if (nums[ end ] != i) {
                    end--;
                }
            }
            minLength = Math.min(minLength, end - start + 1);
        }
        return minLength;                
    }
}