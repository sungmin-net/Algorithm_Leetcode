// https://leetcode.com/problems/sum-of-two-integers/

class Solution {
    public int getSum(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        while (b != 0) {        // ĳ���� ������ �ݺ�
            // System.out.println("a : " + Util.to32bitBinaryString(a) + ", b : " + Util.to32bitBinaryString(b));
            int carry = a & b;  // �Ѵ� 1�� ��Ʈ ��ġ => ĳ���� �߻��� ��ġ
            a = a^b;        // a �� ĳ�� ���� �� ����
            b = carry << 1;     // b ���� ĳ���� �Ѻ�Ʈ �о ����
        }
        return a;                
    }
}