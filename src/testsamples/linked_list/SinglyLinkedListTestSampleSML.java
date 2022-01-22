package testsamples.linked_list;

import linked_lists.shared.ListNode;

public class SinglyLinkedListTestSampleSML {

    public static final ListNode LINKLIST_TEST_SAMPLE_NULL = null;
    public static final ListNode LINKLIST_TEST_SAMPLE_NO_VALUES = new ListNode();

    public static final ListNode LINKLIST_TEST_SAMPLE_ONE = new ListNode(1);

    public static final ListNode LINKLIST_TEST_SAMPLE_1 =
            new ListNode(1,
                    new ListNode(2,
                            new ListNode(3,
                                    new ListNode(4,
                                            new ListNode(5)))));

    public static final ListNode LINKLIST_TEST_SAMPLE_2 =
            new ListNode(1,
                    new ListNode(2,
                            new ListNode(3,
                                    new ListNode(4,
                                            new ListNode(5)))));

    public static final ListNode LINKLIST_TEST_SAMPLE_3 =
            new ListNode(1,
                    new ListNode(2,
                            new ListNode(3,
                                    new ListNode(4,
                                            new ListNode(5)))));

    public static final ListNode LINKLIST_TEST_SAMPLE_4 =
            new ListNode(1,
                    new ListNode(2,
                            new ListNode(3,
                                    new ListNode(4,
                                            new ListNode(5)))));

    public static final ListNode CYCLE_LINKLIST_TEST_SAMPLE_1 =
            new ListNode(1,
                    new ListNode(2));

    public static final ListNode CYCLE_LINKLIST_TEST_SAMPLE_2 =
            new ListNode(3,
                    new ListNode(2,
                            new ListNode(0,
                                    new ListNode(-4))));

    static {
        ListNode tmp = CYCLE_LINKLIST_TEST_SAMPLE_1;
        tmp.next.next = tmp;

        tmp = CYCLE_LINKLIST_TEST_SAMPLE_2;
        tmp.next.next.next.next = tmp.next;
    }
}
