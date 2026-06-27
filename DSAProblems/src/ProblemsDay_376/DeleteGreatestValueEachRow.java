package ProblemsDay_376;

public class DeleteGreatestValueEachRow {

//https://leetcode.com/problems/delete-greatest-value-in-each-row/?envType=problem-list-v2&envId=array
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int ans = 0;
        int col = n;
        while(col > 0){
            int sum = 0;
            for(int i = 0; i < m; i++){
                int max = 0;
                int idx = 0;
                for(int j = 0; j < n; j++){
                    if(grid[i][j] > max){
                        max = grid[i][j];
                        idx= j;
                    }
                }
                sum = Math.max(sum, max);
                grid[i][idx] = -1;
            }
            ans += sum;
            col--;
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
