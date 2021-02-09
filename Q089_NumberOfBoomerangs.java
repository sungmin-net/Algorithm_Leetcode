// https://leetcode.com/problems/number-of-boomerangs/

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int ret = 0;
        for (int i = 0 ; i < points.length ; i++) {
            HashMap<Double, Integer> map = new HashMap<Double, Integer>();
            for (int j = 0 ; j < points.length ; j++) {
                if (i == j) {
                    continue;
                }
                double distance = Math.sqrt(Math.pow(points[i][0] - points[j][0], 2)
                        + Math.pow(points[i][1] - points[j][1], 2));
                if (map.containsKey(distance)) {
                    map.replace(distance, map.get(distance) + 1);
                } else {
                    map.put(distance, 1);
                }
            }
            for (Double dist : map.keySet()) {
                if (map.get(dist) >= 2) {
                    ret += map.get(dist) * (map.get(dist) - 1);
                }
            }
        }
        return ret;
    }
}