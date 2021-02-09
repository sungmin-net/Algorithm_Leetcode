// https://leetcode.com/problems/largest-triangle-area/

class Solution {
    public double largestTriangleArea(int[][] points) {
        // make points as objects to easy understanding
        ArrayList<MyPoint> pAl = new ArrayList<MyPoint>();
        for (int[] p : points) {
            pAl.add(new MyPoint(p[0], p[1]));
        }
        // System.out.println("points : " + pAl.size() + ", " + Util.pointsToString(pAl));

        double maxArea = 0;

        for (MyPoint p1 : pAl) {
            for (MyPoint p2 : pAl) {
                if (p1.equals(p2)) {
                    continue;
                }
                for (MyPoint p3 : pAl) {
                    if (p2.equals(p3)) {
                        continue;
                    }
                    double curArea = getTriangleArea(p1, p2, p3);
                    maxArea = Math.max(maxArea, curArea);
                }
            }

        }
        return maxArea;
    }

    private static double getTriangleArea(MyPoint p1, MyPoint p2, MyPoint p3) {
        return Math.abs(
                ( p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y) )
                ) / 2.0;
    }

    public static class MyPoint {
        int x;
        int y;
        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "[" + x + "," + y + "]";
        }
        public boolean equals(MyPoint t){
            return this.x == t.x && this.y == t.y;
        }
    }
}