package ProblemsDay_290;

public class Largest1BorderedSquare {
//https://leetcode.com/problems/largest-1-bordered-square/?envType=problem-list-v2&envId=array
    int rows, cols, maxSquare;
    int[][] grid;

    public int largest1BorderedSquare(int[][] g) {
        if (g == null || g.length == 0 || g[0].length == 0) return 0;
        grid = g;
        rows = grid.length;
        cols = grid[0].length;
        maxSquare = 0;

        // Try every cell as the top-left corner.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {  // Only consider if the top-left is 1.
                    backtrack(i, j, 1);
                }
            }
        }
        return maxSquare * maxSquare;
    }

    // Recursively check all possible square sizes from (i, j)
    private void backtrack(int i, int j, int size) {
        // If the square goes out of bounds, stop recursion.
        if (i + size > rows || j + size > cols) return;

        // Check if the current square's border is all 1s.
        if (isValidBorder(i, j, size)) {
            if (size > maxSquare) {
                maxSquare = size;
            }
        }
        // Regardless of current validity, try a larger square.
        backtrack(i, j, size + 1);
    }

    // Check if the square with top-left at (i, j) and side length 'size'
    // has all 1s on its border.
    private boolean isValidBorder(int i, int j, int size) {
        // Check top and bottom rows.
        for (int col = j; col < j + size; col++) {
            if (grid[i][col] == 0) return false;               // Top border
            if (grid[i + size - 1][col] == 0) return false;      // Bottom border
        }
        // Check left and right columns (excluding corners already checked).
        for (int row = i + 1; row < i + size - 1; row++) {
            if (grid[row][j] == 0) return false;               // Left border
            if (grid[row][j + size - 1] == 0) return false;      // Right border
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
