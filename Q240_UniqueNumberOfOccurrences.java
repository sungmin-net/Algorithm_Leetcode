// https://leetcode.com/problems/unique-number-of-occurrences/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        List<Integer> counts = new ArrayList<>();
        for (int i : map.keySet()) {
            if (counts.contains(map.get(i))) {
                return false;
            }
            counts.add(map.get(i));
        }
        return true;
    }
}