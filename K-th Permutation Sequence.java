import java.util.*;
import java.io.*;
public class Solution {
    public static ArrayList<String> ans;

  
    public static void swap(int i,int j,char ch[])
    {
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    public static void helper(int ind,List<String> list,char ch[])
    {
        if(ind>=ch.length) 
        {
            String temp=new String(ch);
            if(!list.contains(temp))
            list.add(temp);
            return ;
        }
        for(int i=ind;i<ch.length;i++)
        {
            swap(i,ind,ch);
            helper(ind+1,list,ch);
            swap(i,ind,ch);
            //swap(i,ind,ch);
        }
    }
    public static ArrayList<String> find_permutation(String s) {
        // Code here
        ArrayList<String> list=new ArrayList<>();
        helper(0,list,s.toCharArray());
        Collections.sort(list);
        return list;
    }
    public static String kthPermutation(int n, int k) {
        int fact=1;
        k--;
        int i,j;
        List<Integer> list=new ArrayList<>();
        for(i=1;i<=n;i++)
        {
            if(i!=n)
            fact*=i;
            list.add(i);
        }
        String ans="";
        while(true)
        {
            int x=list.get(k/fact);
            ans+=String.valueOf(x);
            int idx=i;
            for(i=0;i<list.size();i++)
            {
                if(list.get(i)==x)
                {
                    idx=i;
                }
            }
            list.remove(idx);
            if(list.size()==0) break;
            k%=fact;
            fact/=list.size();
        }
        return ans;
    }
}
