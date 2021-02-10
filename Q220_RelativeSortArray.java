// https://leetcode.com/problems/relative-sort-array/

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
    	List<Integer> out = new ArrayList<Integer>();
    	List<Integer> rest = new ArrayList<Integer>();
    	
    	for (int i : arr2) {
    		for (int j = 0 ; j < arr1.length ; j++) {
    			if (i == arr1[j]) {
    				out.add(arr1[j]);
    			}
    		}
    	}
    	
    	for (int i : arr1) {
    		if (!out.contains(i)) {
    			rest.add(i);
    		}
    	}
    	
    	Collections.sort(rest);
    	out.addAll(rest);
    	
    	int[] ret = new int[out.size()];
    	for (int i = 0 ; i < out.size() ; i++) {
    		ret[i] = out.get(i);
    	}
    	return ret;
    }
}