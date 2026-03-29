package ProblemsDay_294;

public class MinimumCostMakeAllCharactersEqual {

    //https://leetcode.com/problems/minimum-cost-to-make-all-characters-equal/?envType=problem-list-v2&envId=string

    public long minimumCost(String s) {
        int n = s.length();
        long ans=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                ans+=Math.min(i+1,n-i-1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
