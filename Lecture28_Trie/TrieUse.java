package Lecture28_Trie;

import Lecture22_GenericTree.TreeNode;

public class TrieUse {
    private TrieNode root;
    private int count;

    public TrieUse() {
        root = new TrieNode('\0');
    }

    public boolean search(String word) {
        return searchHelper(root, word);
    }

    private boolean searchHelper(TrieNode root, String word) {
        if (word.length() == 0) {
            if (root.isTerminating) {
                return true;
            } else {
                return false;
            }
        }
        TrieNode child = root.children[word.charAt(0) - 'a'];
        if (child == null) {
            return false;
        } else {
            return searchHelper(child, word.substring(1));
        }
    }

    public void add(String word) {
         if (insertHelper(root, word)) {
            count++;
        }
    }

    private boolean insertHelper(TrieNode root, String word) {
        if (word.length() == 0) {
            if (root.isTerminating) {
                return false;
            } else {
                root.isTerminating = true;
                return true;
            }
        }
        TrieNode child = root.children[word.charAt(0) - 'a'];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[word.charAt(0) - 'a'] = child;
            root.childrenCount++;
        }
        return insertHelper(child, word.substring(1));
    }

    public void delete(String word) {
        if (deleteHelper(root, word)) {
            count--;
        }
    }

    private boolean deleteHelper(TrieNode root, String word) {
        if (word.length() == 0) {
            if (root.isTerminating) {
                root.isTerminating = false;
                return true;
            } else {
                return false;
            }
        }
        TrieNode child = root.children[word.charAt(0) - 'a'];
        if (child == null) {
            return false;
        } else {
            boolean res = deleteHelper(child, word.substring(1));
            if (res) {
                if (!child.isTerminating && child.childrenCount == 0) {
                    root.children[word.charAt(0) - 'a'] = null;
                    root.childrenCount--;
                }
            }
            return res;
        }
    }

    public int getCount() {
        return count;
    }
}
