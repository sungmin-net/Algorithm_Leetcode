// https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
        StringBuffer buf = new StringBuffer();
        String[] words = s.split(" ");
//        System.out.println(Util.toString(words));
        for (int i = 0 ; i < words.length - 1 ; i++) {
            buf.append(reverseString(words[i])).append(" ");
        }
        buf.append(reverseString(words[ words.length - 1]));

        return buf.toString();        
    }
 
    public static String reverseString(String str) {
        char[] arrayStr = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            char temp = arrayStr[i];
            arrayStr[i] = arrayStr[str.length() - i - 1];
            arrayStr[str.length() - i - 1] = temp;
        }
        return String.copyValueOf(arrayStr);
    }
}