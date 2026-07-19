class Trie {

    class trieNode {

        trieNode[] child;
        boolean isEnd;

        // Constructor
        trieNode() {
            child = new trieNode[26];
            isEnd = false;
        }
    }

    trieNode root;

    // Constructor
    public Trie() {
        root = new trieNode();
    }

    // Insert
    public void insert(String word) {

        trieNode curr = root;

        for (int i = 0; i < word.length(); i++) {

            int index = word.charAt(i) - 'a';

            if (curr.child[index] == null) {
                curr.child[index] = new trieNode();
            }

            curr = curr.child[index];
        }

        curr.isEnd = true;
    }

    // Search
    public boolean search(String word) {

        trieNode curr = root;

        for (int i = 0; i < word.length(); i++) {

            int index = word.charAt(i) - 'a';

            if (curr.child[index] == null) {
                return false;
            }

            curr = curr.child[index];
        }

        return curr.isEnd;
    }

    // Starts With
    public boolean startsWith(String prefix) {

        trieNode curr = root;

        for (int i = 0; i < prefix.length(); i++) {

            int index = prefix.charAt(i) - 'a';

            if (curr.child[index] == null) {
                return false;
            }

            curr = curr.child[index];
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */