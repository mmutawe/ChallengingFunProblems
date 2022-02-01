package trees.max_depth_of_binary_tree;

import testsamples.trees.TreesTestSampleSML;

import static testsamples.trees.TreesTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }


    public static void testBinaryTreeMaxDepthFinder() {
        BinaryTreeMaxDepthFinder binaryTreeMaxDepthFinder = new BinaryTreeMaxDepthFinderImpl();

        System.out.println("TREE_TEST_SAMPLE_NULL");
        System.out.println("tree depth: " + binaryTreeMaxDepthFinder.findMaxDepth(TREE_TEST_SAMPLE_NULL));

        System.out.println("TREE_TEST_SAMPLE_ONE_ELEMENT");
        System.out.println("tree depth: " + binaryTreeMaxDepthFinder.findMaxDepth(TREE_TEST_SAMPLE_ONE_ELEMENT));

        System.out.println("TREE_TEST_SAMPLE_1");
        System.out.println("tree depth: " + binaryTreeMaxDepthFinder.findMaxDepth(TREE_TEST_SAMPLE_1));

        System.out.println("TREE_TEST_SAMPLE_2");
        System.out.println("tree depth: " + binaryTreeMaxDepthFinder.findMaxDepth(TREE_TEST_SAMPLE_2));

    }

    public static void runAllTests() {
        testBinaryTreeMaxDepthFinder();
        System.out.println("-------------------------------");

    }
}
