package linked_lists.singly.cycle_linked_list;

import linked_lists.shared.ListNode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static java.util.Objects.nonNull;

public class LinkedListCycleDetectorImpl implements LinkedListCycleDetector {

    // optimal Solution - iterative
    // Space: O(n) , Time: O(n)
    @Override
    public ListNode detectCycleV1(ListNode head) {

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

    // Floyd's Tortoise And Hare Algorithm
    // optimal Solution - iterative
    // Space: O(1) , Time: O(n)
    //                         ...-------; C
    // O-----------------------X-------; |
    //                         |       | |
    //                         |__Y____| |
    // SLOW distance = X +  Y      ...---;
    // FAST distance = 2 ( X + Y )
    // FAST cycling distance = 2 ( X + Y ) - ( X +  Y ) = n * C
    //                      --> X + Y = n * C
    //                      --> X = n * C - Y
    @Override
    public ListNode detectCycleV2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode headPointer = head;
        boolean hasCycle = false;

        while (nonNull(fast) && nonNull(fast.next)) {
            slow = slow.next;
            if (!hasCycle) {
                fast = fast.next.next;
                if (fast == slow) {
                    hasCycle = true;
                    if (head == slow) {
                        return head;
                    }
                }

            } else {
                headPointer = headPointer.next;
                if (headPointer == slow) {
                    return headPointer;
                }
            }
        }
        return null;
    }
}
