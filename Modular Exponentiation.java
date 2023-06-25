import java.io.*;
import java.util.*;

public class Solution {
    public static long p(long x, long n, long m) {
        if (n == 0)
            return 1l;
        long pow = p(x, n / 2, m);
        if (n % 2 == 0)
            return (pow % m * pow % m) % m;
        return (x % m * pow % m * pow % m) % m;
    }

    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
        return (int) p((long) x, (long) n, (long) m);
    }
}
