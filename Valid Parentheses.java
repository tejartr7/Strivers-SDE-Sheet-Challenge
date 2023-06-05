import java.util.*;
import java.io.*;
public class Solution {
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        int n=expression.length();
        int i;
        Stack<Character> ans=new Stack<Character>();
        for(i=0;i<n;i++)
        {
            char ch=expression.charAt(i);
            if(ch==')' && !ans.isEmpty())
            {
               if(ans.peek()!='(')
                    return false;
               else if(ans.peek()=='(')
                    ans.pop();
            }
            else if(ch=='}' &&!ans.isEmpty())
            {
                 if(ans.peek()!='{')
                    return false;
                 else if(ans.peek()=='{')
                     ans.pop();
            }
            else if(ch==']' && !ans.isEmpty())
            {
                 if(ans.peek()!='[')
                    return false;
                 else if(ans.peek()=='[')
                     ans.pop();
            }
            else ans.push(ch);
        }
        return ans.isEmpty();
    }
}
