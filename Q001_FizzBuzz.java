// https://leetcode.com/problems/fizz-buzz/

import java.util.ArrayList;
import java.util.List;

class Solution {    
    public List<String> fizzBuzz(int n) {
        final String FIZZ = "Fizz";
        final String FUZZ = "Buzz";
        ArrayList ret = new ArrayList<String>();
        StringBuffer mBuf = new StringBuffer();        
        for (int i = 1 ; i <= n ; i++) {
            mBuf.setLength(0); // clear
            if (i % 3 == 0) {
                mBuf.append(FIZZ);
            }
            if (i % 5 == 0) {
                mBuf.append(FUZZ);
            }
            if (mBuf.length() == 0) {
                mBuf.append(i);
            }
            ret.add(mBuf.toString());            
        }
        return ret;
    }
}