package ProblemsDay_442;

import ProblemsDay_25.TreeNode;

public class ConvertBSTGreaterTree {

    int sum = 0;
    void find(TreeNode root) {
        if(root==null) return;
        find(root.right);
        sum+=root.val;
        root.val = sum;
        find(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        find(root);
        return root;
    }


    public static void main(String[] args) {

    }
}
