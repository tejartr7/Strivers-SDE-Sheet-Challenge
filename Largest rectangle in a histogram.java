import java.util.*;
import java.io.*;

public class Solution {
  public static int largestRectangleArea(int[] h) {
    int ans = 0;
    int i, n = h.length;
    Stack<Integer> stack = new Stack<>();
    int s[] = new int[n];
    int e[] = new int[n];
    for (i = n - 1; i >= 0; i--) {
      if (stack.isEmpty()) {
        s[i] = -1;
      } else {
        while (!stack.isEmpty()) {
          if (h[stack.peek()] >= h[i])
            stack.pop();
          else
            break;
        }
        if (stack.isEmpty())
          s[i] = -1;
        else
          s[i] = stack.peek();
      }
      stack.push(i);
    }
    while (!stack.isEmpty())
      stack.pop();
    for (i = 0; i < n; i++) {
      if (stack.isEmpty()) {
        e[i] = -1;
      } else {
        while (!stack.isEmpty()) {
          if (h[stack.peek()] >= h[i])
            stack.pop();
          else
            break;
        }
        if (stack.isEmpty())
          e[i] = -1;
        else
          e[i] = stack.peek();
      }
      stack.push(i);
    }
    for (i = 0; i < n; i++) {
      int x;
      if (s[i] == -1) {
        s[i] = n;
      }
      x = s[i] - e[i] - 1;
      ans = Math.max(h[i] * x, ans);
      // System.out.println(s[i]);
    }
    return ans;
  }

  public static int largestRectangle(ArrayList<Integer> heights) {
    // Write your code here.
    int temp[] = new int[heights.size()];
    int i, n = heights.size();
    for (i = 0; i < n; i++) {
      temp[i] = heights.get(i);
    }
    return largestRectangleArea(temp);
  }
}
