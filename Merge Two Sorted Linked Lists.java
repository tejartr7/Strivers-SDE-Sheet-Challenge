import java.io.*;
import java.util.*;

/************************************************************
 * 
 * Following is the linked list node structure:
 * 
 * class LinkedListNode<T> {
 * T data;
 * LinkedListNode<T> next;
 * 
 * public LinkedListNode(T data) {
 * this.data = data;
 * }
 * }
 * 
 ************************************************************/

public class Solution {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> ans=new LinkedListNode(-1);
        LinkedListNode<Integer> h1=first,h2=second;
        LinkedListNode<Integer> temp=ans;
        while(h1!=null && h2!=null)
        {
            if(h1.data<h2.data)
            {
                temp.next=h1;
                temp=temp.next;
                h1=h1.next;
            }
            else
            {
                temp.next=h2;
                temp=temp.next;
                h2=h2.next;
            }
        }
        while(h1!=null)
        {
            temp.next=h1;
            temp=temp.next;
            h1=h1.next;
        }
        while(h2!=null)
        {
            temp.next=h2;
            temp=temp.next;
            h2=h2.next;
        }
        return ans.next;
	}
}
