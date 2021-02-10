// https://leetcode.com/problems/maximize-distance-to-closest-person/

class Solution {
    public int maxDistToClosest(int[] seats) {
        int len = seats.length;
        int[] dist = new int[ len ];
        for (int i = 0 ; i < len ; i++) {
            dist[i] = len - 1;
        }
        //System.out.println("s : " + Util.toString(dist));
        for (int i = 0 ; i < len ; i++) {
            if (seats[i] == 1) {
                dist[i] = 0;
                // left
                int newDist = 1;
                for (int j = i - 1 ; j >= 0 ; j--) {
                    if (newDist < dist[j]) {
                        dist[j] = newDist;
                    }
                    newDist++;
                }
                // right
                newDist = 1;
                for (int j = i + 1 ; j < len ; j++) {
                    if (newDist < dist[j]) {
                        dist[j] = newDist;
                    }
                    newDist++;
                }
            }
            //System.out.println(i + " : " + Util.toString(dist));
        }

        int max = -1;
        for (int i : dist) {
            max = Math.max(max, i);
        }
        return max;
    }
}