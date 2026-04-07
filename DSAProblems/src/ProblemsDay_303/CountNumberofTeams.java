package ProblemsDay_303;

public class CountNumberofTeams {

//https://leetcode.com/problems/count-number-of-teams/?envType=problem-list-v2&envId=array
    public int numTeams(int[] rating) {
        int res = 0, n = rating.length;
        for (int i = 1; i < n; i++) {
            int ls = 0, lg = 0, rs = 0, rg = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) ls++;
                else lg++;
            }
            for (int j = i + 1; j < n; j++) {
                if (rating[j] < rating[i]) rs++;
                else rg++;
            }
            res += (ls * rg) + (rs * lg);
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
