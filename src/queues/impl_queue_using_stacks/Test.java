package queues.impl_queue_using_stacks;

public class Test {
    public static void main(String[] args) {
        StackBaseQueue queue = new StackBaseQueueImpl();
        queue.push(1);
        System.out.println("push: " + 1);
        queue.push(2);
        System.out.println("push: " + 2);

        System.out.println("peek: " + queue.peek());
        System.out.println("pop: " + queue.pop());
        System.out.println("isEmpty: " + queue.empty());

        queue.push(3);
        System.out.println("push: " + 3);
        queue.push(4);
        System.out.println("push: " + 4);

        System.out.println("peek: " + queue.peek());
        System.out.println("pop: " + queue.pop());
        System.out.println("pop: " + queue.pop());
        System.out.println("pop: " + queue.pop());
        System.out.println("isEmpty: " + queue.empty());


    }
}
