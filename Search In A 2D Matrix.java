import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int i=0,j=0;
        int m=mat.size(),n=mat.get(0).size();
        while(i<m)
        {
            if(target>=mat.get(i).get(0) && mat.get(i).get(n-1)>=target)
            {
                int l=0,h=n-1;
                while(l<=h)
                {
                    int mid=(l+h)/2;
                    if(mat.get(i).get(mid)==target) return true;
                    else if(mat.get(i).get(mid)<target)
                    {
                        l=mid+1;
                    }
                    else
                        h=mid-1;
                }
            }
            i++;
        }
        return false;
    }
}
