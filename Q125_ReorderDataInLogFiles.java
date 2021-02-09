// https://leetcode.com/problems/reorder-data-in-log-files/

class Solution {
    public String[] reorderLogFiles(String[] logs) {

        ArrayList<String> ret = new ArrayList<String>();
        /// group
        ArrayList<String> letterLogList = new ArrayList<String>();
        ArrayList<String> digitLogList = new ArrayList<String>();
        for(String s : logs) {
            if (isLetterLog(s)) {
                letterLogList.add(s);
            } else {
                digitLogList.add(s);
            }
        }
        // sort letterlog
        String[] letterLogs = letterLogList.toArray(new String[ letterLogList.size() ] );
        for (int i = 0 ; i < letterLogs.length - 1 ; i++) {
            for (int j = 0 ; j < letterLogs.length - i - 1; j++) {
                if (!areOrdered(letterLogs[j], letterLogs[j + 1])) {
                    // swap
                    String temp = letterLogs[j];
                    letterLogs[j] = letterLogs[j + 1];
                    letterLogs[j + 1] = temp;
                }
            }
        }
        // merge
        for (String s : letterLogs) {
            ret.add(s);
        }
        for (String s : digitLogList) {
            ret.add(s);
        }
        return ret.toArray(new String[ret.size()]);
    }

    private static boolean areOrdered(String a, String b) {
        // ignore identifier
        String _a = a.substring(a.indexOf(" "));
        String _b = b.substring(b.indexOf(" "));
        for (int i = 0 ; i < _a.length() ; i++) {
            if (_a.charAt(i) < _b.charAt(i)) {
                return true;
            } else if (_a.charAt(i) == _b.charAt(i)) {
                continue;
            } else {
                return false;
            }
        }
        return false;
    }

    private static boolean isLetterLog(String s) {
        String[] tokens = s.split(" ");
        for (int i = 1 ; i < tokens.length ; i++) {
            for (char c : tokens[i].toCharArray()) {
                if (Character.isDigit(c)) {
                    return false;
                }
            }
        }
        return true;
    }
}