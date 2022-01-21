package linked_lists.doubly.flatten_multilevel_linked_list;

import linked_lists.shared.ComplexListNode;
import linked_lists.shared.ListNode;

import static java.util.Objects.nonNull;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void runAllTests() {
        System.out.println("-------------------------------");
    }

    private static void printAllNodes(ComplexListNode node){

        ComplexListNode pointer = node;
        while (nonNull(pointer)){
            System.out.print(pointer.val + " --> ") ;
            pointer = pointer.next;
        }
        System.out.println("null");
    }
}
