import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> a, int n){
        // Write your code here.
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=a.get(i);
        ArrayList<Integer> ans= new ArrayList<>();
        Stack<Integer> st = new  Stack<>();
        st.push(-1);
        for(int i=n-1;i>=0;i--){
            while(st.peek()!=-1 && st.peek()>=arr[i]){
                st.pop();
            }
            ans.add(st.peek());
            st.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}
