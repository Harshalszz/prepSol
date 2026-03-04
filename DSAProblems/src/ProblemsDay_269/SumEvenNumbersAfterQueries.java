package ProblemsDay_269;

public class SumEvenNumbersAfterQueries {
//https://leetcode.com/problems/sum-of-even-numbers-after-queries/?envType=problem-list-v2&envId=array

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] arr=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int s=0;
            nums[queries[i][1]]+=queries[i][0];
            arr[i]=Evensum(nums);
        }
        return arr;
    }
    public int Evensum(int[] a){
        int s=0;
        for(int i:a){
            if(i%2==0){
                s+=i;
            }
        }
        return s;
    }

    public static void main(String[] args) {

    }
}
