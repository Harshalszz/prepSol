package ProblemsDay_348;

public class FindGreatestCommonDivisorArray {

//https://leetcode.com/problems/find-greatest-common-divisor-of-array/?envType=problem-list-v2&envId=array

    public int findGCD(int[] nums)
    {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int num:nums)
        {
            mini = num<mini?num:mini;
            maxi = num>maxi?num:maxi;
        }

        int a = mini, b = maxi;
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

    }
}
