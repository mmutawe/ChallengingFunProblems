package linked_lists.reverse_linked_list;

import java.util.LinkedList;

// Given:
//      - linked list of integers
// Constrains:
//      - if we received null or a single value we return it as it is
//      - no cycling
// TODO - Required:
//      return linked list in reverse
//      Ex: 1 --> 2 --> 3, ans: 3 --> 2 --> 1
public interface LinkedListReverser {
    ListNode reverseV1(ListNode head);
}
