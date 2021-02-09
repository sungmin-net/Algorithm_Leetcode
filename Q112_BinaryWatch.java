// https://leetcode.com/problems/binary-watch/

class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> ret = new ArrayList<String>();
        for (int h = 0 ; h < 12 ; h++) {
            for (int m = 0 ; m < 60 ; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
                    StringBuffer buf = new StringBuffer();
                    buf.append(h).append(":");
                    if (m < 10) {
                        buf.append("0");
                    }
                    buf.append(m);
                    ret.add(buf.toString());
                }
            }
        }
        return ret;                
    }
}