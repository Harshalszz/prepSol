package ProblemsDay_299;

public class WaysMakeFairArray {
//https://leetcode.com/problems/ways-to-make-a-fair-array/?envType=problem-list-v2&envId=array
    public int waysToMakeFair(int[] nums) {
        int len = nums.length;
        int ttlOdd = 0;
        int ttlEven = 0;

        for(int i = 0;i < len;i++){
            if(i%2 == 0) ttlEven += nums[i];
            else ttlOdd += nums[i];
        }

        int oddSum = 0;
        int evenSum = 0;
        int cnt = 0;
        for(int i = 0;i < len;i++){
            if(i%2 == 0){
                int odd = ttlEven-(nums[i]+evenSum);
                int even = ttlOdd-oddSum;
                if(even+evenSum == odd+oddSum) cnt++;

                evenSum += nums[i];
            }
            else{
                int even = ttlOdd-(nums[i]+oddSum);
                int odd = ttlEven-evenSum;
                if(odd+oddSum == even+evenSum) cnt++;

                oddSum += nums[i];
            }
        }

        return cnt;
    }
    public static void main(String[] args) {

    }
}
