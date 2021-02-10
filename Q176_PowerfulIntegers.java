// https://leetcode.com/problems/powerful-integers/

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        if (x < 2 && y < 2) {
            if (x == 0 && y == 0) {
                set.add(0);
            } else if (x == 1 && y == 1) {
                if (bound >= 2) {
                    set.add(2); // 1 + 1                    
                }                
            } else {
                if (bound >= 1) {
                    set.add(1); // 0 + 1                    
                }
            }
        } else if (x < 2 || y < 2) {
            int big = 0;
            int small = 0;
            int pow = 0;
            int bigPow = 1;
            int sum = 0;
            if (x > y) {
                big = x;
                small = y;
            } else {
                small = x;
                big = y;
            }
            while ((sum = bigPow + small) <= bound) {
                set.add(sum);
                pow++;
                bigPow = (int)Math.pow(big, pow);
            }
        } else {
            int xi = 0;
            int yi = 0;
            int xPow = 1;
            int sum = 0;
            while ((xPow = (int)Math.pow(x,xi)) < bound) {
                while ((sum = xPow + (int)Math.pow(y, yi)) <= bound) {
                    set.add(sum);
                    yi++;
                }
                yi = 0;
                xi++;
            }
        }

        List<Integer> ret = new ArrayList<>();
        for (int i : set) {
            ret.add(i);
        }

        Collections.sort(ret);
        return ret;
    }
}