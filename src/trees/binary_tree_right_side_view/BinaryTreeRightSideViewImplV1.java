package trees.binary_tree_right_side_view;

import trees.shared.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideViewImplV1 implements BinaryTreeRightSideView {

    // using BFS (Iterative)
    // Space: O(n), Time: O(n)
    @Override
    public List<Integer> rightSideViewV1(TreeNode root) {

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

    // optimal solution
    // using BFS (Iterative)
    // Space: O(n), Time: O(n)
    @Override
    public List<Integer> rightSideViewV2(TreeNode root) {
        List<Integer> sideViewNodesValues = new ArrayList<>();
        if (root == null) {
            return sideViewNodesValues;
        }

        int nodesPerLevelCounter=1;
        int maxDepth = 0;
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            if (depth > maxDepth) {
                maxDepth = depth;
                sideViewNodesValues.add(currNode.val);
            }

            if (currNode.right != null) {
                queue.add(currNode.right);
            }
            if (currNode.left != null) {
                queue.add(currNode.left);
            }

            nodesPerLevelCounter--;
            if (nodesPerLevelCounter==0){
                nodesPerLevelCounter = queue.size();
                depth++;
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
