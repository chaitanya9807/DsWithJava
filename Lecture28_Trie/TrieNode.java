package Lecture28_Trie;

public class TrieNode {
    TrieNode[] children;
    int childrenCount;
    char data;
    boolean isTerminating;

    public TrieNode(char data) {
        this.data = data;
        children = new TrieNode[26];
    }
}
