// https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {
        // �ѱ��ڸ� ������ true
        if (word.length() < 2) {
            return true;
        }
        boolean isFirstCapital = Character.isUpperCase(word.charAt(0));
        boolean isSecondCapital = Character.isUpperCase(word.charAt(1));
        // ù���ڰ� �ҹ����ε� �ι�°�� �빮���϶� false
        if (!isFirstCapital && isSecondCapital) {
            return false;
        }

        for (int i = 2 ; i < word.length() ; i++) {
            // ù ���ڰ� �빮�ڰ� �ڹ�°�� �ҹ����ε� �ڿ� �빮�ڰ� ���ö� false;
            if (isFirstCapital && !isSecondCapital && Character.isUpperCase(word.charAt(i))) {
                return false;
            }
            // ù ���ڰ� �빮���̰� �ι�°�� �빮���ε� �ڿ� �ҹ��ڰ� ���� �� false
            if (isFirstCapital && isSecondCapital && Character.isLowerCase(word.charAt(i))) {
                return false;
            }
            // ù ���ڰ� �ҹ����̰�, �ι�°�� �ҹ����ε� �ڿ� �빮�� ���� �� false
            if (!isFirstCapital && !isSecondCapital && Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}