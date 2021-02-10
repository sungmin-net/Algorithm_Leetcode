// https://leetcode.com/problems/distance-between-bus-stops/

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockDist = 0;
        int revDist = 0;
        int n = distance.length;

        for (int i = start; i != destination; i = (i + 1) % n) {
            clockDist += distance[i];
        }

        for (int i = destination; i != start; i = (i + 1) % n) {
            revDist += distance[i];
        }

        return Math.min(clockDist, revDist);           
    }
}