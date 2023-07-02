package trees;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = TreeOperations.createTree();
        TreeOperations.printLevelOrderTraversalOfTree(invertTree(root));
    }

    private static TreeNode invertTree(TreeNode root) {
        // Base cases
        if (root == null) return null;
        if (!root.hasLeft() && !root.hasRight()) return null; // If leaf node then return null

        TreeNode previousRight = root.right;
        TreeNode previousLeft = root.left;

        // else condition
        invertTree(root.left);
        invertTree(root.right);

        if (root.left == null) root.right = null;
        else root.right = previousLeft;

        if (root.right == null) root.left = null;
        else root.left = previousRight;

        return root;
    }
}
