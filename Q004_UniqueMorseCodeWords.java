// https://leetcode.com/problems/unique-morse-code-words/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        ArrayList<String> uniqueMorseCodes = new ArrayList<String>();
        for (String word : words) {
            String morseCodedWord = toMorseCode(word);
            if (uniqueMorseCodes.contains(morseCodedWord)) {
                continue;
            }
            uniqueMorseCodes.add(morseCodedWord);
        }
        return uniqueMorseCodes.size();        
    }
    
    private static String toMorseCode(String in) {
        if (in == null || in.equals("")) {
            return null;
        }
        char[] charArray = in.toCharArray();
        String morseCodedStr = new String();
        HashMap<Character, String> morseCodeMap = new HashMap<Character, String>();
        morseCodeMap.put('a', ".-");
        morseCodeMap.put('b', "-...");
        morseCodeMap.put('c', "-.-.");
        morseCodeMap.put('d', "-..");
        morseCodeMap.put('e', ".");
        morseCodeMap.put('f', "..-.");
        morseCodeMap.put('g', "--.");
        morseCodeMap.put('h', "....");
        morseCodeMap.put('i', "..");
        morseCodeMap.put('j', ".---");
        morseCodeMap.put('k', "-.-");
        morseCodeMap.put('l', ".-..");
        morseCodeMap.put('m', "--");
        morseCodeMap.put('n', "-.");
        morseCodeMap.put('o', "---");
        morseCodeMap.put('p', ".--.");
        morseCodeMap.put('q', "--.-");
        morseCodeMap.put('r', ".-.");
        morseCodeMap.put('s', "...");
        morseCodeMap.put('t', "-");
        morseCodeMap.put('u', "..-");
        morseCodeMap.put('v', "...-");
        morseCodeMap.put('w', ".--");
        morseCodeMap.put('x', "-..-");
        morseCodeMap.put('y', "-.--");
        morseCodeMap.put('z', "--..");

        for (int i = 0 ; i < charArray.length ; i++) {
            morseCodedStr += morseCodeMap.get(charArray[i]);
        }

        return morseCodedStr;
    }    
}