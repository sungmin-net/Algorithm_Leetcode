// https://leetcode.com/problems/keyboard-row/

class Solution {
    public String[] findWords(String[] words) {
        final String FIRST_ROW = "QqWwEeRrTtYyUuIiOoPp";
        final String SECOND_ROW = "AaSsDdFfGgHhJjKkLl";
        final String THIRD_ROW = "ZzXxCcVvBbNnMm";
        ArrayList<String> ret = new ArrayList<String>();
        for (String word : words) {
            if (isAllOnRow(word, FIRST_ROW) || isAllOnRow(word, SECOND_ROW)
                    || isAllOnRow(word, THIRD_ROW)) {
                ret.add(word);
            }
        }
        return ret.toArray(new String[ ret.size() ]);        
    }
    private static boolean isAllOnRow(String target, String board) {
        char[] arr = target.toCharArray();
        boolean isAllMatched = true;
        for (char c : arr) {
            if (!board.contains(String.valueOf(c))) {
                isAllMatched = false;
                break;
            }
        }
        return isAllMatched;
    }
}