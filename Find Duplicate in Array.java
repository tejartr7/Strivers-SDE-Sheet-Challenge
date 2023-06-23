import java.io.*;
import java.util.* ;


public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr)
        {
            if(set.contains(x))return x;
            set.add(x);
        }
        return -1;
    }
}
