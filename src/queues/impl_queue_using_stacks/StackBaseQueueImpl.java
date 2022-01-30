package queues.impl_queue_using_stacks;

import java.util.Stack;

public class StackBaseQueueImpl implements StackBaseQueue {

    private Stack<Integer> sortedStack;
    private Stack<Integer> bufferStack;

    public StackBaseQueueImpl() {
        sortedStack = new Stack<>();
        bufferStack = new Stack<>();
    }

    @Override
    public void push(int num) {
        bufferStack.push(num);
    }

    @Override
    public int pop() {
        if (sortedStack.isEmpty()) {
            while (!bufferStack.isEmpty()) {
                sortedStack.push(bufferStack.pop());
            }
        }
        return sortedStack.pop();
    }

    @Override
    public int peek() {
        if (sortedStack.isEmpty()) {
            while (!bufferStack.isEmpty()) {
                sortedStack.push(bufferStack.pop());
            }
        }
        return sortedStack.peek();
    }

    @Override
    public boolean empty() {
        return sortedStack.isEmpty() && bufferStack.isEmpty();
    }
}
