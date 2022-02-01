package trees.max_depth_of_binary_tree;


import trees.shared.TreeNode;

// Given:
//      A binary tree
// Constrains:
//      - if tree is empty return zero
// TODO - Required:
//      find its maximum depth.
//      ( Maximum depth is the number of nodes along the longest path from the root node
//        to the furthest leaf node )
public interface BinaryTreeMaxDepthFinder {
    int findMaxDepth(TreeNode root);
}
