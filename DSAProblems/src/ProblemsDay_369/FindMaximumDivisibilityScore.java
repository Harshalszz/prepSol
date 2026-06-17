package ProblemsDay_369;

import java.util.Arrays;
import java.util.TreeMap;

public class FindMaximumDivisibilityScore {

//https://leetcode.com/problems/find-the-maximum-divisibility-score/?envType=problem-list-v2&envId=array
    public int maxDivScore(int[] nums, int[] d) {
        int max=0;
        TreeMap<Integer,Integer> map=new TreeMap<>();

        for(int i=0;i<d.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%d[i]==0){
                    count++;
                }
            }
            map.put(d[i],count);
            max=Math.max(count,max);
        }

        Arrays.sort(d);
        if(max==0){
            return d[0];
        }
        for(int i :map.keySet()){
            if(map.get(i)==max){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
