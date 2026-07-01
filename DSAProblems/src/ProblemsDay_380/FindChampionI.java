package ProblemsDay_380;

public class FindChampionI {
//https://leetcode.com/problems/find-champion-i/?envType=problem-list-v2&envId=array

    public int findChampion(int[][] grid) {
        int winner = 0;
        int n = grid.length;
        for (int opponent = 0; opponent < n; opponent++) {
            if (opponent == winner) continue;
            if (grid[winner][opponent] == 0) {
                winner = opponent;
            }
        }
        return winner;
    }

    public static void main(String[] args) {

    }
}
