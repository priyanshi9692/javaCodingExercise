package MicrosoftOA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class WordSearchII {
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        public TrieNode(){
            children = new TrieNode[26];
            isEnd = false;
        }
    }
    class Trie{
        TrieNode root;
        public Trie(){
            root = new TrieNode();
        }

        public void insert(String word){
            TrieNode ws = root;
            for(int i=0;i<word.length();i++){
                if(ws.children[word.charAt(i)-'a'] == null){
                    ws.children[word.charAt(i)-'a'] = new TrieNode();
                }
                ws = ws.children[word.charAt(i)-'a'];
            }
            ws.isEnd = true;
        }
    }

    class Solution {
        public List<String> findWords(char[][] board, String[] words) {
            int m = board.length;
            int n = board[0].length;
            List<String> res = new ArrayList<>();
            Trie trie = new Trie();
            boolean[][] vis = new boolean[m][n];
            for(int i=0;i<words.length;i++){
                trie.insert(words[i]);
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    dfs(board, i, j, vis, res, "", trie.root);
                }
            }
            res = res.stream().distinct().collect(Collectors.toList());
            return res;
        }

        public void dfs(char[][] board, int r, int c, boolean[][] visited, List<String> res,String word, TrieNode root){
            if(r <0|| c < 0 || r >= board.length || c >=board[0].length || visited[r][c] || root.children[board[r][c] - 'a'] == null)
                return;
            visited[r][c] = true;
            word += board[r][c];
            root = root.children[board[r][c] - 'a'];
            if(root.isEnd)
                res.add(word);
            dfs(board, r+1, c, visited, res, word, root);
            dfs(board, r-1, c, visited, res, word, root);
            dfs(board, r, c+1, visited, res, word, root);
            dfs(board, r, c-1, visited, res, word, root);
            visited[r][c] = false;
        }
    }
}
