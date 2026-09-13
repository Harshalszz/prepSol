package ProblemsDay_447;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer> stack = new Stack<>();

    int[] nextGra = new int[nums2.length];

        for(int i= nums2.length -1; i>=0 ; i--){

        while(!stack.isEmpty() && stack.peek() < nums2[i]){
            stack.pop();
        }

        if(stack.isEmpty()){
            nextGra[i] = -1;
        }else{
            nextGra[i] = stack.peek();
        }

        stack.push(nums2[i]);
    }
    //mapping nums2 next gereated
    HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums2.length; i++){
        map.put(nums2[i], nextGra[i]);
    }

        for(int j=0; j<nums1.length; j++){

        nums1[j] = map.get(nums1[j]);
    }

        return nums1;
}
    public static void main(String[] args) {

    }
}
