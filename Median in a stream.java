import java.io.*;
import java.util.*;

public class Solution {
    public static int[] findMedian(int[] arr, int n) {
        // Write your code here.
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        int i;
        for (i = 0; i < n; i++) {
            max.add(arr[i]);
            min.add(max.poll());
            if (min.size() > max.size())
                max.add(min.poll());
            if (min.size() == max.size()) {
                arr[i] = (min.peek() + max.peek()) / 2;
            } else {
                arr[i] = max.peek();
            }
        }
        return arr;
    }
}
