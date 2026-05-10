package ProblemsDay_333;

public class MaximumDifferenceBetweenEvenOddFrequencyI {

//https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/?envType=problem-list-v2&envId=string
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int odd = 0;
        int even = s.length();
        for (int n : freq) {
            if ((n & 1) == 1) {
                odd = Math.max(odd, n);
            } else if (n != 0) {
                even = Math.min(even, n);
            }
        }

        return odd - even;
    }

    public static void main(String[] args) {

    }
}
