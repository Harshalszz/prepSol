package ProblemsDay_302;

public class TimeNeededRearrangeBinaryString {

//https://leetcode.com/problems/time-needed-to-rearrange-a-binary-string/?envType=problem-list-v2&envId=string
    public int secondsToRemoveOccurrences(String s) {
        int n=s.length();
        int zero=0,ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0') zero++;
            else if(zero>0){
                if(ans>=zero) ans++;
                else ans=zero;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
