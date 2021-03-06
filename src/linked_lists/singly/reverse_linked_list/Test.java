package linked_lists.singly.reverse_linked_list;

import linked_lists.shared.ListNode;

import static java.util.Objects.nonNull;
import static testsamples.linked_list.SinglyLinkedListTestSampleSML.LINKLIST_TEST_SAMPLE_1;
import static testsamples.linked_list.SinglyLinkedListTestSampleSML.LINKLIST_TEST_SAMPLE_NO_VALUES;
import static testsamples.linked_list.SinglyLinkedListTestSampleSML.LINKLIST_TEST_SAMPLE_NULL;
import static testsamples.linked_list.SinglyLinkedListTestSampleSML.LINKLIST_TEST_SAMPLE_ONE;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testLinkListReverserV1() {

        LinkedListReverser linkedListReverser = new LinkedListReverserImpl();

        printAllNodes(LINKLIST_TEST_SAMPLE_NULL);
        printAllNodes(linkedListReverser.reverse(LINKLIST_TEST_SAMPLE_NULL));
        System.out.println();

        printAllNodes(LINKLIST_TEST_SAMPLE_NO_VALUES);
        printAllNodes(linkedListReverser.reverse(LINKLIST_TEST_SAMPLE_NO_VALUES));
        System.out.println();

        printAllNodes(LINKLIST_TEST_SAMPLE_ONE);
        printAllNodes(linkedListReverser.reverse(LINKLIST_TEST_SAMPLE_ONE));
        System.out.println();

        printAllNodes(LINKLIST_TEST_SAMPLE_1);
        printAllNodes(linkedListReverser.reverse(LINKLIST_TEST_SAMPLE_1));
        System.out.println();


    }
    public static void runAllTests() {
        testLinkListReverserV1();
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
