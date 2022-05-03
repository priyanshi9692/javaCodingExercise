package Neetcode.Trees;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levels;
    public static List<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root){
        levels = new ArrayList<>();
        if(root == null){
            return levels;
        }
        levelOrderTraversal(root, 0);
        return levels;
    }
    public static void levelOrderTraversal(TreeNode root, int level){
        if(levels.size() == level){
            levels.add(new ArrayList<>());
        }
        /*
        Pre-order traversal
        1. Process root
        2. Go to the Left child
        3. Go to the right child
         */
        // Process root
        levels.get(level).add(root.val);

        // Left child
        if(root.left!= null){
            levelOrderTraversal(root.left, level+1);
        }

        if(root.right!= null){
            levelOrderTraversal(root.right, level+1);
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Level Order Traversal: "+ binaryTreeLevelOrderTraversal(root));
    }
}
