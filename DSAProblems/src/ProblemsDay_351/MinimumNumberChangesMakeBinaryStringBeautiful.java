package ProblemsDay_351;

public class MinimumNumberChangesMakeBinaryStringBeautiful {
//https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/?envType=problem-list-v2&envId=string

    public int minChanges(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
