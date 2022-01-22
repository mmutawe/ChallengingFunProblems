package linked_lists.singly.cycle_linked_list;

import static testsamples.linked_list.SinglyLinkedListTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testLinkListCycleDetectorV1() {

        LinkedListCycleDetector cycleDetector = new LinkedListCycleDetectorImpl();

        System.out.println("LINKLIST_TEST_SAMPLE_NULL");
        System.out.println(cycleDetector.detectCycleV1(LINKLIST_TEST_SAMPLE_NULL));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_NO_VALUES");
        System.out.println(cycleDetector.detectCycleV1(LINKLIST_TEST_SAMPLE_NO_VALUES));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_ONE");
        System.out.println(cycleDetector.detectCycleV1(LINKLIST_TEST_SAMPLE_ONE));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_1");
        System.out.println(cycleDetector.detectCycleV1(LINKLIST_TEST_SAMPLE_1));
        System.out.println();

        System.out.println("CYCLE_LINKLIST_TEST_SAMPLE_1");
        System.out.println(cycleDetector.detectCycleV1(CYCLE_LINKLIST_TEST_SAMPLE_1).val);
        System.out.println();

        System.out.println("CYCLE_LINKLIST_TEST_SAMPLE_2");
        System.out.println(cycleDetector.detectCycleV1(CYCLE_LINKLIST_TEST_SAMPLE_2).val);
        System.out.println();

    }

    public static void testLinkListCycleDetectorV2() {

        LinkedListCycleDetector cycleDetector = new LinkedListCycleDetectorImpl();

        System.out.println("LINKLIST_TEST_SAMPLE_NULL");
        System.out.println(cycleDetector.detectCycleV2(LINKLIST_TEST_SAMPLE_NULL));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_NO_VALUES");
        System.out.println(cycleDetector.detectCycleV2(LINKLIST_TEST_SAMPLE_NO_VALUES));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_ONE");
        System.out.println(cycleDetector.detectCycleV2(LINKLIST_TEST_SAMPLE_ONE));
        System.out.println();

        System.out.println("LINKLIST_TEST_SAMPLE_1");
        System.out.println(cycleDetector.detectCycleV2(LINKLIST_TEST_SAMPLE_1));
        System.out.println();

        System.out.println("CYCLE_LINKLIST_TEST_SAMPLE_1");
        System.out.println(cycleDetector.detectCycleV2(CYCLE_LINKLIST_TEST_SAMPLE_1).val);
        System.out.println();

        System.out.println("CYCLE_LINKLIST_TEST_SAMPLE_2");
        System.out.println(cycleDetector.detectCycleV2(CYCLE_LINKLIST_TEST_SAMPLE_2).val);
        System.out.println();

    }

    public static void runAllTests() {
        testLinkListCycleDetectorV1();
        System.out.println("-------------------------------");
        testLinkListCycleDetectorV2();
        System.out.println("-------------------------------");
    }
}
