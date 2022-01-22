package testsamples.linked_list;

import linked_lists.shared.ComplexListNode;

public class ComplexLinkedListTestSampleSML {

    public static final ComplexListNode LINKLIST_TEST_SAMPLE_NULL = null;

    public static final ComplexListNode LINKLIST_TEST_SAMPLE_NO_VALUES = new ComplexListNode();

    public static final ComplexListNode LINKLIST_TEST_SAMPLE_ONE = new ComplexListNode();

    public static final ComplexListNode LINKLIST_TEST_SAMPLE_NO_CHILDREN = new ComplexListNode();

    public static final ComplexListNode LINKLIST_TEST_SAMPLE_ALL_CHILDREN = new ComplexListNode();

    public static final ComplexListNode LINKLIST_TEST_SAMPLE_1 = new ComplexListNode();

    static {
        LINKLIST_TEST_SAMPLE_ONE.val = 1;

        ComplexListNode tmp = LINKLIST_TEST_SAMPLE_NO_CHILDREN;
        tmp.val = 1;
        tmp.next = new ComplexListNode();
        tmp.next.val = 2;
        tmp.next.next = new ComplexListNode();
        tmp.next.next.val = 3;
        tmp.next.prev = tmp;
        tmp.next.next.prev = tmp.next;

        tmp = null;
        tmp = LINKLIST_TEST_SAMPLE_ALL_CHILDREN;
        tmp.val = 1;
        tmp.child = new ComplexListNode();
        tmp.child.val = 2;
        tmp.child.child = new ComplexListNode();
        tmp.child.child.val = 3;

        //  1 --> 2 --> 3 --> null
        //        |
        //        4 --> 5 --> null
        //              |
        //              6 --> null
        tmp = null;
        tmp = LINKLIST_TEST_SAMPLE_1;
        tmp.val = 1;
        tmp.next = new ComplexListNode();
        tmp.next.val=2;
        tmp.next.prev=tmp;
        tmp.next.next = new ComplexListNode();
        tmp.next.next.val=3;
        tmp.next.next.prev=tmp.next;
        tmp.next.child = new ComplexListNode();
        tmp = tmp.next.child;
        tmp.val = 4;
        tmp.next = new ComplexListNode();
        tmp.next.val = 5;
        tmp.next.prev = tmp;
        tmp.next.child = new ComplexListNode();
        tmp.next.child.val = 6;
    }
}
