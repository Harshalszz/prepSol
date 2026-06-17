package ProblemsDay_369;

import java.util.ArrayList;
import java.util.List;

public class LastVisitedIntegers {

//https://leetcode.com/problems/last-visited-integers/?envType=problem-list-v2&envId=array
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> seen=new ArrayList<>();
        int y=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                seen.add(0,nums[i]);
                y=1;
            }
            else if(nums[i]==-1){
                if(y<=seen.size()){
                    ans.add(seen.get(y-1));
                    y++;
                }
                else{
                    ans.add(-1);
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
