/*
67. Add Binary
Solved
Easy
Topics
premium lock icon
Companies
Given two binary strings a and b, return their sum as a binary string.

 
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/

public class AddBinary {

    public static void main(String[] args) {

        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0, carry = 0;

        StringBuilder sb = new StringBuilder();

        while(i >= 0 || j >= 0 || carry == 1){
            sum = carry;
            if(i >= 0){
                sum += a.charAt(i--) - '0';
            }
            if(j >= 0){
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
}