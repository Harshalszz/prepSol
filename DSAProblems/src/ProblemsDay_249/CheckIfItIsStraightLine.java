package ProblemsDay_249;

public class CheckIfItIsStraightLine {

    //https://leetcode.com/problems/check-if-it-is-a-straight-line/?envType=problem-list-v2&envId=array
    public boolean checkStraightLine(int[][] arr) {
        for (int i = 2; i < arr.length; i++)
            if ((arr[i][0] - arr[0][0]) * (arr[1][1] - arr[0][1]) !=
                    (arr[i][1] - arr[0][1]) * (arr[1][0] - arr[0][0]))
                return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
