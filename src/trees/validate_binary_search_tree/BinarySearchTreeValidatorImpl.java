package trees.validate_binary_search_tree;

import trees.shared.TreeNode;

public class BinarySearchTreeValidatorImpl implements BinarySearchTreeValidator {

    // Optimal Solution
    // Space: O(1), Time: O(n)
    @Override
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode node, long minVal, long maxVal) {
        if (node == null) {
            return true;
        }

        if (node.val >= maxVal || node.val <= minVal) {
            return false;
        }

        boolean isLeftValid = isValidBST(node.left, minVal, node.val);
        boolean isRightValid = isValidBST(node.right, node.val, maxVal);

        return isLeftValid && isRightValid;
    }
}
