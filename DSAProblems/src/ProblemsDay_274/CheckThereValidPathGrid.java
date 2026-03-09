package ProblemsDay_274;

public class CheckThereValidPathGrid {
//https://leetcode.com/problems/check-if-there-is-a-valid-path-in-a-grid/?envType=problem-list-v2&envId=array
    public boolean hasValidPath(int[][] grid) {
        return dfs(0, 0, grid, new Boolean[grid.length][grid[0].length]);
    }

    public boolean dfs(int r, int c, int[][] grid, Boolean[][] vis){
        if(vis[r][c] != null){
            return false;
        }
        if(r == grid.length - 1 && c == grid[0].length - 1){
            return true;
        }
        vis[r][c] = true;
        boolean check = false;
        if(grid[r][c] == 1){
            if(c + 1 < grid[0].length && (grid[r][c + 1] == 3 || grid[r][c + 1] == 1 || grid[r][c + 1] == 5)){
                check = dfs(r, c + 1, grid, vis);
            }
            if(check){
                return check;
            }
            if(c - 1 >= 0 && (grid[r][c - 1] == 4 || grid[r][c - 1] == 1 || grid[r][c - 1] == 6)){
                check = dfs(r, c - 1, grid, vis);
            }
            return check;
        }else if(grid[r][c] == 2){
            if(r + 1 < grid.length && (grid[r + 1][c] >= 5 || grid[r + 1][c] == 2)){
                check = dfs(r + 1, c, grid, vis);
            }
            if(check){
                return check;
            }
            if(r - 1 >= 0 && (grid[r - 1][c] == 3 || grid[r - 1][c] == 4 || grid[r - 1][c] == 2)){
                check = dfs(r - 1, c, grid, vis);
            }
            return check;
        }else if(grid[r][c] == 3){
            if(r + 1 < grid.length && (grid[r + 1][c] == 2 || grid[r + 1][c] >= 5)){
                check = dfs(r + 1, c, grid, vis);
            }
            if(check){
                return check;
            }
            if(c - 1 >= 0 && (grid[r][c - 1] == 4 || grid[r][c - 1] == 1 || grid[r][c - 1] == 6)){
                check = dfs(r, c - 1, grid, vis);
            }
            return check;
        }else if(grid[r][c] == 4){
            if(r + 1 < grid.length && (grid[r + 1][c] == 2 || grid[r + 1][c] >= 5)){
                check = dfs(r + 1, c, grid, vis);
            }
            if(check){
                return check;
            }
            if(c + 1 < grid[0].length && (grid[r][c + 1] == 3 || grid[r][c + 1] == 1 || grid[r][c + 1] == 5)){
                check = dfs(r, c + 1, grid, vis);
            }
            return check;
        }else if(grid[r][c] == 5){
            if(c - 1 >= 0 && (grid[r][c - 1] == 4 || grid[r][c - 1] == 1 || grid[r][c - 1] == 6)){
                check = dfs(r, c - 1, grid, vis);
            }
            if(check){
                return check;
            }
            if(r - 1 >= 0 && (grid[r - 1][c] == 3 || grid[r - 1][c] == 4 || grid[r - 1][c] == 2)){
                check = dfs(r - 1, c, grid, vis);
            }
            return check;
        }else{
            if(c + 1 < grid[0].length && (grid[r][c + 1] == 3 || grid[r][c + 1] == 1 || grid[r][c + 1] == 5)){
                check = dfs(r, c + 1, grid, vis);
            }
            if(check){
                return check;
            }
            if(r - 1 >= 0 && (grid[r - 1][c] == 3 || grid[r - 1][c] == 4 || grid[r - 1][c] == 2)){
                check = dfs(r - 1, c, grid, vis);
            }
            return check;
        }
    }
    public static void main(String[] args) {

    }
}
