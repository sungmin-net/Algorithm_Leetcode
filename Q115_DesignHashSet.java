// https://leetcode.com/problems/design-hashset/

class MyHashSet {

    ArrayList<Integer> data = null;
    /** Initialize your data structure here. */
    public MyHashSet() {
        data = new ArrayList<Integer>();            
    }
        
    public void add(int key) {
        if (!data.contains(key)) {
            data.add(key);
        }            
    }
        
    public void remove(int key) {
        if (data.contains(key)) {
            data.remove(new Integer(key));
        }            
    }
        
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return data.contains(key);            
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */