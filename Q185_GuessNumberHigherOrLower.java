// https://leetcode.com/problems/guess-number-higher-or-lower/

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if (guess(n) == 0) {
            return n;
        }        
        int low = 1;
        int high = n;
        int j = 0;
        while (high > low) {
            n = low + ((high - low) / 2);
            j = guess(n);
            if (j == 0) {
                return n;
            } else if (j == -1) {
                high = n;
            } else {    // j == 1
                low = n;                
            }
        }
        return 0;                
    }
}