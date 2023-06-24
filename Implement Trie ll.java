import java.util.*;
import java.io.*;

class node {
    node links[] = new node[26];
    int end = 0;
    int prefix = 0;

    boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    void put(char ch, node n) {
        links[ch - 'a'] = n;
    }

    node get(char ch) {
        return links[ch - 'a'];
    }

    int getEnd() {
        return end;
    }

    void increaseEnd() {
        end++;
    }

    void decreaseEnd() {
        end--;
    }

    int getPrefix() {
        return prefix;
    }

    void increasePrefix() {
        prefix++;
    }

    void decreasePrefix() {
        prefix--;
    }
}

public class Trie {
    node root;

    public Trie() {
        // Write your code here.
        root = new node();
    }

    public void insert(String word) {
        // Write your code here.
        node curr = root;
        int i, n = word.length();
        for (i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (!curr.containsKey(ch)) {
                curr.put(ch, new node());
            }
            curr = curr.get(ch);
            curr.increasePrefix();
        }
        curr.increaseEnd();
    }

    public int countWordsEqualTo(String word) {
        // Write your code here.
        node curr = root;
        int i, n = word.length();
        for (i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (!curr.containsKey(ch)) {
                return 0;
            } else {
                curr = curr.get(ch);
            }
        }
        return curr.getEnd();
    }

    public int countWordsStartingWith(String word) {
        // Write your code here.
        node curr = root;
        int i, n = word.length();
        for (i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (!curr.containsKey(ch)) {
                return 0;
            } else {
                curr = curr.get(ch);
            }
        }
        return curr.getPrefix();
    }

    public void erase(String word) {
        // Write your code here.
        node curr = root;
        int i, n = word.length();
        for (i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (!curr.containsKey(ch)) {
                return;
            } else {
                curr = curr.get(ch);
                curr.decreasePrefix();
            }
        }
        curr.decreaseEnd();
    }

}
