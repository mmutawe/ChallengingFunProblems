package linked_lists.singly.reverse_linked_list_between_indices;

import linked_lists.shared.ListNode;

// Given:
//      - linked list of integers
//      - 2 numbers refer to: start & end
// Constrains:
//      - Its '1' index, not '0' index (counting start from 1)
//      - assume 1<= start <= end <= length
// TODO - Required:
//      return it back with only position start to end in reverse
//      Ex : 1 --> 2 --> 3 --> 4 --> 5, ( 2, 4 )
//      ans: 1 --> 4 --> 3 --> 2 --> 5
public interface LinkedListReverserRange {
    public ListNode reverseBetween(ListNode head, int start, int end);
}
