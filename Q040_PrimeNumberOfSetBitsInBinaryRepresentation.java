// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/

class Solution {
    public int countPrimeSetBits(int L, int R) {
        int primeCount = 0;
        for (int i = L ; i <= R ; i++) {
//            System.out.println(i + ", " + Integer.bitCount(i));
            if (isPrime(Integer.bitCount(i))) {
                primeCount++;
            }
        }

        return primeCount;    
    }
    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3 ; i * i <= n ; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }    
}