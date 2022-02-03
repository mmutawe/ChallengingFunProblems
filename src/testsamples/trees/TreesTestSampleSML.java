package testsamples.trees;

import trees.shared.TreeNode;

public class TreesTestSampleSML {


    public static final TreeNode TREE_TEST_SAMPLE_NULL;
    public static final TreeNode TREE_TEST_SAMPLE_ONE_ELEMENT;

    public static final TreeNode TREE_TEST_SAMPLE_1;
    public static final TreeNode TREE_TEST_SAMPLE_2;
    public static final TreeNode TREE_TEST_SAMPLE_3;

    public static final TreeNode TREE_TEST_SAMPLE_4;
    public static final TreeNode TREE_TEST_SAMPLE_5;
    public static final TreeNode TREE_TEST_SAMPLE_6;
    public static final TreeNode TREE_TEST_SAMPLE_7;

    public static final TreeNode TREE_TEST_SAMPLE_8;
    public static final TreeNode TREE_TEST_SAMPLE_9;
    public static final TreeNode TREE_TEST_SAMPLE_10;
    public static final TreeNode TREE_TEST_SAMPLE_11;

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

        //        _____1_____
        //    ___2___        3
        //   4       5
        TREE_TEST_SAMPLE_4 = new TreeNode(1);
        TREE_TEST_SAMPLE_4.left = new TreeNode(2);
        TREE_TEST_SAMPLE_4.right = new TreeNode(3);
        TREE_TEST_SAMPLE_4.left.left = new TreeNode(4);
        TREE_TEST_SAMPLE_4.left.right = new TreeNode(5);

        //        _____1_____
        //    ___2___     ___3
        //   4       5    6
        TREE_TEST_SAMPLE_5 = new TreeNode(1);
        TREE_TEST_SAMPLE_5.left = new TreeNode(2);
        TREE_TEST_SAMPLE_5.right = new TreeNode(3);
        TREE_TEST_SAMPLE_5.left.left = new TreeNode(4);
        TREE_TEST_SAMPLE_5.left.right = new TreeNode(5);
        TREE_TEST_SAMPLE_5.right.left = new TreeNode(6);

        //        _____1_____
        //    __2__        __3__
        //  _4_    5      6     7
        // 8  9
        //
        TREE_TEST_SAMPLE_6 = new TreeNode(1);
        TREE_TEST_SAMPLE_6.left = new TreeNode(2);
        TREE_TEST_SAMPLE_6.right = new TreeNode(3);
        TREE_TEST_SAMPLE_6.left.left = new TreeNode(4);
        TREE_TEST_SAMPLE_6.left.right = new TreeNode(5);
        TREE_TEST_SAMPLE_6.right.left = new TreeNode(6);
        TREE_TEST_SAMPLE_6.right.right = new TreeNode(7);
        TREE_TEST_SAMPLE_6.left.left.left = new TreeNode(8);
        TREE_TEST_SAMPLE_6.left.left.right = new TreeNode(9);

        //        _____1
        //       2
        TREE_TEST_SAMPLE_7 = new TreeNode(1);
        TREE_TEST_SAMPLE_7.left = new TreeNode(2);

        //        _____1_____
        //       2           3
        TREE_TEST_SAMPLE_8 = new TreeNode(1);
        TREE_TEST_SAMPLE_8.left = new TreeNode(2);
        TREE_TEST_SAMPLE_8.right = new TreeNode(3);

        //        _____5_____
        //       1        ___4___
        //                3     6
        TREE_TEST_SAMPLE_9 = new TreeNode(5);
        TREE_TEST_SAMPLE_9.left = new TreeNode(1);
        TREE_TEST_SAMPLE_9.right = new TreeNode(4);
        TREE_TEST_SAMPLE_9.right.left = new TreeNode(3);
        TREE_TEST_SAMPLE_9.right.right = new TreeNode(6);

        //        _____5_____
        //       4        ___6___
        //                3     7
        TREE_TEST_SAMPLE_10 = new TreeNode(5);
        TREE_TEST_SAMPLE_10.left = new TreeNode(4);
        TREE_TEST_SAMPLE_10.right = new TreeNode(6);
        TREE_TEST_SAMPLE_10.right.left = new TreeNode(3);
        TREE_TEST_SAMPLE_10.right.right = new TreeNode(7);

        //        _____4_____
        //       4        ___4___
        //                4     4
        TREE_TEST_SAMPLE_11 = new TreeNode(4);
        TREE_TEST_SAMPLE_11.left = new TreeNode(4);
        TREE_TEST_SAMPLE_11.right = new TreeNode(4);
        TREE_TEST_SAMPLE_11.right.left = new TreeNode(4);
        TREE_TEST_SAMPLE_11.right.right = new TreeNode(4);

    }
}
