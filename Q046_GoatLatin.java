// https://leetcode.com/problems/goat-latin/

class Solution {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        StringBuffer buf = new StringBuffer();
        for (int i = 0 ; i < words.length ; i++) {
            if (words[i].startsWith("a") || words[i].startsWith("A") || 
                    words[i].startsWith("e") || words[i].startsWith("E") ||
                    words[i].startsWith("i") || words[i].startsWith("I") ||
                    words[i].startsWith("o") || words[i].startsWith("O") ||
                    words[i].startsWith("u") || words[i].startsWith("U")) {
                words[i] += "ma";
            } else {
                words[i] = words[i].substring(1) + words[i].charAt(0) + "ma";

            }
            for (int j = 0 ; j < i + 1 ; j++) {
                words[i] += "a";
            }
            buf.append(words[i]);
            if (i != words.length - 1) {
                buf.append(" ");
            }
        }
        return buf.toString();
    }
}