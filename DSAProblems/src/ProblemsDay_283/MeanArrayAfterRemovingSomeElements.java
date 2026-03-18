package ProblemsDay_283;

import java.util.Arrays;

public class MeanArrayAfterRemovingSomeElements {
//https://leetcode.com/problems/mean-of-array-after-removing-some-elements/?envType=problem-list-v2&envId=array
    public double trimMean(int[] arr) {

        Arrays.sort(arr);


        int n=arr.length/20;
        double sum=0,avg=0;
        double c=0;

        for(int i=n;i<arr.length-n;i++)
        {

            sum+=arr[i];
            c++;
        }

        avg=sum/c;

        return avg;


    }
    public static void main(String[] args) {

    }
}
