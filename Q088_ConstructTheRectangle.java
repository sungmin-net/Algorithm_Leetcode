// https://leetcode.com/problems/construct-the-rectangle/

class Solution {
    public int[] constructRectangle(int area) {
        int[] ret = {area, 1};
        for (int w = 1 ; w <= (int)Math.sqrt(area); w++) {
            if (area % w == 0 && (area / w) >= w) {
//                System.out.println(area/w + ", " + w);
                ret[0] = area / w;
                ret[1] = w;
            }
        }
        return ret;
    }
}