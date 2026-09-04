package ProblemsDay_440;

import ProblemsDay_25.TreeNode;

public class InvertBinaryTree {

//https://leetcode.com/problems/invert-binary-tree/?envType=problem-list-v2&envId=tree
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
    public static void main(String[] args) {

    }
}
