import java.util.*;
import java.io.*;

class Node {
  Node links[] = new Node[26];
  boolean flag = false;

  public Node() {

  }

  boolean containsKey(char ch) {
    return (links[ch - 'a'] != null);
  }

  void put(char ch, Node node) {
    links[ch - 'a'] = node;
  }

  Node get(char ch) {
    return (links[ch - 'a']); // ch -'a' gives corresponding ascii of the particular alphabet
  }

  void setEnd() {
    flag = true;
  }

  boolean isEnd() {
    return flag;
  }
};

class Solution {

  static Node root;

  public static boolean valid(String word) {
    Node node = root;
    int i, n = word.length();
    boolean flag = true;
    for (i = 0; i < n && flag; i++) {
      if (node.containsKey(word.charAt(i))) {
        node = node.get(word.charAt(i));
        flag = flag & node.isEnd();
      } else {
        return false;
      }
    }
    return flag;
  }

  public static String completeString(int n, String[] a) {
    // Write your code here.
    String ans = "";
    root = new Node();
    for (String word : a) {
      int i, l = word.length();
      Node curr = root;
      for (i = 0; i < l; i++) {
        char ch = word.charAt(i);
        if (!curr.containsKey(ch))
          curr.put(ch, new Node());
        curr = curr.get(ch);
      }
      curr.setEnd();
    }
    for (String word : a) {
      if (valid(word)) {
        if (word.length() > ans.length()) {
          ans = word;
        } else if (word.length() == ans.length() && ans.compareTo(word) > 0) {
          ans = word;
        }
      }
    }
    root=new Node();
    return ans.length()==0?"None":ans;
  }
}
