// https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {
        // 한글자면 무조건 true
        if (word.length() < 2) {
            return true;
        }
        boolean isFirstCapital = Character.isUpperCase(word.charAt(0));
        boolean isSecondCapital = Character.isUpperCase(word.charAt(1));
        // 첫글자가 소문자인데 두번째가 대문자일때 false
        if (!isFirstCapital && isSecondCapital) {
            return false;
        }

        for (int i = 2 ; i < word.length() ; i++) {
            // 첫 글자가 대문자고 뒤번째가 소문자인데 뒤에 대문자가 나올때 false;
            if (isFirstCapital && !isSecondCapital && Character.isUpperCase(word.charAt(i))) {
                return false;
            }
            // 첫 글자가 대문자이고 두번째가 대문자인데 뒤에 소문자가 나올 때 false
            if (isFirstCapital && isSecondCapital && Character.isLowerCase(word.charAt(i))) {
                return false;
            }
            // 첫 글자가 소문자이고, 두번째가 소문자인데 뒤에 대문자 나올 때 false
            if (!isFirstCapital && !isSecondCapital && Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}