package ProblemsDay_276;

public class CheckifAllAAppearsBeforeAllB {

//https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/?envType=problem-list-v2&envId=string
    public boolean checkString(String s) {
        boolean seenB = false;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                seenB = true;
            }
            if (c == 'a' && seenB) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
