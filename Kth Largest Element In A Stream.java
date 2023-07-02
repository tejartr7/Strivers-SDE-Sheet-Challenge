import java.util.* ;
import java.io.*; 
public class Kthlargest {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int k;
    Kthlargest(int k, int[] arr) {
        // Write your code here.
        this.k=k;
        for(int x:arr)
        {
            while(pq.size()>k)
            pq.poll();
            pq.offer(x);
        }
    }

    void add(int num) {
        // Write your code here.
        pq.offer(num);
        while(pq.size()>k)
        pq.poll();
    }

    int getKthLargest() {
        // Write your code here.
        return pq.peek();
    }
}
