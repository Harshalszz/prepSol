package ProblemsDay_324;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

//https://leetcode.com/problems/permutations/
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> resList = new ArrayList<>();

        backtracking(resList, new ArrayList<>(), nums);

        return resList;

    }

    public static void backtracking(List<List<Integer>> resList, List<Integer> tempList, int[] nums){

        if(tempList.size() == nums.length){
            resList.add(new ArrayList(tempList));
            return;
        }

        for(int num : nums){
            // if the ele is already present in templist , then skip it
            if(tempList.contains(num)){
                continue;
            }
            // add a ele to the list
            tempList.add(num);
            // backtracking to the previous array and adding another ele
            backtracking(resList, tempList,nums);
            // remove the ele from the list
            tempList.remove(tempList.size()-1);

        }
    }
    public static void main(String[] args) {

    }
}
