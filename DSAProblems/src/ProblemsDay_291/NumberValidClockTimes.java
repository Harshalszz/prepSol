package ProblemsDay_291;

public class NumberValidClockTimes {

//https://leetcode.com/problems/number-of-valid-clock-times/?envType=problem-list-v2&envId=string
    public int countTime(String time) {
        int res=1;
        if(time.charAt(4)=='?')res*=10;
        if(time.charAt(3)=='?')res*=6;
        if(time.charAt(1)=='?' && time.charAt(0)=='?') res*=24;
        else if(time.charAt(1)=='?'){
            if(time.charAt(0)=='2') res*=4;
            else res*=10;
        }else if(time.charAt(0)=='?'){
            int x=Integer.parseInt(time.substring(1,2));
            if(x>=4) res*=2;
            else res*=3;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
