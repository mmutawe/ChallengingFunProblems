package linked_lists.singly.cycle_linked_list;

import linked_lists.shared.ListNode;

// Given:
//      - linked list of integers
// Constrains:
//      - The number of the nodes in the list is in the range [0, 104]
//      - -105 <= Node.val <= 105
// TODO - Required:
//      return the node where the cycle begins. If there is no cycle, return null.
//      Ex: 1 --> 2 --> 3 --> 2, ans: Node(2)
public interface LinkedListCycleDetector {
    ListNode detectCycle(ListNode head);
}
