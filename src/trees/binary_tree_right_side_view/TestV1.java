package trees.binary_tree_right_side_view;

import java.util.Arrays;

import static testsamples.trees.TreesTestSampleSML.*;

public class TestV1 {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testBinaryTreeMaxDepthFinderV1() {
        BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideViewImplV1();

        System.out.println("TREE_TEST_SAMPLE_NULL");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideViewV1(TREE_TEST_SAMPLE_NULL)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_ONE_ELEMENT");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideViewV1(TREE_TEST_SAMPLE_ONE_ELEMENT)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_1");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideViewV1(TREE_TEST_SAMPLE_1)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_2");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideViewV1(TREE_TEST_SAMPLE_2)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_3");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideViewV1(TREE_TEST_SAMPLE_3)
                        .toArray())
        );
        System.out.println("--- --- ---");
    }

    public static void testBinaryTreeMaxDepthFinderV2() {
        BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideViewImplV1();

        System.out.println("TREE_TEST_SAMPLE_NULL");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideViewV2(TREE_TEST_SAMPLE_NULL)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_ONE_ELEMENT");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideViewV2(TREE_TEST_SAMPLE_ONE_ELEMENT)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_1");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideViewV2(TREE_TEST_SAMPLE_1)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_2");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideViewV2(TREE_TEST_SAMPLE_2)
                        .toArray())
        );
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_3");
        System.out.println(
                Arrays.toString(binaryTreeRightSideView
                        .rightSideViewV2(TREE_TEST_SAMPLE_3)
                        .toArray())
        );
        System.out.println("--- --- ---");
    }

    private static void runAllTests() {
//        testBinaryTreeMaxDepthFinderV1();
//        System.out.println("-------------------------------");
        testBinaryTreeMaxDepthFinderV2();
        System.out.println("-------------------------------");

    }
}
