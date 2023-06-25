import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		Set<Integer> set=new HashSet<>();
		for(int x:arr)
		set.add(x);
		return set.size();
	}
}
