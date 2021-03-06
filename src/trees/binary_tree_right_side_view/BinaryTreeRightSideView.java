package trees.binary_tree_right_side_view;

import trees.shared.TreeNode;

import java.util.List;
// Given:
//      A binary tree
// Constrains:
//      - if no values in tree return null
//
// TODO - Required:
//      Return an array of the values of the nodes you can see from the right side of tree
//      ordered from top to bottom
//      Ex:
//          ___(1)___
//      ___2___     (3)     ---> ans: { 1, 3, 5, 6, 7 }
//     4__    (5)
//       (6)_
//          (7)
public interface BinaryTreeRightSideView {
    List<Integer> rightSideViewV1(TreeNode root);
    List<Integer> rightSideViewV2(TreeNode root);
}
