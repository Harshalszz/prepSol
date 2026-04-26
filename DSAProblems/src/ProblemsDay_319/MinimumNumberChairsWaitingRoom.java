package ProblemsDay_319;

public class MinimumNumberChairsWaitingRoom {
//https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/?envType=problem-list-v2&envId=string

    public int minimumChairs(String s) {

        int res = 0,count =0 ;

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == 'E'){
                count++;
            }else{
                count--;
            }

            res = Math.max(res, count);
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
