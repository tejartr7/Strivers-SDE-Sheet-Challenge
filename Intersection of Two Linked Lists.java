
/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * }
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * }
 * }
 * 
 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        // Write your code here
        Node h1 = firstHead;
        Node h2 = secondHead;
        while (h1 != h2) {
            h1 = h1.next;
            h2 = h2.next;
            if (h1 == null)
                h1 = secondHead;
            if (h2 == null)
                h2 = firstHead;
        }
        if (h1 == null)
            return 0;
        return h1.data;
    }
}
