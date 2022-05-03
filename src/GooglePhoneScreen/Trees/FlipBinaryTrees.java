package GooglePhoneScreen.Trees;

public class FlipBinaryTrees {
    public static boolean flipTrees(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }

        if(root1== null || root2 == null || root1.val!= root2.val){
            return false;
        }

        return (flipTrees(root1.left, root2.left) && flipTrees(root1.right, root2.right))
                ||(flipTrees(root1.left, root2.right) && flipTrees(root1.right, root2.left));
    }

    public static void main(String[] args){
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.left.left = new TreeNode(4);
         root.left.right = new TreeNode(5);
         root.left.right.left = new TreeNode(7);
         root.left.right.right = new TreeNode(8);
         root.right = new TreeNode(3);
         root.right.left = new TreeNode(6);

         TreeNode root1 = new TreeNode(1);
         root1.left = new TreeNode(3);
         root1.left.right = new TreeNode(6);
         root1.right = new TreeNode(2);
         root1.right.left = new TreeNode(4);
         root1.right.right = new TreeNode(5);
         root1.right.right.left = new TreeNode(8);
         root1.right.right.right = new TreeNode(7);

         System.out.println("Flip Trees: "+ flipTrees(root, root1));
    }
}
