import java.util.* ;
import java.io.*; 

public class Solution {

    static class MinStack {

        Stack<Integer> stack=new Stack<>();
        Stack<Integer> minStack=new Stack<>();
               // Constructor
        MinStack() {
            // Write your code here.
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            if(minStack.isEmpty())
            minStack.push(num);
            else
            {
                int x=Math.min(num,minStack.peek());
                minStack.push(x);
            }
            stack.push(num);
        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            if(stack.isEmpty())
            return -1;
            minStack.pop();
            return stack.pop();
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
            if(stack.isEmpty()) return -1;
            return stack.peek();
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            if(minStack.isEmpty()) return -1;
            return minStack.peek();
        }
    }
}
