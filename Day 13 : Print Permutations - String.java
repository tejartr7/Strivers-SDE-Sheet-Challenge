import java.util.*;
import java.io.*;

public class Solution {
    static List<String> ans;

    public static void swap(int i, int j, char ch[]) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void helper(int idx, char ch[]) {
        int i, n = ch.length;
        if (idx >= n) {
            ans.add(new String(ch));
            return;
        }
        for (i = idx; i < ch.length; i++) {
            swap(idx, i, ch);
            helper(idx + 1, ch);
            swap(idx, i, ch);
            // swap(i,ind,ch);
        }
    }

    public static List<String> findPermutations(String s) {
        // Write your code here.
        ans = new ArrayList<>();
        helper(0, s.toCharArray());
        Collections.sort(ans);
        return ans;
    }
}
