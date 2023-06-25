import java.util.*;
import java.io.*;

/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class LinkedListNode {
 * int data;
 * LinkedListNode next;
 * 
 * public LinkedListNode(int data) {
 * this.data = data;
 * }
 * }
 * 
 *****************************************************************/

public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        LinkedListNode curr = new LinkedListNode(-1);
        LinkedListNode temp = curr;
        int c = 0;
        while (head1 != null && head2 != null) {
            int sum = c + head1.data + head2.data;
            c = sum / 10;
            LinkedListNode dummy = new LinkedListNode(sum % 10);
            temp.next = dummy;
            temp = dummy;
            head1 = head1.next;
            head2 = head2.next;
        }
        while (head1 != null) {
            int sum = c + head1.data;
            c = sum / 10;
            LinkedListNode dummy = new LinkedListNode(sum % 10);
            temp.next = dummy;
            temp = dummy;
            head1 = head1.next;
        }
        while (head2 != null) {
            int sum = c + head2.data;
            c = sum / 10;
            LinkedListNode dummy = new LinkedListNode(sum % 10);
            temp.next = dummy;
            temp = dummy;
            head2 = head2.next;
        }
        if (c > 0) {
            LinkedListNode dummy = new LinkedListNode(c);
            temp.next = dummy;
            temp = dummy;
        }
        return curr.next;
    }
}
