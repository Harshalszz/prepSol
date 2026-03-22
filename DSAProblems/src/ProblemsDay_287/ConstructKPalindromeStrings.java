package ProblemsDay_287;

public class ConstructKPalindromeStrings {

    //https://leetcode.com/problems/construct-k-palindrome-strings/?envType=problem-list-v2&envId=string
    public boolean canConstruct(String s, int k) {
        if (s.length() < k)
            return false;
        if (s.length() == k)
            return true;

        int odd = 0;

        for (char chr : s.toCharArray())
            odd ^= 1 << (chr - 'a');

        return Integer.bitCount(odd) <= k;
    }

    public static void main(String[] args) {

    }
}
