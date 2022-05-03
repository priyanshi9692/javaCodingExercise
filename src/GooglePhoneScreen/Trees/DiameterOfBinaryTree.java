package GooglePhoneScreen.Trees;

public class DiameterOfBinaryTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
        TreeNode(){}
    }

    public static int diameter;
    public static int diameterOfBT(TreeNode root){
        diameter = 0;
        depthOfTree(root);
        return diameter;
    }

    public static int depthOfTree(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftH = depthOfTree(root.left);
        int rightH = depthOfTree(root.right);

        diameter = Math.max(leftH+rightH, diameter);

        return Math.max(leftH, rightH)+1;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        System.out.println("Diameter of the tree: "+ diameterOfBT(root));
    }
}
