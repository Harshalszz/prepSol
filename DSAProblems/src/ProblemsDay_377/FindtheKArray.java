package ProblemsDay_377;

public class FindtheKArray {

    //https://leetcode.com/problems/find-the-k-or-of-an-array/?envType=problem-list-v2&envId=array
    public int findKOr(int[] nums, int k) {
        int sum=0;int c=0;

        for(int i=0;i<32;i++)
        {
            int pow=(int)Math.pow(2,i);
            for(int j=0;j<nums.length;j++){
                System.out.println(nums[j]&pow);
                if((nums[j]&pow)==pow)
                    c++;

            }
            if(c>=k)sum|=pow;

            c=0;
        }

        return sum;

    }
    public static void main(String[] args) {

    }
}
