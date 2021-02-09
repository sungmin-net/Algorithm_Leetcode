// https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        boolean is5Minus = false;
        boolean is10Minus = false;
        boolean is50Minus = false;
        boolean is100Minus = false;
        boolean is500Minus = false;
        boolean is1000Minus = false;
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    if (is10Minus || is5Minus) {
                        sum -= 1;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    is5Minus = true;
                    if (is10Minus || is50Minus) {
                        sum -= 5;
                    } else {
                        sum += 5;
                    }
                    break;
                case 'X':
                    is10Minus = true;
                    if (is100Minus || is50Minus) {
                        sum -= 10;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    is50Minus = true;
                    if (is100Minus || is500Minus) {
                        sum -= 50;
                    } else {
                        sum += 50;
                    }
                    break;
                case 'C':
                    is100Minus = true;
                    if (is1000Minus || is500Minus) {
                        sum -= 100;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    is500Minus = true;
                    if (is1000Minus) {
                        sum -= 500;
                    } else {
                        sum += 500;
                    }
                    break;
                case 'M' :
                    is1000Minus = true;
                    sum += 1000;
                    break;
            } // end of switch
        } // end of for
        return sum;
    }
}