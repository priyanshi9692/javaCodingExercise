package TreeTraversal;

import LinkedList.LinkedList;

import java.util.List;
import java.util.Stack;

/*
331. Verify Preorder Serialization of a Binary Tree
One way to serialize a binary tree is to use pre-order traversal.
When we encounter a non-null node, we record the node's value. If it is a null node,
we record using a sentinel value such as #.

     _9_
    /   \
   3     2
  / \   / \
 4   1  #  6
/ \ / \   / \
# # # #   # #
For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#",
where # represents a null node.

Given a string of comma separated values, verify whether it is a correct preorder
traversal serialization of a binary tree. Find an algorithm without reconstructing the tree.

Each comma separated value in the string must be either an integer or a
character '#' representing null pointer.

You may assume that the input format is always valid, for example it could never contain
two consecutive commas such as "1,,3".

Example 1:

Input: "9,3,4,#,#,1,#,#,2,#,6,#,#"
Output: true

 */
public class VerifyPreorderSerializationOfBinaryTree {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean verifyPreorderSerialization(String preorder){
      Stack<String> stack = new Stack<>();
        String[] strs = preorder.split(",");
        for(int i = 0; i<strs.length; i++){
            stack.add(strs[i]);

            while(stack.size()>=3
                    && stack.get(stack.size()-1).equals("#")
                    && stack.get(stack.size()-2).equals("#")
                    && !stack.get(stack.size()-3).equals("#")){
                stack.remove(stack.size()-1);
                stack.remove(stack.size()-1);
                stack.remove(stack.size()-1);
                stack.add("#");
            }
        }
        if(stack.size()==1 && stack.get(0).equals("#")){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        System.out.println(verifyPreorderSerialization(preorder));
    }

}
