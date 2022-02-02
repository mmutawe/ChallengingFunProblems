package trees.binary_tree_right_side_view;

import trees.shared.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideViewImpl implements BinaryTreeRightSideView {

    // using BFS (Iterative)
    // Space: O(n), Time: O(n)
    @Override
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> sideViewNodesValues = new ArrayList<>();
        if (root == null) {
            return sideViewNodesValues;
        }

        int maxDepth = 0;
        Queue<NodeWithLevel> queue = new LinkedList<>();
        queue.add(new NodeWithLevel(1, root));
        while (!queue.isEmpty()) {
            NodeWithLevel nodeWithLevel = queue.poll();
            if (nodeWithLevel.level > maxDepth) {
                maxDepth = nodeWithLevel.level;
                sideViewNodesValues.add(nodeWithLevel.node.val);
            }

            if (nodeWithLevel.node.right != null) {
                queue.add(new NodeWithLevel(nodeWithLevel.level + 1, nodeWithLevel.node.right));
            }
            if (nodeWithLevel.node.left != null) {
                queue.add(new NodeWithLevel(nodeWithLevel.level + 1, nodeWithLevel.node.left));
            }
        }
        return sideViewNodesValues;
    }

    private class NodeWithLevel {
        int level;
        TreeNode node;

        public NodeWithLevel(int level, TreeNode node) {
            this.level = level;
            this.node = node;
        }
    }
}
