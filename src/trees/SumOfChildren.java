package trees;

public class SumOfChildren {

    public static void main(String[] args) {
        TreeNode root = TreeOperations.createTree();
        System.out.println(sumOfChildren(root) == root.val);
    }

    private static int sumOfChildren(TreeNode root) {
        if (root == null) return 0;
        if (!root.hasRight() && !root.hasLeft()) {
            return root.val;
        }
        else return sumOfChildren(root.left) + sumOfChildren(root.right);
    }


}
