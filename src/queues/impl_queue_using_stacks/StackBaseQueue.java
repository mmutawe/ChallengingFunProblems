package queues.impl_queue_using_stacks;

// Given:
//      Stacks
// Constrains:
//      - implementation queue using stacks could affect time complexity
// TODO - Required:
//      Implement a custom Queue using stacks.
//      Queue methods to implement are enqueue, dequeue, peek, and empty
public interface StackBaseQueue {
    void push();
    int pop();
    int peek();
    boolean empty();
}
