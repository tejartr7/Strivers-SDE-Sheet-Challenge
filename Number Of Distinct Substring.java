import java.util.* ;
import java.io.*; 
public class Solution {
    public static int distinctSubstring(String word) {
        // Write your code here.
        int i,j;
        int n=word.length();
        i=0;j=0;
        Set<String> set=new HashSet<>();
        int ans=0;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                set.add(word.substring(i,j+1));
            }
        }
        return set.size();
    }
}
