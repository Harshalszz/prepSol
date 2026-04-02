package ProblemsDay_298;

public class MinimumOperationstoMakeSpecialNumber {

    //https://leetcode.com/problems/minimum-operations-to-make-a-special-number/?envType=problem-list-v2&envId=string
    public int minimumOperations(String num) {
        int n = num.length();
        int ans = n;
        for(int i=n-1; i>=0; i--) {
            int a = num.charAt(i)-'0';
            for(int j=i-1; j>=0; j--) {
                int b = num.charAt(j)-'0';
                int c = b*10 + a;
                if(c%25==0) {
                    ans = Math.min(ans, n-j-2);
                }
            }
            if(a == 0) {
                ans = Math.min(ans, n-1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
