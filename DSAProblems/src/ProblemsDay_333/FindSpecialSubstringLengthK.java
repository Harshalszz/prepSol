package ProblemsDay_333;

public class FindSpecialSubstringLengthK {
//https://leetcode.com/problems/find-special-substring-of-length-k/?envType=problem-list-v2&envId=string
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (s.charAt(j) == s.charAt(i)) continue;
            if (j - i == k) return true;
            i = j;
        }

        return (n - i) == k;
    }
    public static void main(String[] args) {

    }
}
