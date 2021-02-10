// https://leetcode.com/problems/duplicate-zeros/

class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> al = new ArrayList<>();
        for (int i : arr) {
            if (i != 0) {
                al.add(i);
            } else {
                al.add(0);
                al.add(0);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = al.get(i);
        }                
    }
}