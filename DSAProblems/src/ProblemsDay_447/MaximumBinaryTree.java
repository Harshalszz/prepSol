package ProblemsDay_447;

import ProblemsDay_25.TreeNode;

public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        if(nums == null){
            return null;
        }

        return helperFun(nums ,0, nums.length-1);

    }

    public static TreeNode helperFun(int[] nums, int start, int end){

        if(start > end){
            return null;
        }

        int indx = start;

        for(int i= start+1 ; i<=end; i++){
            if(nums[i] > nums[indx]){
                indx = i;
            }
        }

        TreeNode root = new TreeNode(nums[indx]);

        root.left = helperFun(nums, start, indx-1);
        root.right = helperFun(nums,indx+1, end);

        return root;
    }
    public static void main(String[] args) {

    }
}
