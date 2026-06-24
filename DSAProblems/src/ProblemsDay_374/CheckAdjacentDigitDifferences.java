package ProblemsDay_374;

public class CheckAdjacentDigitDifferences {

//https://leetcode.com/problems/check-adjacent-digit-differences/?envType=problem-list-v2&envId=string
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n=s.length();
        for(int i=0;i<n-1;i++){
            int n1=s.charAt(i)-'0';
            int n2=s.charAt(i+1)-'0';
            int diff=Math.abs(n1-n2);
            if(diff>2) return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
