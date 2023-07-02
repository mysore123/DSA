package trees;

public class CheckForBalancedTree {
    public static void main(String[] args) {
        TreeNode root = TreeOperations.createTree();
        System.out.println(checkForBalancedTree(root));
    }

    private static Boolean checkForBalancedTree(TreeNode root) {
        if (root == null) return true;
        return (
                Math.abs(heightOfTree(root.left) - heightOfTree(root.right)) <= 1
                && checkForBalancedTree(root.left) && checkForBalancedTree(root.right)
        );
    }

    private static int heightOfTree(TreeNode root) {
        if (root == null) return 0;
        else return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }
}


// TC : O(n^2)
