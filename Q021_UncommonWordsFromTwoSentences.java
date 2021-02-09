// https://leetcode.com/problems/uncommon-words-from-two-sentences/

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] aArr = A.split(" ");
        String[] bArr = B.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        addStringsToMap(map, aArr);
        addStringsToMap(map, bArr);

        ArrayList<String> retList = new ArrayList<String>();
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                retList.add(s);
            }
        }

        return retList.toArray(new String[ retList.size()]);
    }
    
    public static void addStringsToMap(HashMap<String, Integer> map, String[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            if (map.containsKey(arr[i])) {
                map.replace(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
    }    
}