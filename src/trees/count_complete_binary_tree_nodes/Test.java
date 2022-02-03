package trees.count_complete_binary_tree_nodes;

import testsamples.trees.TreesTestSampleSML;

import static testsamples.trees.TreesTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testCompleteBinaryTreeNodeCounter() {
        CompleteBinaryTreeNodeCounter completeBinaryTreeNodeCounter = new CompleteBinaryTreeNodeCounterImpl();

        System.out.println("TREE_TEST_SAMPLE_NULL");
        System.out.println("nodes count: " + completeBinaryTreeNodeCounter.countNodes(TREE_TEST_SAMPLE_NULL));
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_ONE_ELEMENT");
        System.out.println("nodes count: " + completeBinaryTreeNodeCounter.countNodes(TREE_TEST_SAMPLE_ONE_ELEMENT));
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_4");
        System.out.println("nodes count: " + completeBinaryTreeNodeCounter.countNodes(TREE_TEST_SAMPLE_4));
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_5");
        System.out.println("nodes count: " + completeBinaryTreeNodeCounter.countNodes(TREE_TEST_SAMPLE_5));
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_6");
        System.out.println("nodes count: " + completeBinaryTreeNodeCounter.countNodes(TREE_TEST_SAMPLE_6));
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_7");
        System.out.println("nodes count: " + completeBinaryTreeNodeCounter.countNodes(TREE_TEST_SAMPLE_7));
        System.out.println("--- --- ---");

    }

    private static void runAllTests() {
        testCompleteBinaryTreeNodeCounter();
        System.out.println("-------------------------------");
    }
}
