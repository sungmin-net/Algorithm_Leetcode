// https://leetcode.com/problems/prime-arrangements/

class Solution {
    public int numPrimeArrangements(int n) {
        if (n < 2) {
            return 1;
        }
        boolean[] arr = new boolean[n + 1];
        final int MOD = (int)Math.pow(10, 9) + 7;
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = true;
        }

        // sift method for searching primes
        int countPrimes = 0;
        for (int i = 2 ; i * i <= n ; i++) {
            if (arr[i * i]) {
                for (int j = i ; i * j <= n ; j++) {
                    if(arr[i * j]) {
                        arr[i * j] = false;
                    }
                }
            }
        }

        // count the number of primes
        for (int k = 2 ; k < arr.length ; ++k) {
            if (arr[ k ]) {
                countPrimes += 1;
            }
        }

        // count permutations of prime numbers
        long permutations = 1;
        for (int i = 1 ; i <= countPrimes ; i++) {
            permutations *= i;
            permutations %= MOD;
        }

        // count permutations of composite numbers
        for (int i = 1 ; i <= n - countPrimes ; i++) {
            permutations *= i;
            permutations %= MOD;
        }
        return (int)permutations;
        
    }
}