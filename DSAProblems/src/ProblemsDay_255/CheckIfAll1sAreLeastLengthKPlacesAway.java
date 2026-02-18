package ProblemsDay_255;

public class CheckIfAll1sAreLeastLengthKPlacesAway {

    //https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/?envType=problem-list-v2&envId=array
    public boolean kLengthApart(int[] nums, int k) {

        int count = 0;
        boolean flag = true;

        for(int n : nums){

            if(n == 0){
                count++;
            }else {

                if(flag){
                    flag = false;
                    count = 0;
                    continue;
                }

                if(count < k){
                    return false;
                }
                count = 0;

            }
        }

        return true;

    }
    public static void main(String[] args) {

    }
}
