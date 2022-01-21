package linked_lists.doubly.flatten_multilevel_linked_list;

import linked_lists.shared.ComplexListNode;

// Given:
//      - doubly linked list of integers
//      - list nodes also have a child property; which can point to a separate doubly linked list
//      - Child lists can also have one or more child doubly linked lists of their own, and so on
// Constrains:
//      - Every list node can have a multiple levels of children
//          ( any number of list nodes at any level can have any level of children)
//      - After flattening, set all child property values to null
// TODO - Required:
//      return the list as a single level flattened doubly linked list
//      Ex: 1 --> 2 --> 3 --> null          ans: 1 --> 2 --> 4 --> 6 --> 5 --> 3
//                |
//                4 --> 5 --> null
//                      |
//                      6 --> null
public interface ComplexLinkListFlattener {
    ComplexListNode flatten(ComplexListNode head);
}
