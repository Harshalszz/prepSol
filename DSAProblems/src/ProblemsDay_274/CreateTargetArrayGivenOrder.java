package ProblemsDay_274;

import java.util.ArrayList;

public class CreateTargetArrayGivenOrder {
//https://leetcode.com/problems/create-target-array-in-the-given-order/?envType=problem-list-v2&envId=array
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int target[]=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            target[i]=list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {

    }
}
