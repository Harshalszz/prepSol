package ProblemsDay_300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNumberTexts {

//https://leetcode.com/problems/count-number-of-texts/?envType=problem-list-v2&envId=string
    public void generatePhoneNumber(Map<Integer,Integer> phone) {

        phone.put(2,3);
        phone.put(3,3);
        phone.put(4,3);
        phone.put(5,3);
        phone.put(6,3);
        phone.put(7,4);
        phone.put(8,3);
        phone.put(9,4);

    }

    public long getCount(int[] nums,int target,long[] dp) {
        if(target==0) return 1;

        if(dp[target]!=0) return dp[target];

        long count=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<=target) {
                count+=getCount(nums,target-nums[i],dp)%1_000_000_007;
            }
        }

        return dp[target] = count%1_000_000_007;
    }

    public int countTexts(String pressedKeys) {
        Map<Integer,Integer> phone = new HashMap<>();
        generatePhoneNumber(phone);

        List<int[]> group_num = new ArrayList<>();
        int i=0,j=0;
        while(i<pressedKeys.length()) {
            char c = pressedKeys.charAt(i);
            while(j<pressedKeys.length() && pressedKeys.charAt(j)==c) {
                j++;
            }
            int[] pair = {(int)(c-'0'),(j-i)};
            // System.out.println(c-'0'+ " " + (j-i));
            group_num.add(pair);
            i=j;
        }

        long count=1;
        for(int[] pair : group_num) {
            int key = pair[0];
            int n = phone.get(key);
            int[] arr = new int[n];
            for(int k=0;k<n;k++) {
                arr[k] = k+1;
            }
            int target = pair[1];
            long[] dp = new long[target+1];
            count=(count*getCount(arr,target,dp))%1_000_000_007;
        }

        return (int)(count%1_000_000_007);
    }

    public static void main(String[] args) {

    }
}
