package ProblemsDay_363;

public class PrimeInDiagonal {

//https://leetcode.com/problems/prime-in-diagonal/?envType=problem-list-v2&envId=array
    public int diagonalPrime(int[][] nums) {
        int maxPrime=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            // Check primary diagonal
            if (isPrime(nums[i][i])) {
                maxPrime = Math.max(maxPrime, nums[i][i]);
            }
            // Check secondary diagonal
            if (isPrime(nums[i][n - 1 - i])) {
                maxPrime = Math.max(maxPrime, nums[i][n - 1 - i]);
            }
        }
        return maxPrime;
    }

    public boolean isPrime(int num){
        if(num<=1)
            return false;
        for(int i=2; i*i<=num; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
