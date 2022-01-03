package linked_lists.reverse_linked_list_between_indices;

import linked_lists.shared.ListNode;

import static java.util.Objects.nonNull;
import static testsamples.linked_list.LinkedListTestSampleSML.*;

public class Test {

    public static void main(String[] args) {
        runAllTests();
    }

    public static void testLinkListReverserRange() {

        LinkedListReverserRange linkedListReverserRange = new LinkedListReverserRangeImpl();

        printAllNodes(LINKLIST_TEST_SAMPLE_NULL);
        printAllNodes(linkedListReverserRange.reverseBetween(LINKLIST_TEST_SAMPLE_NULL,0,0));
        System.out.println();

        printAllNodes(LINKLIST_TEST_SAMPLE_NO_VALUES);
        printAllNodes(linkedListReverserRange.reverseBetween(LINKLIST_TEST_SAMPLE_NO_VALUES,0,0));
        System.out.println();

        printAllNodes(LINKLIST_TEST_SAMPLE_ONE);
        printAllNodes(linkedListReverserRange.reverseBetween(LINKLIST_TEST_SAMPLE_ONE,1,1));
        System.out.println();


        System.out.println("start: " + 2 + ", end: " + 4);
        printAllNodes(LINKLIST_TEST_SAMPLE_1);
        printAllNodes(linkedListReverserRange.reverseBetween(LINKLIST_TEST_SAMPLE_1,2,4));
        System.out.println();

        System.out.println("start: " + 1 + ", end: " + 3);
        printAllNodes(LINKLIST_TEST_SAMPLE_2);
        printAllNodes(linkedListReverserRange.reverseBetween(LINKLIST_TEST_SAMPLE_2,1,3));
        System.out.println();

        System.out.println("start: " + 3 + ", end: " + 5);
        printAllNodes(LINKLIST_TEST_SAMPLE_3);
        printAllNodes(linkedListReverserRange.reverseBetween(LINKLIST_TEST_SAMPLE_3,3,5));
        System.out.println();

        System.out.println("start: " + 1 + ", end: " + 5);
        printAllNodes(LINKLIST_TEST_SAMPLE_4);
        printAllNodes(linkedListReverserRange.reverseBetween(LINKLIST_TEST_SAMPLE_4,1,5));
        System.out.println();

    }

    public static void runAllTests() {
        testLinkListReverserRange();
        System.out.println("-------------------------------");
    }

    private static void printAllNodes(ListNode node){
        ListNode pointer = node;
        while (nonNull(pointer)){
            System.out.print(pointer.val + " --> ") ;
            pointer = pointer.next;
        }
        System.out.println("null");
    }
}
