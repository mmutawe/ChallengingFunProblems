package trees.binary_tree_level_order_traversal;

import trees.shared.TreeNode;

import java.util.List;

// Given:
//      A binary tree
// Constrains:
//      - if tree is empty return empty array
// TODO - Required:
//      return the level order traversal of the nodes values as an array
//      ( i.e., from left to right, level by level )
public interface NodeLevelOrderTraversal {
    List<List<Integer>> levelOrder(TreeNode root);
}
