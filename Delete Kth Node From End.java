/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int k)
    {
        // Write your code here.
        Node temp=head;
        int cnt=0;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        if(k==cnt) return head.next;
        int x=0;
        temp=head;
        while(x<cnt-k-1)
        {
            x++;
            temp=temp.next;
        }
        if(temp!=null && temp.next!=null)
        temp.next=temp.next.next;
        return head;
    }
}
