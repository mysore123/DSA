package trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right)
    {
        this.val = val;
        this.right = right;
        this.left = left;
    }


    public void setLeft(TreeNode left, int data) {
        this.left = left;
        this.left.val = data;
    }

    public void setRight(TreeNode right, int data) {
        this.right = right;
        this.right.val = data;
    }

    public Boolean hasLeft() {
        return this.left != null;
    }

    public Boolean hasRight() {
        return this.right != null;
    }

}
