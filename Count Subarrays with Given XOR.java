import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		int i,n=arr.size();
		int xor=0;
		int ans=0;
		for(i=0;i<n;i++)
		{
			xor^=arr.get(i);
			if(map.containsKey(xor^x))
			ans+=map.get(xor^x);
			map.put(xor,map.getOrDefault(xor, 0)+1);
		}
		return ans;
	}
}
