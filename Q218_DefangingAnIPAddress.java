// https://leetcode.com/problems/defanging-an-ip-address/

class Solution {
    public String defangIPaddr(String address) {
    	StringBuffer buf = new StringBuffer();
    	for (char c : address.toCharArray()) {
    		if (c == '.') {
    			buf.append("[.]");
    		} else {
    			buf.append(c);
    		}
    	}
		return buf.toString();                        
    }
}