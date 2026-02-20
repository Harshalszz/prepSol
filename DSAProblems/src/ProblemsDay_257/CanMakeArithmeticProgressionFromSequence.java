package ProblemsDay_257;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {

    //https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/?envType=problem-list-v2&envId=array
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=1; i<arr.length-1; i++){
            if(arr[i+1]-arr[i] !=diff)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
