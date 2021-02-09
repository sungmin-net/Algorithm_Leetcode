// https://leetcode.com/problems/robot-return-to-origin/

class Solution {
    public boolean judgeCircle(String moves) {
        if (moves == null || moves.equals("")){
            return true;
        }
        char[] moveArr = moves.toCharArray();
        int currentX = 0;
        int currentY = 0;
        for (int i = 0 ; i < moves.length() ; i++) {
            switch (moveArr[i]) {
            case 'U':
                ++currentY;
                break;
            case 'D':
                --currentY;
                break;
            case 'R':
                ++currentX;
                break;
            case 'L':
                --currentX;
                break;
            default:
                // can I ignore other characters?
                break;
            }
        }
        return (currentX == 0 && currentY == 0);
    }
}