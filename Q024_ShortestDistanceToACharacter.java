// https://leetcode.com/problems/shortest-distance-to-a-character/

class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] ret = new int[ S.length() ];
        char[] ch = S.toCharArray();
        ArrayList<Integer> bases = new ArrayList<Integer>();
        for (int i = 0 ; i < ch.length ; i++) {
            if (ch[i] == C) {
                bases.add(i);
            }
        }
//        System.out.println("Bases : " + bases);

        for (int i = 0 ; i < ch.length ; i++) {
            if (ch[ i ] == C) {
                ret[ i ] = 0;
            } else {
//                System.out.println("i : " + i + ", base : " + getClosestBase(bases, i));
                ret[i] = Math.abs(i - getClosestBase(bases, i));
            }
        }

        return ret;
        
    }
    public static int getClosestBase(ArrayList<Integer> bases, int idx) {
        int minDistance = Integer.MAX_VALUE;
        int closestBase = Integer.MAX_VALUE;
        for (int j : bases) {
            if (Math.abs(j - idx) < minDistance) {
                minDistance = Math.abs(j - idx);
                closestBase = j;
            }
        }
        return closestBase;
    }
}