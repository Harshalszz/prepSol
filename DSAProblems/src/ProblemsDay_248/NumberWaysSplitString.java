package ProblemsDay_248;

public class NumberWaysSplitString {
//https://leetcode.com/problems/number-of-ways-to-split-a-string/?envType=problem-list-v2&envId=string
    int MOD = 1_000_000_007;

    public int numWays(String s) {
        char[] ch = s.toCharArray();
        int one = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1') {
                one++;
            }
        }

        // Base Cases
        if (one == 0) {
            long n = s.length();
            return (int) ((((n - 1) * (n - 2)) / 2) % MOD);
        }
        if (one % 3 != 0) {
            return 0;
        }

        // division of one so taht can be present equally in each part
        long ones = one / 3;
        one = 0;
        // ways on which the string can be splitted
        long part1 = 0, part2 = 0;
        for (char c : ch) {
            if (c == '1') {
                one++;
            }
            if (one == ones) {
                part1++;
            }
            if (one == 2 * ones) {
                part2++;
            }
        }
        return (int) ((part1 * part2) % MOD);
    }
    public static void main(String[] args) {

    }
}
