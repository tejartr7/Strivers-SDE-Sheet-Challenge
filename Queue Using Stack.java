import java.util.*;
import java.io.*;

public class Queue {
    // Define the data members(if any) here.
    Stack<Integer> a=new Stack<>();
    Stack<Integer> b=new Stack<>();
    Queue() {
        // Initialize your data structure here.
    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        a.push(val);
    }

    int deQueue() {
        // Implement the dequeue() function.
        if (a.isEmpty() && b.isEmpty())
            return -1;
        if (!b.isEmpty())
            return b.pop();
        while (!a.isEmpty())
            b.push(a.pop());
        return b.pop();
    }

    int peek() {
        // Implement the peek() function here.
        if (a.isEmpty() && b.isEmpty())
            return -1;
        if (!b.isEmpty())
            return b.peek();
        while (!a.isEmpty())
            b.push(a.pop());
        return b.peek();
    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return a.isEmpty() && b.isEmpty();
    }
}
