// https://leetcode.com/problems/distribute-candies-to-people/

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ret = new int[num_people];
        int i = 0;
        int candy = 0;
        while (candies != 0) {
            // System.out.println(i + " : " + candy);
            candy++;
            if (candy > candies) {
                candy = candies;
                candies = 0;
            } else {
                candies -= candy;
            }
            ret[i % num_people] += candy;
            ++i;
        }
        return ret;
    }
}