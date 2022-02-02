package trees.count_complete_binary_tree_nodes;

import trees.shared.TreeNode;

// Given:
//      the root of a complete binary tree
// Constrains:
//      - if no values in tree return 0
// TODO - Required:
//      Return the number of the nodes in the tree
public interface CompleteBinaryTreeNodeCounter {
    int countNodes(TreeNode root);
}
