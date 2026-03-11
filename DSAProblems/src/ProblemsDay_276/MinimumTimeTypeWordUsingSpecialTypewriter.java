package ProblemsDay_276;

public class MinimumTimeTypeWordUsingSpecialTypewriter {

//https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/?envType=problem-list-v2&envId=string
    public int minTimeToType(String word) {
        int answer = 0;
        char pointer = 'a';

        for (char ch : word.toCharArray()) {
            int clockwise = Math.abs(ch - pointer);
            int counterclockwise = 26 - clockwise;
            answer += Math.min(clockwise, counterclockwise) + 1;
            pointer = ch;
        }

        return answer;
    }
    public static void main(String[] args) {

    }
}
