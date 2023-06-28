import java.util.*;
import java.io.*;

public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
    // Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        // Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i;
        List<Integer> list = new ArrayList<>();
        for (i = 0; i < n; i++) {
            int x = q[i][0];
            if (x == 0)
                pq.offer(q[i][1]);
            else
                list.add(pq.poll());
        }
        int x[] = new int[list.size()];
        i = 0;
        for (int t : list)
            x[i++] = t;
        return x;
    }
}
