// https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] arrayStones = S.toCharArray();
        String myJewels = "";
        for (int i = 0 ; i < S.length() ; i++) {
            String currentStone = String.valueOf(arrayStones[i]);
            if (J.contains(currentStone)) {
                myJewels += currentStone;
            }
        }
        return myJewels.length();
    }
}