package ProblemsDay_332;

import java.util.Arrays;

public class FindValidPairAdjacentDigitsString {

//https://leetcode.com/problems/find-valid-pair-of-adjacent-digits-in-string/?envType=problem-list-v2&envId=string
    public String findValidPair(String s) {
        int[] t = new int[26];
        Arrays.fill(t, 0);
        for(int i = 0; i < s.length(); ++i) t[s.charAt(i) - '0']++;
        for(int i = 1; i < s.length(); ++i){
            if(s.charAt(i-1) == s.charAt(i) || t[s.charAt(i-1) - '0'] != s.charAt(i-1) - '0' || t[s.charAt(i) - '0'] != s.charAt(i) - '0') continue;
            return s.substring(i-1, i+1);
        }
        return new String();
    }
    public static void main(String[] args) {

    }
}
