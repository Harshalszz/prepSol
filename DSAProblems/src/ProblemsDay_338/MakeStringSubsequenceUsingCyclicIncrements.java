package ProblemsDay_338;

public class MakeStringSubsequenceUsingCyclicIncrements {

//    /https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/?envType=problem-list-v2&envId=string

    public boolean canMakeSubsequence(String source, String target) {
        int targetIdx = 0, targetLen = target.length();

        for (char currChar : source.toCharArray()) {
            if (targetIdx < targetLen && (target.charAt(targetIdx) - currChar + 26) % 26 <= 1) {
                targetIdx++;
            }
        }
        return targetIdx == targetLen;
    }

    public static void main(String[] args) {

    }
}
