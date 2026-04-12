package ProblemsDay_308;

public class NumberChangingKeys {

    //https://leetcode.com/problems/number-of-changing-keys/?envType=problem-list-v2&envId=string
    public int countKeyChanges(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
