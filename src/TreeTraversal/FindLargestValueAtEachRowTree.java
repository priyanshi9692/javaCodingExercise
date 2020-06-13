package TreeTraversal;
/*
515. Find Largest Value in Each Tree Row
You need to find the largest value in each row of a binary tree.

Example:
Input:

          1
         / \
        3   2
       / \   \
      5   3   9

Output: [1, 3, 9]
 */

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueAtEachRowTree {
    public List<Integer> largestValue(PathSumOfABinaryTree.TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        levelOrderTraversal(root, result, 0);
        return result;

    }
    public void levelOrderTraversal(PathSumOfABinaryTree.TreeNode root, List<Integer> list, int level){
        if(root == null ){
            return;
        }
        if(level == list.size()){
            list.add(root.val);
        }else{
            list.set(level, Math.max(root.val, list.get(level)));
        }
        levelOrderTraversal(root.left, list, level+1);
        levelOrderTraversal(root.right, list, level+1);
    }
    public static void main(String[] args){
        FindLargestValueAtEachRowTree obj = new FindLargestValueAtEachRowTree();
        PathSumOfABinaryTree.TreeNode root = new PathSumOfABinaryTree.TreeNode(1);
        root.left = new PathSumOfABinaryTree.TreeNode(3);
        root.left.left = new PathSumOfABinaryTree.TreeNode(5);
        root.right = new PathSumOfABinaryTree.TreeNode(2);
        root.right.left = new PathSumOfABinaryTree.TreeNode(3);
        root.right.right = new PathSumOfABinaryTree.TreeNode(9);
        System.out.println(obj.largestValue(root));
    }
}
