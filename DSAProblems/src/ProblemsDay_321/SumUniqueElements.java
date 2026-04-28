package ProblemsDay_321;

public class SumUniqueElements {
//https://leetcode.com/problems/sum-of-unique-elements/?envType=problem-list-v2&envId=array

    public int sumOfUnique(int[] nums) {

        int[] arr = new int[101];

        for(int i=0; i<nums.length; i++){

            arr[nums[i]] += 1;
        }


        int res = 0;

        for(int j =0; j<101; j++){
            if(arr[j] == 1){
                res += j;
            }
        }

        return res;

    }
    public static void main(String[] args) {

    }
}
