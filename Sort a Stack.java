import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortInsert(int x,Stack<Integer> stack)
	{
		if(stack.size()==0 || x>stack.peek())
		{
			stack.push(x);
			return ;
		}
		int top=stack.pop();
		sortInsert(x, stack);
		stack.push(top);
	}
	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if(stack.size()==0)
		return ;
		int top=stack.pop();
		sortStack(stack);
		sortInsert(top,stack);
	}

}
