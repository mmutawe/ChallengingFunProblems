package linked_lists.singly.cycle_linked_list;

import linked_lists.shared.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleDetectorImpl implements LinkedListCycleDetector {

    // optimal Solution - iterative
    // Space: O(1) , Time: O(n)
    @Override
    public ListNode detectCycle(ListNode head) {

        ListNode pointer = head;
        Set<ListNode> nodeReference = new HashSet<>();

        while (pointer != null) {
            if (nodeReference.contains(pointer)) {
                return pointer;
            }

            nodeReference.add(pointer);
            pointer = pointer.next;
        }
        return null;
    }
}
