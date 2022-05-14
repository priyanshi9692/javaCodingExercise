package Facebook.Trees;

public class SumOfAllTheLeafToRootPaths {
    public static int sum = 0;
    public static int sumPath(TreeNode root){
        if(root == null){
            return 0;
        }

        recursionOnTree(root, 0);
        return sum;
    }

    public static void recursionOnTree(TreeNode root, int num){
        if(root == null ){
            return;
        }

        int currNum = num*10 + root.val;
        if(root.left == null && root.right == null){
            sum+=currNum;
            return;
        }

        recursionOnTree(root.left, currNum);
        recursionOnTree(root.right, currNum);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);

        System.out.println("Root to leaf sum: "+ sumPath(root));
    }
}
