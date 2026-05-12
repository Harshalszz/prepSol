package ProblemsDay_335;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumPalindromesAfterOperations {

//https://leetcode.com/problems/maximum-palindromes-after-operations/?envType=problem-list-v2&envId=string
    public int maxPalindromesAfterOperations(String[] words) {
        int n = words.length, oddLength = 0, oddFreq = 0, result = n;
        List<Integer> lengths = new ArrayList<>(n);
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            lengths.add(words[i].length());
            oddLength += lengths.get(i) & 1;
            for (char ch : words[i].toCharArray()) {
                freq[ch - 'a']++;
            }
        }
        for (int f: freq) {
            oddFreq += f & 1;
        }
        int remaining = Math.max(0, oddFreq - oddLength);
        Collections.sort(lengths, Collections.reverseOrder());
        for (int i = 0; i < n && remaining > 0; i++) {
            remaining -= lengths.get(i) - (lengths.get(i) & 1);
            result--;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
