package testsamples.trees;

import trees.shared.TreeNode;

public class TreesTestSampleSML {


    public static final TreeNode TREE_TEST_SAMPLE_NULL;
    public static final TreeNode TREE_TEST_SAMPLE_ONE_ELEMENT;

    public static final TreeNode TREE_TEST_SAMPLE_1;
    public static final TreeNode TREE_TEST_SAMPLE_2;
    public static final TreeNode TREE_TEST_SAMPLE_3;

    static {
        TREE_TEST_SAMPLE_NULL = null;
        TREE_TEST_SAMPLE_ONE_ELEMENT = new TreeNode(1);

        //       ___1___
        //      2     __3__
        //           4     5
        TREE_TEST_SAMPLE_1 = new TreeNode(1);
        TREE_TEST_SAMPLE_1.left = new TreeNode(2);
        TREE_TEST_SAMPLE_1.right = new TreeNode(3);
        TREE_TEST_SAMPLE_1.right.left = new TreeNode(4);
        TREE_TEST_SAMPLE_1.right.right = new TreeNode(5);

        //       ____1____
        //    ___2___     3
        //   4__    5
        //     6__
        //        7
        TREE_TEST_SAMPLE_2 = new TreeNode(1);
        TREE_TEST_SAMPLE_2.right = new TreeNode(3);
        TREE_TEST_SAMPLE_2.left = new TreeNode(2);

        TREE_TEST_SAMPLE_2.left.right = new TreeNode(5);
        TREE_TEST_SAMPLE_2.left.left = new TreeNode(4);

        TREE_TEST_SAMPLE_2.left.left.right = new TreeNode(6);
        TREE_TEST_SAMPLE_2.left.left.right.right = new TreeNode(7);

        //        _____1_____
        //    ___2___     ___3___
        //   4     null  null    5

        TREE_TEST_SAMPLE_3 = new TreeNode(1);
        TREE_TEST_SAMPLE_3.left = new TreeNode(2);
        TREE_TEST_SAMPLE_3.right = new TreeNode(3);
        TREE_TEST_SAMPLE_3.left.left = new TreeNode(4);
        TREE_TEST_SAMPLE_3.right.right = new TreeNode(5);
    }
}
