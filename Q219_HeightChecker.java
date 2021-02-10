// https://leetcode.com/problems/height-checker/

class Solution {
    public int heightChecker(int[] heights) {
    	int[] sorted = heights.clone();
    	Arrays.sort(sorted);
//    	System.out.println(Arrays.toString(heights));
//    	System.out.println(Arrays.toString(sorted));
    	int cnt = 0;
    	for (int i = 0 ; i < heights.length ; i++) {
    		if (heights[i] != sorted[i]) {
    			cnt++;
    			
    		}
    	}
    	return cnt;
    }
}