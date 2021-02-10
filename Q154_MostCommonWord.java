// https://leetcode.com/problems/most-common-word/

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        StringBuffer buf = new StringBuffer();
        ArrayList<String> words = new ArrayList<String>();
        for (char c : paragraph.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                buf.append(c);
            } else {
                if (buf.length() != 0) {
                    String word = buf.toString().toLowerCase();
                    words.add(word.toLowerCase());
                    buf.setLength(0);
                }
            }
        }
        if (buf.length() != 0) {
            words.add(buf.toString().toLowerCase());
        }


        if (banned.length != 0) {
            ArrayList<String> filtered = new ArrayList<String>();
            for (String w : words) {
                boolean isBanned = false;
                for (String b : banned) {
                    if (w.equals(b)) {
                        isBanned = true;
                    }
                }
                if (!isBanned) {
                    filtered.add(w.toLowerCase());
                }
            }
            words = filtered;
        }

        for (String s : words) {
            if (map.containsKey(s)) {
                map.replace(s, map.get(s)+ 1);
            } else {
                map.put(s, 1);
            }
        }

        int count = 0;
        String ret = "";
        for (String key : map.keySet()) {
            int curCount = map.get(key);
            if (curCount > count) {
                ret = key;
                count = curCount;
            }
        }
        return ret;
    }
}