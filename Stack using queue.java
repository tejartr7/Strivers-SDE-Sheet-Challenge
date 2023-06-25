import java.util.*;
import java.io.*;

public class Stack {

    // Define the data members.
    Queue<Integer> a = new LinkedList<>();
    Queue<Integer> b = new LinkedList<>();
    int top;
    public Stack() {
        // Implement the Constructor.
    }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        return a.size();
        // Implement the getSize() function.
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return a.isEmpty() && b.isEmpty();
    }

    public void push(int x) {
        // Implement the push(element) function.
        a.add(x);
        top=x;
    }

    public int pop() {
        // Implement the pop() function.
        //int temp = 0;
        if (a.isEmpty() && b.isEmpty())
            return -1;
        while(a.size()>1)
        {
          top=a.remove();
          b.add(top);  
        }
        int x=a.peek();
        a.remove();
        Queue<Integer> temp=a;
        a=b;
        b=temp;
        return x;
    }

    public int top() {
        // Implement the top() function.
        return top;
    }
}
