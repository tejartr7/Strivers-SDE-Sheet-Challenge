
import java.util.*;
import java.io.*;

class Node {
    Node links[] = new Node[2]; 
    
    boolean containsKey(int ind) {
        return (links[ind] != null); 
    }
    Node get(int ind) {
        return links[ind]; 
    }
    void put(int ind, Node node) {
        links[ind] = node; 
    }
};
public class Solution 
{

	static Node root;
	public static int maxXOR(int n, int m, ArrayList<Integer> arr1, ArrayList<Integer> arr2) 
	{
	    // Write your code here.   
		root=new Node();
		int i,j;
		for(i=0;i<n;i++)
		{
			Node curr=root;
			for(j=31;j>=0;j--)
			{
				int a=(arr1.get(i)>>j)%2;
				if(!curr.containsKey(a))
				{
					curr.put(a,new Node());
				}
				curr=curr.get(a);
			}
		}
		int maxi=0;
		for(i=0;i<arr2.size();i++)
		{
			Node curr=root;
			int x=arr2.get(i);
			int temp=0;
			for(j=31;j>=0;j--)
			{
				int a=1-(arr2.get(i)>>j)%2;
				if(curr.containsKey(a))
				{
					curr=curr.get(a);
					temp|=(1<<j);
				}
				else
					curr=curr.get(1-a);
			}
			maxi=Math.max(maxi,temp);
		}
		return maxi;
			
	}
}
