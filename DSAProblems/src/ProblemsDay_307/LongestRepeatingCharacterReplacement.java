package ProblemsDay_307;

public class LongestRepeatingCharacterReplacement {

//https://leetcode.com/problems/longest-repeating-character-replacement/?envType=problem-list-v2&envId=hash-table
    public int characterReplacement(String s, int k) {
        int[] charFreq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            int currCharNum = s.charAt(right) - 'A';
            charFreq[currCharNum]++;
            maxFreq = Math.max(maxFreq, charFreq[currCharNum]);

            while ((right - left + 1) - maxFreq > k) {
                charFreq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, (right - left + 1));
        }
        return maxLen;
    }
    public static void main(String[] args) {

    }
}
