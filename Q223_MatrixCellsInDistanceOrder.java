// https://leetcode.com/problems/matrix-cells-in-distance-order/

class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        Map<Double, List<Integer[]>> map = new TreeMap<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                // double dist = Math.sqrt(Math.pow(i - r0, 2) + Math.pow(j - c0, 2));
                double dist = Math.abs(i - r0) + Math.abs(j - c0);
                Integer[] point = new Integer[2];
                point[0] = i;
                point[1] = j;
                if (map.containsKey(dist)) {
                    map.get(dist).add(point);
                } else {
                    List<Integer[]> newList = new ArrayList<>();
                    newList.add(point);
                    map.put(dist, newList);
                }
            }
        }
        List<Integer[]> out = new ArrayList<>();
        for (Double d : map.keySet()) {
            out.addAll(map.get(d));
        }
        int[][] ret = new int[out.size()][2];
        for (int i = 0; i < ret.length; i++) {
            ret[i][0] = out.get(i)[0];
            ret[i][1] = out.get(i)[1];
        }

        return ret;                
    }
}