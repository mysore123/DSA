package trees;

import java.util.*;

public class TreeOperations {
    public static void main(String[] args) {
        TreeNode root = createTree();
        printLevelOrderTraversalOfTree(root);
    }

    public static void printLevelOrderTraversalOfTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode removedTreeNode = queue.poll();
                System.out.print(removedTreeNode.val + " ");
                if (removedTreeNode.hasLeft()) queue.add(removedTreeNode.left);
                if (removedTreeNode.hasRight()) queue.add(removedTreeNode.right);
            }
            System.out.println();
        }
    }

    public static TreeNode createTree() {
        TreeNode root = new TreeNode(3);
        TreeNode left  = new TreeNode();
        root.setLeft(left, 1);
        left.setLeft(new TreeNode(), 10);
        TreeNode right  = new TreeNode();
        root.setRight(right, 2);
        right.setRight(new TreeNode(), 4);
        right.setLeft(new TreeNode(), 5);
        return root;
    }
}
