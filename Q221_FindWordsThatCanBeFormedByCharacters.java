// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

class Solution {
    public int countCharacters(String[] words, String chars) {
        List<Character> data = new ArrayList<>();
        for (char c : chars.toCharArray()) {
            data.add(c);
        }
        int sol = 0;

        for (String s : words) {
            List<Character> curData = new ArrayList<>();
            for (char c : data) {
                curData.add(c);
            }

            boolean isAllIn = true;
            for (char c : s.toCharArray()) {
                if (curData.contains(c)) {
                    curData.remove(new Character(c));
                } else {
                    isAllIn = false;
                    break;
                }
            }
            if (isAllIn) {
                sol += s.length();
            }
        }
        return sol;                
    }
}