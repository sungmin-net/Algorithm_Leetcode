// https://leetcode.com/problems/two-city-scheduling/

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> {
            return (a[1] - a[0]) - (b[1] - b[0]);
        });
        
        int totalCost = 0;
        int len = costs.length;
        int mid = len / 2;

        for (int i = 0; i < len; i++) {
            if (i < mid) {
                totalCost += costs[i][1];
            } else {
                totalCost += costs[i][0];
            }
        }

        return totalCost;        
        
    }
}