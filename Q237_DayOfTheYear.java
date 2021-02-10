// https://leetcode.com/problems/day-of-the-year/

class Solution {
    public int dayOfYear(String date) {
        int day = Integer.valueOf(date.split("-")[2]);
        final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int mon = Integer.valueOf(date.split("-")[1]);
        for (int i = 1 ; i < mon ; i++) {
            day += DAYS[i - 1];
        }

        int year = Integer.valueOf(date.split("-")[0]);
        if (year > 1900 && year % 4 == 0 && mon > 2) {
            day++;
        }
        return day;                
    }
}