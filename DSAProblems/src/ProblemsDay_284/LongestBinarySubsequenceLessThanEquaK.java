package ProblemsDay_284;

public class LongestBinarySubsequenceLessThanEquaK {
//https://leetcode.com/problems/longest-binary-subsequence-less-than-or-equal-to-k/?envType=problem-list-v2&envId=string
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int zeros = 0;
        int ones = 0;
        long value = 0;
        long pow = 1;


        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }


        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                if (value + pow > k) {
                    continue;
                }
                value += pow;
                ones++;
            }
            pow <<= 1;

            if (pow > k) {

                break;
            }
        }
        return zeros + ones;
    }
    public static void main(String[] args) {

    }
}
