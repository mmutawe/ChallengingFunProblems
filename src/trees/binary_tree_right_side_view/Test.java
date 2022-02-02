package trees.binary_tree_right_side_view;

import testsamples.trees.TreesTestSampleSML;

import java.util.Arrays;

import static testsamples.trees.TreesTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testBinaryTreeMaxDepthFinder() {
        BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideViewImpl();

        System.out.println("TREE_TEST_SAMPLE_NULL");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideView(TREE_TEST_SAMPLE_NULL)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_ONE_ELEMENT");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideView(TREE_TEST_SAMPLE_ONE_ELEMENT)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_1");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideView(TREE_TEST_SAMPLE_1)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_2");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideView(TREE_TEST_SAMPLE_2)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_3");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideView(TREE_TEST_SAMPLE_3)
                        .toArray())
        );
        System.out.println("--- --- ---");
    }

    private static void runAllTests() {
        testBinaryTreeMaxDepthFinder();
        System.out.println("-------------------------------");

    }
}
