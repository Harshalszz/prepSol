package ProblemsDay_260;

public class DetermineColorChessboarSquare {

//https://leetcode.com/problems/determine-color-of-a-chessboard-square/?envType=problem-list-v2&envId=string
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        int ans = coordinates.charAt(1);
        if (ch == 'a' || ch == 'c' || ch == 'e' || ch == 'g') {
            return ans % 2 == 0;
        } else {
            return ans % 2 == 1;
        }
    }
    public static void main(String[] args) {

    }
}
