// https://leetcode.com/problems/shortest-completing-word/

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        ArrayList<Character> chars = new ArrayList<Character>();
        int minLength = Integer.MAX_VALUE;
        String minWord = null;
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                chars.add(Character.toLowerCase(c));
            }
        }
        for (String word : words) {
            ArrayList<Character> charsCopy = new ArrayList<Character>(chars);
            for (char c : word.toCharArray()) {
                if (charsCopy.contains(c)) {
                    charsCopy.remove(new Character(c));
                }
            }
            if (charsCopy.size() == 0 && word.length() < minLength) {
                minLength = word.length();
                minWord = word;
            }
        }
        return minWord;                
    }
}