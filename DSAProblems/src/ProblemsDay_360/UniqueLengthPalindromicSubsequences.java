package ProblemsDay_360;

import java.util.HashSet;
import java.util.Set;

public class UniqueLengthPalindromicSubsequences {
//https://leetcode.com/problems/unique-length-3-palindromic-subsequences/?envType=problem-list-v2&envId=string
    public int countPalindromicSubsequence(String s) {
        int res = 0;
        Set<Character> uniq = new HashSet<>();

        for (char c : s.toCharArray()) {
            uniq.add(c);
        }

        for (char c : uniq) {
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);

            if (start < end) {
                Set<Character> charSet = new HashSet<>();
                for (int i = start + 1; i < end; i++) {
                    charSet.add(s.charAt(i));
                }
                res += charSet.size();
            }
        }

        return res;
    }


    public static void main(String[] args) {

    }
}
