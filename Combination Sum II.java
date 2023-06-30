import java.util.*;

public class Solution {
    static ArrayList<ArrayList<Integer>> ans;

    public static void helper(int i, ArrayList<Integer> list,
            ArrayList<Integer> arr, int target) {
        int n = arr.size();
        if (target < 0)
            return ;
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        int x;
        for (x = i; x < n; x++) {
            if(x>i && arr.get(x)==arr.get(x-1)) continue;
            if(arr.get(i)>target) continue ;
            list.add(arr.get(x));
            helper(i + 1, list, arr, target - arr.get(x));
            list.remove(list.size() - 1);
            // helper(i + 1, list, arr, target);
        }
    }

    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target) {
        // Write your code here.
        Collections.sort(arr);
        ans = new ArrayList<>();
        int i, j;
        helper(0, new ArrayList<>(), arr, target);
        return ans;
    }
}
