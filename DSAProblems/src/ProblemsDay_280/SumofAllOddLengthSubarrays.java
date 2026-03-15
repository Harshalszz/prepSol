package ProblemsDay_280;

public class SumofAllOddLengthSubarrays {

//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/?envType=problem-list-v2&envId=array
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum =0;

        for(int i=0 ;i<arr.length ;i++) {
            int total = (i + 1) * ( n - i);
            int odd = (total + 1)/2;
            sum += arr[i] * odd;
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
