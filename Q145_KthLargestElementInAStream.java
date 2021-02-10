// https://leetcode.com/problems/kth-largest-element-in-a-stream/

class KthLargest {

    ArrayList<Integer> data = new ArrayList<Integer>();
    int k = -1;

    public KthLargest(int k, int[] nums) {
        for (int i = 0 ; i < nums.length ; i++) {
            data.add(nums[i]);
        }
        this.k = k;        
    }
    
    public int add(int val) {
        data.add(val);
        Collections.sort(data);        
        return data.get(data.size() - k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */