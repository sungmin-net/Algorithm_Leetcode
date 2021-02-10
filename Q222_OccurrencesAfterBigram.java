// https://leetcode.com/problems/occurrences-after-bigram/

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> ret = new ArrayList<>();
        for (int i = 2; i < words.length; i++) {
            if (words[i - 2].equals(first) && words[i - 1].equals(second)) {
                ret.add(words[i]);
            }
        }
        return ret.toArray(new String[ret.size()]);        
    }
}