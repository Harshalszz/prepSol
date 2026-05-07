package ProblemsDay_330;

public class KokoEatingBananas {

//https://leetcode.com/problems/koko-eating-bananas/?q=koko
    public int maxEle(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }

        return max;
    }

    public int getTotalHr(int[] nums, int hr){
        int totalHr = 0;

        for(int i=0; i<nums.length;i++){
            totalHr +=Math.ceil((double)nums[i]/(double)hr);
        }

        return totalHr;
    }



    public int minEatingSpeed(int[] piles, int h) {

        int start =1, end = maxEle(piles);
        int totalHour =0;

        while(start<=end){
            int mid = (start+end)/2;

            totalHour = getTotalHr(piles,mid);

            if(totalHour <= h){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }

        return start;
    }
    public static void main(String[] args) {

    }
}
