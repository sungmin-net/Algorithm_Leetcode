// https://leetcode.com/problems/long-pressed-name/

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int nameIdx = 0;
        for (char t : typed.toCharArray()) {
            if (t == name.charAt(nameIdx)) {
                nameIdx++;
                if (nameIdx == name.length()) {
                    return true;
                }
                continue;
            } else if (nameIdx - 1 >= 0 && t == name.charAt(nameIdx - 1)) {
                continue;
            } else {
                return false;
            }
        }
        return false;
    }
}