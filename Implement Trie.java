
class node {
    node links[] = new node[26];
    boolean flag = false;

    boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    void put(char ch, node n) {
        links[ch - 'a'] = n;
    }

    node get(char ch) {
        return links[ch - 'a'];
    }

    boolean getEnd() {
        return flag;
    }

    void setEnd() {
        flag = true;
    }
}

public class Trie {

    // Initialize your data structure here

    static node root;

    Trie() {
        // Write your code here.
        root = new node();
    }

    // Inserts a word into the trie

    public static void insert(String word) {
        // Write your code here
        int i, n = word.length();
        node curr = root;
        for (i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (!curr.containsKey(ch)) {
                curr.put(ch, new node());
            }
            curr = curr.get(ch);
        }
        curr.setEnd();
    }

    // Returns if the word is in the trie

    public static boolean search(String word) {
        // Write your code here
        int i, n = word.length();
        node curr = root;
        for (i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (!curr.containsKey(ch)) {
                return false;
            }
            curr = curr.get(ch);
        }
        return curr.getEnd();
    }

    // Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String prefix) {
        // Write your code here
        int i, n = prefix.length();
        node curr = root;
        for (i = 0; i < n; i++) {
            char ch = prefix.charAt(i);
            if (!curr.containsKey(ch)) {
                return false;
            }
            curr = curr.get(ch);
        }
        return true;
    }
}
