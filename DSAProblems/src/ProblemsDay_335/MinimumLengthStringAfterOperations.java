package ProblemsDay_335;

public class MinimumLengthStringAfterOperations {

//https://leetcode.com/problems/minimum-length-of-string-after-operations/?envType=problem-list-v2&envId=string
    public int minimumLength(String s) {
        int[] charFrequency = new int[26];
        int totalLength = 0;
        for (char c : s.toCharArray()) {
            charFrequency[c - 'a']++;
        }
        for (int frequency : charFrequency) {
            if (frequency == 0) continue;
            if (frequency % 2 == 0) {
                totalLength += 2;
            } else {
                totalLength += 1;
            }
        }
        return totalLength;
    }

    public static void main(String[] args) {

    }
}
