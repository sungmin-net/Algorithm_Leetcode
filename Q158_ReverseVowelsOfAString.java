// https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int start = 0;
        int end = s.length() - 1;
        char[] str = s.toCharArray();
        while (start < end) {
            while (!set.contains(str[start]) && start < s.length() - 1) {
                start++;
            }
            while (!set.contains(str[end]) && end > 0) {
                end--;
            }
            if (start < end) {
                str[ start ] ^= str[ end ];
                str[ end ] ^= str[ start ];
                str[ start ] ^= str[ end ];
            }
            start++;
            end--;
        }
        return new String(str);
    }
}