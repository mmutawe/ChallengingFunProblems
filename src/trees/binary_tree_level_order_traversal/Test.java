package trees.binary_tree_level_order_traversal;

import testsamples.trees.TreesTestSampleSML;

import java.util.Arrays;
import java.util.List;

import static testsamples.trees.TreesTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testBinaryTreeMaxDepthFinder() {
        NodeLevelOrderTraversal nodeLevelOrderTraversal = new NodeLevelOrderTraversalImpl();

        System.out.println("TREE_TEST_SAMPLE_NULL");
        printListOfList( nodeLevelOrderTraversal.levelOrder(TREE_TEST_SAMPLE_NULL));
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_ONE_ELEMENT");
        printListOfList( nodeLevelOrderTraversal.levelOrder(TREE_TEST_SAMPLE_ONE_ELEMENT));
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_1");
        printListOfList( nodeLevelOrderTraversal.levelOrder(TREE_TEST_SAMPLE_1));
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_2");
        printListOfList( nodeLevelOrderTraversal.levelOrder(TREE_TEST_SAMPLE_2));
        System.out.println("--- --- ---");

        System.out.println("TREE_TEST_SAMPLE_3");
        printListOfList( nodeLevelOrderTraversal.levelOrder(TREE_TEST_SAMPLE_3));
        System.out.println("--- --- ---");

    }

    private static void runAllTests() {
        testBinaryTreeMaxDepthFinder();
        System.out.println("-------------------------------");

    }

    private static void printListOfList(List<List<Integer>> list){

        System.out.println("result: ");
        if (list.isEmpty()){
            System.out.println("List is empty");
        }

        list.forEach(
                l -> {
                    l.forEach(e -> System.out.print(e + " "));
                    System.out.println();
                }
        );

    }


}
