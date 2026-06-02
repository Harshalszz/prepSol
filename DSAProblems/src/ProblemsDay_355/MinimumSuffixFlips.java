package ProblemsDay_355;

public class MinimumSuffixFlips {

//https://leetcode.com/problems/minimum-suffix-flips/?envType=problem-list-v2&envId=string
    public int minFlips(String target) {
        //Find last zero in string
        int lastZero = -1;
        for(int i = target.length() - 1; i >= 0; i--){
            if(target.charAt(i) == '0'){
                lastZero = i;
                break;
            }
        }
        //If no 0 then return 1
        if(lastZero == -1){
            return 1;
        }

        int result = 0;
        int i = 0;

        while(i < target.length()){

            //For 1's after last 0 we only need one flip for the rest of the string
            if(i > lastZero){
                result++;
                break;
            }//If we encounter a 1 with a 0 somwhere after it
            else if(target.charAt(i) == '1'){
                result += 2;
                //iterate until next 0
                while(i < target.length() && target.charAt(i) == '1'){
                    i++;
                }
            }

            //iterate until we hit next 1
            while(i < target.length() && target.charAt(i) == '0'){
                i++;
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
