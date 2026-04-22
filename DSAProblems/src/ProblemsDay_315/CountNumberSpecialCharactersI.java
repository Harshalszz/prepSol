package ProblemsDay_315;

public class CountNumberSpecialCharactersI {

//https://leetcode.com/problems/count-the-number-of-special-characters-i/?envType=problem-list-v2&envId=string
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        int[] counts = new int[128];

        for (char ele : word.toCharArray()) {
            counts[ele]++;
        }

        for (char i = 'A'; i <= 'Z'; i++) {
            if (counts[i] > 0 && counts[i + 32] > 0) {
                ans++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {

    }
}
