package ProblemsDay_308;

public class MinimumNumberPushesTypeWord {

//https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/?envType=problem-list-v2&envId=string
    public int minimumPushes(String word) {
        int n = word.length();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            cnt += (i / 8) + 1;
        }

        return cnt;
    }
    public static void main(String[] args) {

    }
}
