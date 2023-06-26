import java.util.*;

public class Solution {

    public static void findMedian(int arr[]) {

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int i, n = arr.length;
        for (i = 0; i < n; i++) {
            max.add(arr[i]);
            min.add(max.poll());
            if (max.size() < min.size())
                max.add(min.poll());
            if (min.size() == max.size()) {
                System.out.print((min.peek() + max.peek()) / 2+" "); // Print the median as a decimal value
            } else {
                System.out.print(max.peek()+" ");
            }
        }

    }

}
