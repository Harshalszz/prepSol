package ProblemsDay_285;

public class LengthoftheLongestAlphabeticalContinuousSubstring {
//https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/?envType=problem-list-v2&envId=string

    public int longestContinuousSubstring(String s) {
        int ans = 1 , count = 1;
        for(int i = 0; i< s.length() - 1 ; i++){
            if(s.charAt(i + 1) - s.charAt(i) == 1){
                count++;
                ans = Math.max(ans,count);
            }
            else count = 1;
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
