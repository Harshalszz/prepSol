package ProblemsDay_277;

public class MatrixDiagonalSum {
//https://leetcode.com/problems/matrix-diagonal-sum/?envType=problem-list-v2&envId=array

    public int diagonalSum(int[][] mat) {
        int start = 0;
        int end = mat.length-1;
        int sum = 0;
        for(int i=0;i<=mat.length-1;i++){
            sum += mat[start][start];
            if(start!=end){
                sum+= mat[start][end];
            }
            start++;
            end--;
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
