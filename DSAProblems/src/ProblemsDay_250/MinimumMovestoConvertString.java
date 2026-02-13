package ProblemsDay_250;

public class MinimumMovestoConvertString {

//https://leetcode.com/problems/minimum-moves-to-convert-string/?envType=problem-list-v2&envId=string
    public int minimumMoves(String s) {

        int count = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length;) {

            if (chars[i] == 'X') {
                count++;
                i += 3;
            } else {
                i++;
            }

        }

        return count;
    }
    public static void main(String[] args) {

    }
}
