package ProblemsDay_311;

public class MinimumAdditionsMakeValidString {

//https://leetcode.com/problems/minimum-additions-to-make-valid-string/?envType=problem-list-v2&envId=string
    public int addMinimum(String word) {
        int k = 0, prev = 'z', n = word.length();
        for (int i = 0; i < n; ++i) {
            k += word.charAt(i) <= prev ? 1 : 0;
            prev = word.charAt(i);
        }
        return k * 3 - n;
    }
    public static void main(String[] args) {

    }
}
