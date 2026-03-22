package ProblemsDay_287;

public class NumberSubstringsWithOnly1s {

//https://leetcode.com/problems/number-of-substrings-with-only-1s/?envType=problem-list-v2&envId=string
    public int numSub(String s) {
        long cnt = 0, total = 0, mod = 1000000007;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            } else {
                cnt = 0;
            }
            total = (total + cnt) % mod;
        }
        return (int) total;
    }

    public static void main(String[] args) {

    }
}
