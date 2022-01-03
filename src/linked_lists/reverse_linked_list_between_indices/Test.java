package linked_lists.reverse_linked_list_between_indices;

import linked_lists.shared.ListNode;

import static java.util.Objects.nonNull;

public class Test {

    public static void main(String[] args) {
        runAllTests();
    }

    public static void runAllTests() {
        System.out.println("-------------------------------");
    }

    private static void printAllNodes(ListNode node){
        ListNode pointer = node;
        while (nonNull(pointer)){
            System.out.print(pointer.val + " --> ") ;
            pointer = pointer.next;
        }
        System.out.println("null");
    }
}
