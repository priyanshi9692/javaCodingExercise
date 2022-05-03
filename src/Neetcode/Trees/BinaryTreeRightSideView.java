package Neetcode.Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public static List<Integer> result;
    public static List<Integer> binaryTreeRightSideView(TreeNode root){
        result = new ArrayList<>();

        if(root == null){
            return result;
        }

        rightSideViewRecursion(root, 0);
        return result;
    }

    public static void rightSideViewRecursion(TreeNode root, int level){
        // base condition
        // Process root
        if(result.size() == level){
            result.add(root.val);
        }
        // process right
        if(root.right!= null){
            rightSideViewRecursion(root.right, level+1);
        }
        // Process Left
        if(root.left!= null){
            rightSideViewRecursion(root.left, level+1);
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.println("Right side view of the tree: "+ binaryTreeRightSideView(root));
    }
}
