import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        // Write your code here.
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i, n = price.size();
        for (i = 0; i < n; i++) {
            while (stack.peek() != -1) {
                if (price.get(stack.peek()) > price.get(i))
                    break;
                else
                    stack.pop();
            }
            ans.add(i - stack.peek());
            stack.push(i);
        }
        return ans;
    }
}
