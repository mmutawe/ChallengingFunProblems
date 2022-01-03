package linked_lists.reverse_linked_list;

import linked_lists.shared.ListNode;

// Given:
//      - linked list of integers
// Constrains:
//      - if we received null or a single value we return it as it is
//      - no cycling
// TODO - Required:
//      return linked list in reverse
//      Ex: 1 --> 2 --> 3, ans: 3 --> 2 --> 1
public interface LinkedListReverser {
    ListNode reverse(ListNode head);
}
