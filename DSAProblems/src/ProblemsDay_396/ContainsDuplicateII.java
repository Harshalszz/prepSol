package ProblemsDay_396;

import java.util.HashMap;

public class ContainsDuplicateII {


    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //  Set<Integer> seen = new HashSet<>();

        // for (int i = 0; i < nums.length; i++) {
        //     if (i > k) {
        //         seen.remove(nums[i - k - 1]);
        //     }

        //     if (seen.contains(nums[i])) {
        //         return true;
        //     }

        //     seen.add(nums[i]);
        // }

        // return false;

        HashMap<Integer, Integer> indxMap = new HashMap<>();

        for(int i =0 ; i<nums.length;i++){
            if(indxMap.containsKey(nums[i])){
                int index = indxMap.get(nums[i]);

                if((i-index) <=k){
                    return true;
                }else{
                    indxMap.put(nums[i] ,i);
                }

            }else{
                indxMap.put(nums[i] ,i);
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
