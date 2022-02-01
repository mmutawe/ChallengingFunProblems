package trees.binary_tree_level_order_traversal;

import trees.shared.TreeNode;

import java.util.*;

public class NodeLevelOrderTraversalImpl implements NodeLevelOrderTraversal {

    // Optimal Solution - BFS
    // Space: O(n), Time: O(n)
    @Override
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traverseList = new ArrayList<>();
        if (root != null) {
            Queue<NodeWithLevel> queue = new LinkedList<>();
            queue.add(new NodeWithLevel(0, root));

            traverseList.add(List.of(root.val));
            levelOrder(queue, traverseList);
        }
        return traverseList;
    }

    private void levelOrder(Queue<NodeWithLevel> queue, List<List<Integer>> traverseList) {

        if (queue.isEmpty()) {
            return;
        }

        NodeWithLevel nodeWithLevel = queue.poll();
        TreeNode currNode = nodeWithLevel.node;
        int currLevel = nodeWithLevel.level + 1;

        List<Integer> tmpList = new ArrayList<>();

        if (currNode.left != null) {
            queue.add(new NodeWithLevel(currLevel, currNode.left));
            tmpList.add(currNode.left.val);
        }

        if (currNode.right != null) {
            queue.add(new NodeWithLevel(currLevel, currNode.right));
            tmpList.add(currNode.right.val);
        }

        if (!tmpList.isEmpty()) {
            if (traverseList.size() == currLevel) {
                traverseList.add(new ArrayList<>());
            }

            traverseList.get(currLevel).addAll(tmpList);

            for (int i = 0; i < tmpList.size(); i++) {
                levelOrder(queue, traverseList);
            }
        }
    }

    private class NodeWithLevel{
        int level;
        TreeNode node;

        public NodeWithLevel(int level, TreeNode node) {
            this.level = level;
            this.node = node;
        }
    }
}
