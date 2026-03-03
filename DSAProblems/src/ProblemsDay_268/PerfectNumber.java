package ProblemsDay_268;

public class PerfectNumber {

    //https://leetcode.com/problems/perfect-number/?envType=problem-list-v2&envId=math
    public boolean checkPerfectNumber(int num) {

        int sum = 0;

        for(int i=1; i<num; i++){

            if(num%i == 0){
                sum +=i;
            }
        }

        return sum == num;

    }
    public static void main(String[] args) {

    }
}
