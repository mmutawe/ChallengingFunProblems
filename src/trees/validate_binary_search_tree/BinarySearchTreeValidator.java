package trees.validate_binary_search_tree;

import trees.shared.TreeNode;

// Given:
//      A binary tree
// Constrains:
//      - if we receive a duplicate values, the tree is not valid.
//      - There is at least a one node in the tree
// TODO - Required:
//      determine if it is valid binary search tree (BST)
public interface BinarySearchTreeValidator {
    boolean isValidBST(TreeNode root);
}
