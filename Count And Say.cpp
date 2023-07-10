#include <bits/stdc++.h>

std::string writeAsYouSpeak(int n) {
  if (n == 1)
    return "1";

  std::string x = writeAsYouSpeak(n - 1);
  int cnt = 1;
  int l = x.size();
  std::string ans;

  for (int i = 1; i < l; i++) {
    if (x[i - 1] == x[i])
      cnt++;
    else {
      ans += std::to_string(cnt);
      ans += x[i - 1];
      cnt = 1;
    }
  }

  ans += std::to_string(cnt);
  ans += x[l - 1];

  return ans;
}
