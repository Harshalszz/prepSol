package ProblemsDay_322;

public class CheckifTwoChessboardSquaresHaveSameColor {
// https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color/?envType=problem-list-v2&envId=string

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        //square 1
        int col = coordinate1.charAt(0) - 'a';
        int row = coordinate1.charAt(1) - '0';

        //square 2
        int col2 = coordinate2.charAt(0) - 'a';
        int row2 = coordinate2.charAt(1) - '0';

        //check if both sqaures are same colored
        return ((col + row) % 2) == ((col2+row2) % 2);
    }
    public static void main(String[] args) {

    }
}
