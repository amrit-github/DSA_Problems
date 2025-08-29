/*
Happy Number
Solved
Easy
Topics
premium lock icon
Companies
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

 

Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false
 

Constraints:

1 <= n <= 231 - 1
 */

import java.util.HashMap;
import java.util.Map;

public class Happy_Number {

    public static boolean isHappy(int n) {
        
        Map<Integer, Integer> map = new HashMap<>();

        while(!map.containsKey(n) && n != 1){
            map.put(n, 1);
            n = getNextNumber(n);
        }
        return n == 1;
    }

    static int getNextNumber(int n){

        int newNumber = 0, rem = 0;
        while(n != 0){
            rem = n % 10;
            n /= 10;
            newNumber += rem * rem;
        }
        return newNumber;
    }
}
