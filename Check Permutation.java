import java.util.*;
import java.io.*;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int l = s.length();
        int count = 0;
        int l1 = t.length();
        if (l != l1)
            return false;
        for (int i = 0; i < l; i++) {
            if (a[i] == b[i])
                count++;
            else
                return false;
        }
        return true;
    }

    public static boolean areAnagram(String str1, String str2) {
        // Write your code here.
        return isAnagram(str1, str2);
    }
}
