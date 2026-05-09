package ProblemsDay_332;

public class CheckBalancedString {

//https://leetcode.com/problems/check-balanced-string/?envType=problem-list-v2&envId=string
    public boolean isBalanced(String num) {


        int evenSum =0, oddSum = 0;

        for(int i=0; i<num.length(); i++){
            int digit = num.charAt(i) - '0';
            if(i%2==0){
                evenSum+=digit;
            }else{
                oddSum+=digit;
            }
        }


        return evenSum==oddSum;

    }

    public static void main(String[] args) {

    }
}
