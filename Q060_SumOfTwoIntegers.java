// https://leetcode.com/problems/sum-of-two-integers/

class Solution {
    public int getSum(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        while (b != 0) {        // 캐리가 있으면 반복
            // System.out.println("a : " + Util.to32bitBinaryString(a) + ", b : " + Util.to32bitBinaryString(b));
            int carry = a & b;  // 둘다 1인 비트 위치 => 캐리가 발생한 위치
            a = a^b;        // a 에 캐리 없는 합 저장
            b = carry << 1;     // b 에는 캐리를 한비트 밀어서 저장
        }
        return a;                
    }
}