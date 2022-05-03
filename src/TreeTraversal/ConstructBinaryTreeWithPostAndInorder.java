package TreeTraversal;
/*\
106. Construct Binary Tree from Inorder and Postorder Traversal
Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

inorder = [9,3,15,20,7]
postorder = [9,15,7,20,3]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7

Inorder = left, root, right
postorder = left, right, root
So from the postorder traversal we can get root of our tree is the last value of postorder correct,
Now if you see inorder traversal root node divide the left and right subtree - for constructing our
left and right subtree we will first find the index of root node in inorder let it call inRootIndex
now we can call same method with different start, end and index variable.
*/
public class ConstructBinaryTreeWithPostAndInorder {
    public static class TreeNode {
        int val;
        TreeNode left;
      TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode constructBSTInPost(int[] inorder, int[] postorder){
        return constructBSTInOPostO(inorder, postorder, 0, inorder.length-1, postorder.length-1);
    }
    public TreeNode constructBSTInOPostO(int[] inorder, int[] postorder, int start, int end, int index){
        if(start>end) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[index]);
        int inRootIndex = start;
        while(postorder[index]!= inorder[inRootIndex]){
            inRootIndex++;
        }
        root.right = constructBSTInOPostO(inorder, postorder, inRootIndex+1, end, index-1);
        root.left = constructBSTInOPostO(inorder, postorder, start, inRootIndex-1, index-(end-inRootIndex)-1);
        return root;
    }
}
