package ProblemsDay_280;

public class ThreeConsecutiveOdds {
//https://leetcode.com/problems/three-consecutive-odds/?envType=problem-list-v2&envId=array
    public boolean threeConsecutiveOdds(int[] arr) {

        int count = 0;

        for(int n : arr){

            if(n %2 !=0){
                count++;
            }else{
                count=0;
            }

            if(count == 3){
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {

    }
}
