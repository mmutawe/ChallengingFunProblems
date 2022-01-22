package linked_lists.doubly.flatten_multilevel_linked_list;

import linked_lists.shared.ComplexListNode;

import java.util.Objects;
import java.util.Stack;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class ComplexLinkListFlattenerImpl implements ComplexLinkListFlattener {
    // optimal Solution - iterative
    // Space: O(n) , Time: O(n)
    @Override
    public ComplexListNode flatten(ComplexListNode head) {
        if (isNull(head)) {
            return null;
        }

        Stack<ComplexListNode> parentSubsequents = new Stack<>();
        ComplexListNode pointer = head;

        while (nonNull(pointer.next) || nonNull(pointer.child) || !parentSubsequents.isEmpty()) {
            if (isNull(pointer.child)) {
                if (isNull(pointer.next) && !parentSubsequents.isEmpty()) {
                    ComplexListNode tmpParentSubsequent = parentSubsequents.pop();
                    pointer.next = tmpParentSubsequent;
                    tmpParentSubsequent.prev = pointer;
                    pointer = pointer.next;
                } else {
                    pointer = pointer.next;
                }
            } else {
                if (nonNull(pointer.next)) {
                    parentSubsequents.push(pointer.next);
                }
                pointer.next = pointer.child;
                pointer.next.prev = pointer;
                pointer.child = null;
                pointer = pointer.next;
            }
        }
        return head;
    }
}
