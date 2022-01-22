package linked_lists.doubly.flatten_multilevel_linked_list;

import linked_lists.shared.ComplexListNode;
import static java.util.Objects.nonNull;
import static testsamples.linked_list.ComplexLinkedListTestSampleSML.LINKLIST_TEST_SAMPLE_1;
import static testsamples.linked_list.ComplexLinkedListTestSampleSML.LINKLIST_TEST_SAMPLE_ALL_CHILDREN;
import static testsamples.linked_list.ComplexLinkedListTestSampleSML.LINKLIST_TEST_SAMPLE_NO_CHILDREN;
import static testsamples.linked_list.ComplexLinkedListTestSampleSML.LINKLIST_TEST_SAMPLE_NO_VALUES;
import static testsamples.linked_list.ComplexLinkedListTestSampleSML.LINKLIST_TEST_SAMPLE_NULL;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testComplexLinkFlattener() {
        ComplexLinkListFlattener flattener = new ComplexLinkListFlattenerImpl();

        System.out.println("LINKLIST_TEST_SAMPLE_NULL");
        printAllNodes(flattener.flatten(LINKLIST_TEST_SAMPLE_NULL));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_NO_VALUES");
        printAllNodes(flattener.flatten(LINKLIST_TEST_SAMPLE_NO_VALUES));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_NO_CHILDREN");
        printAllNodes(flattener.flatten(LINKLIST_TEST_SAMPLE_NO_CHILDREN));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_ALL_CHILDREN");
        printAllNodes(flattener.flatten(LINKLIST_TEST_SAMPLE_ALL_CHILDREN));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_1");
        printAllNodes(flattener.flatten(LINKLIST_TEST_SAMPLE_1));
        System.out.println();


    }

    public static void runAllTests() {
        testComplexLinkFlattener();
        System.out.println("-------------------------------");
    }

    private static void printAllNodes(ComplexListNode node) {

        ComplexListNode pointer = node;
        while (nonNull(pointer)) {
            System.out.print(pointer.val + " --> ");
            pointer = pointer.next;
        }
        System.out.println("null");
    }
}
