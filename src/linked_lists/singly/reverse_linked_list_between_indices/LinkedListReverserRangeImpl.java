package linked_lists.singly.reverse_linked_list_between_indices;

import linked_lists.shared.ListNode;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class LinkedListReverserRangeImpl implements LinkedListReverserRange {


    // optimal Solution - iterative
    // Space: O(1) , Time: O(n)
    @Override
    public ListNode reverseBetween(ListNode head, int start, int end) {
        if (isNull(head)) {
            return null;
        }

        int counter = 1;
        ListNode currNode = head;
        ListNode prevNode = new ListNode();
        ListNode nextNode = new ListNode();
        ListNode prevSwapNode = new ListNode();
        prevSwapNode.next = head;

        while (nonNull(currNode)) {

            if (counter == start - 1) {
                prevSwapNode = currNode;
            }

            if (counter >= start && counter <= end) {
                nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            } else {
                currNode = currNode.next;
            }

            if (counter == end) {
                prevSwapNode.next.next = nextNode;
                prevSwapNode.next = prevNode;
                if (start == 1) {
                    head = prevNode;
                }
                break;
            }

            counter++;
        }
        return head;
    }
}
