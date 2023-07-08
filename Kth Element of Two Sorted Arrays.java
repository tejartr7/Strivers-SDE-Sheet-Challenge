
import java.util.*;

public class Solution {
    public static int ninjaAndLadoos(int nums1[], int nums2[], int m, int n, int l) {
        // Write your code here.
        int finalArray[] = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {

                finalArray[k++] = nums1[i++];

            } else {

                finalArray[k++] = nums2[j++];

            }

        }
        if (i < m) {

            while (i < m)

                finalArray[k++] = nums1[i++];

        }

        if (j < n) {

            while (j < n)

                finalArray[k++] = nums2[j++];

        }
        if(k<l) return -1;
        return finalArray[l-1];
    }
}
