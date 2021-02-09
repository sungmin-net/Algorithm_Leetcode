// https://leetcode.com/problems/lemonade-change/

class Solution {
    public boolean lemonadeChange(int[] bills) {
        final int LEMONADE_PRICE = 5;
        ArrayList<Integer> pocket = new ArrayList<Integer>();
        boolean ret = true;
        for (int b : bills) {
            boolean isOk = false;
            pocket.add(new Integer(b));
            Collections.sort(pocket);

            int change = b - LEMONADE_PRICE;
            for (int i = pocket.size() - 1 ; i >= 0 ; i--) {
                if (pocket.get(i) <= change) {
                    change -= pocket.get(i);
                    pocket.remove(i);
                }
                if (change == 0) {
                    isOk = true;
                    break;
                }
            }
            if (!isOk) {
                ret = false;
            }
        }
        return ret;        
    }
}