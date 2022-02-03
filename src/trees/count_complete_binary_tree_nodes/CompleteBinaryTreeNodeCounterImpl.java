package trees.count_complete_binary_tree_nodes;

import trees.shared.TreeNode;

public class CompleteBinaryTreeNodeCounterImpl implements CompleteBinaryTreeNodeCounter {

    // Optimal Solution
    // Space: O(1), Time: O(logn^2)
    @Override
    public int countNodes(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int leftDepth = getLeftDepth(node);
        int rightDepth = getRightDepth(node);
        if(leftDepth == rightDepth) {
            return ((1 << leftDepth) - 1);
        }

        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    private int getLeftDepth(TreeNode root){
        int count = 0;
        while(root != null){
            count++;
            root = root.left;
        }
        return count;
    }

    private int getRightDepth(TreeNode root){
        int count = 0;
        while(root != null){
            count++;
            root = root.right;
        }
        return count;
    }
}
