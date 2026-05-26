package ProblemsDay_348;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoOutThree {
//https://leetcode.com/problems/two-out-of-three/?envType=problem-list-v2&envId=array

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }
        for(int i=0;i<nums3.length;i++){
            if(set.contains(nums3[i])){
                ans.add(nums3[i]);
            }
        }
        List<Integer>list = new ArrayList<>();
        for(int x:ans){
            list.add(x);
        }
        return list;


    }

    public static void main(String[] args) {

    }
}
