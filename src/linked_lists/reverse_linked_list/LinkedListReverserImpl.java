package linked_lists.reverse_linked_list;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class LinkedListReverserImpl implements LinkedListReverser{

    // optimal Solution - iterative
    // Space: O(1) , Time: O(n)
    @Override
    public ListNode reverseV1(ListNode head) {
        if (isNull(head)) {
            return null;
        }

        ListNode currNode = head;
        ListNode prevNode = null;
        ListNode nextNode;

        while(nonNull(currNode)){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
}
