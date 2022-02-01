package trees.max_depth_of_binary_tree;

import java.util.Objects;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class BinaryTreeMaxDepthFinderImpl implements BinaryTreeMaxDepthFinder {

    // Optimal Solution
    // Space: O(1), Time: O(n)
    @Override
    public int findMaxDepth(TreeNode root) {

        if (isNull(root)) {
            return 0;
        }

        return findMaxDepth(root, 0, 0);
    }

    private int findMaxDepth(TreeNode node, int maxDepth, int currDepth) {
        currDepth++;
        if (currDepth > maxDepth) {
            maxDepth = currDepth;
        }

        if (nonNull(node.left)) {
            maxDepth = findMaxDepth(node.left, maxDepth, currDepth);
        }
        if (nonNull(node.right)) {
            maxDepth = findMaxDepth(node.right, maxDepth, currDepth);
        }

        return maxDepth;
    }


}
