package trees.binary_tree_right_side_view;

import trees.shared.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideViewImplV2 implements BinaryTreeRightSideView {

    // using DFS
    // Space: O(n), Time: O(n)
    @Override
    public List<Integer> rightSideViewV1(TreeNode root) {
        List<Integer> sideViewNodesValues = new ArrayList<>();
        if (root != null) {
            rightSideViewDFS(root, sideViewNodesValues, 1);
        }

        return sideViewNodesValues;
    }

    private void rightSideViewDFS(TreeNode node, List<Integer> sideViewNodesValues, int depth) {
        if (depth > sideViewNodesValues.size()) {
            sideViewNodesValues.add(node.val);
        }

        if (node.right != null) {
            rightSideViewDFS(node.right, sideViewNodesValues, depth + 1);
        }
        if (node.left != null) {
            rightSideViewDFS(node.left, sideViewNodesValues, depth + 1);
        }
    }


    @Override
    public List<Integer> rightSideViewV2(TreeNode root) {
        return null;
    }
}
