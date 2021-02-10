// https://leetcode.com/problems/find-the-town-judge/

class Solution {
    public int findJudge(int N, int[][] trust) {
        if (N == 1 && trust.length == 0) {
            return 1;
        }        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < trust.length ; i++) {
            if (map.containsKey(trust[i][0])) {
                map.replace(trust[i][0], Integer.MIN_VALUE);
            } else {
                map.put(trust[i][0], Integer.MIN_VALUE);
            }
            if (map.containsKey(trust[i][1])) {
                map.replace(trust[i][1], map.get(trust[i][1]) + 1);
            } else {
                map.put(trust[i][1], 1);
            }

        }
        for (int i : map.keySet()) {
            if (map.get(i) == N - 1) {
                return i;
            }
        }
        return -1;
    }
}