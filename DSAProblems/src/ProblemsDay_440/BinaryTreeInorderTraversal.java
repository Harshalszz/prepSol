package ProblemsDay_440;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {


    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> resList = new ArrayList<>();

        inorder(root,resList);

        return resList;

    }

    public static void inorder(TreeNode node, List<Integer> resList){

        if(node == null){
            return ;
        }

        inorder(node.left,resList);
        resList.add(node.val);
        inorder(node.right, resList);
    }

    public static void main(String[] args) {

    }
}
