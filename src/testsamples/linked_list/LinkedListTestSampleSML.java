package testsamples.linked_list;

import linked_lists.shared.ListNode;

public class LinkedListTestSampleSML {

    public static final ListNode LINKLIST_TEST_SAMPLE_NULL = null;
    public static final ListNode LINKLIST_TEST_SAMPLE_NO_VALUES = new ListNode();

    public static final ListNode LINKLIST_TEST_SAMPLE_ONE = new ListNode(1);

    public static final ListNode LINKLIST_TEST_SAMPLE_1 =
            new ListNode(1,
                    new ListNode(2,
                            new ListNode(3,
                                    new ListNode(4,
                                            new ListNode(5)))));

}
