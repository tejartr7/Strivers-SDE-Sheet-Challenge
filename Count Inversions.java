import java.util.* ;
import java.io.*; 
public class Solution {
    static long c=0;
    public static void mergeSort(int l,int h,long arr[])
    {
        if(l>=h) return ;
        int mid=(l+h)/2;
        mergeSort(l,mid,arr);
        mergeSort(mid+1,h,arr);
        merge(arr,l,mid,h);
    }
    public static void merge(long arr[],int l,int mid,int h)
    {
        long a[]=new long[h-l+1];
        int p=0;
        int p1=l;
        int p2=mid+1;
        while(p1<=mid && p2<=h)
        {
            if(arr[p1]>arr[p2])
            {
                a[p++]=arr[p2++];
                c+=(mid-p1)+1;
            }
            else
                a[p++]=arr[p1++];
        }
         while(p1<=mid)
        {
            a[p++]=arr[p1++];
        }
        while(p2<=h)
        {
            a[p++]=arr[p2++];
        }
        int i;
        //k=l;
        int k=0;
        for(i=l;i<=h;i++)
        {
            arr[i]=a[k++];
        }
    }
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        c=0;
        mergeSort(0,n-1,arr);
        long x=c;
        c=0;
        return x;
    }
}
