#include <bits/stdc++.h>
bool findPattern(string p, string s) {
  // Write your code here.
  int i = 0;
  int j = 0;
  int n = s.size();
  for (i = 0; i < n - p.size() + 1; i++) {
    if (s.substr(i, p.size()) == p)
      return true;
  }
  return false;
}
