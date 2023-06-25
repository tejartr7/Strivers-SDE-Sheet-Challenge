public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		String temp[]=str.split(" ");
		String ans="";
		int i,n=temp.length;
		for(i=0;i<n;i++)
		{
			if(temp[i].equals(" "))
			continue;
			else ans=temp[i]+" "+ans;
		}
		return ans;
	}
}
