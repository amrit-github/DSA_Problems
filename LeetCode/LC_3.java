package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LC_3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabde"));
    }

        public static int lengthOfLongestSubstring(String s) {
        
        int strLen = s.length();
        if(strLen == 0 || strLen == 1) return strLen;

        int i = 0, j = 0, longestLen = 0;
        Set<Character> charSet = new HashSet<>();

        while(i < strLen && j < strLen){
            if(!charSet.contains(s.charAt(j))){
                charSet.add(s.charAt(j));
                j++;
            }else{
                if(j - i > longestLen) {
                    longestLen = j - i;
                }
                charSet.clear();
                i++;
                j = i;
            }
        }
        if(j - i > longestLen) {
            longestLen = j - i;
        }
        return longestLen;
    }
}