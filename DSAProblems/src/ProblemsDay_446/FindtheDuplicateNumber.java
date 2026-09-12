package ProblemsDay_446;

public class FindtheDuplicateNumber {


    public int findDuplicate(int[] nums) {

        /*Map<Integer,Integer> numberCount = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(numberCount.containsKey(nums[i])){
                return nums[i];
            }
            numberCount.put(nums[i],i);
        }

        return -1;*/

        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        fast = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast; //as bointer the pointer are at same position , slow and fast is the ansor number
    }
    public static void main(String[] args) {

    }
}
