package linked_lists.singly.cycle_linked_list;

import testsamples.linked_list.SinglyLinkedListTestSampleSML;

import static testsamples.linked_list.SinglyLinkedListTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

     public static void testLinkListCycleDetector() {

        LinkedListCycleDetector cycleDetector = new LinkedListCycleDetectorImpl();

        System.out.println("LINKLIST_TEST_SAMPLE_NULL");
        System.out.println(cycleDetector.detectCycle(LINKLIST_TEST_SAMPLE_NULL));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_NO_VALUES");
        System.out.println(cycleDetector.detectCycle(LINKLIST_TEST_SAMPLE_NO_VALUES));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_ONE");
        System.out.println(cycleDetector.detectCycle(LINKLIST_TEST_SAMPLE_ONE));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_1");
        System.out.println(cycleDetector.detectCycle(LINKLIST_TEST_SAMPLE_1));
        System.out.println();

        System.out.println("CYCLE_LINKLIST_TEST_SAMPLE_1");
        System.out.println(cycleDetector.detectCycle(CYCLE_LINKLIST_TEST_SAMPLE_1).val);
        System.out.println();

        System.out.println("CYCLE_LINKLIST_TEST_SAMPLE_2");
        System.out.println(cycleDetector.detectCycle(CYCLE_LINKLIST_TEST_SAMPLE_2).val);
        System.out.println();

    }

    public static void runAllTests() {
        testLinkListCycleDetector();
        System.out.println("-------------------------------");
    }
}
