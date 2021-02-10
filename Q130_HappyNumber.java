// https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        List<Integer> set = new ArrayList<Integer>();
        while (true) {
            while (n > 0) {
                int temp = n % 10;
                sum += temp * temp;
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
            n = sum;
            sum = 0;
        }
    }
}