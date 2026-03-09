package ProblemsDay_274;

public class CheckArrayPairsAreDivisible {

//https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/?envType=problem-list-v2&envId=array
    public boolean canArrange(int[] arr, int k) {
        int [] freq = new int[k];
        for(int num: arr){
            int rem = num % k;
            if(rem < 0){
                rem = rem + k;
            }
            freq[rem]++;
        }
        if(freq[0] % 2 != 0){
            return false;
        }
        for(int i = 1;i <= k / 2;i++){
            if(freq[i] != freq[k-i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
