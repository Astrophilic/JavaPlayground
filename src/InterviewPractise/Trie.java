package InterviewPractise;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private Node root;

    public Trie() {
        this.root = new Node();
    }

    void insertString(String word){
        Node crawl = root;
        for (int i = 0; i < word.length(); i++) {
            char key = word.charAt(i);
            if(!crawl.containsKey(key)){
                crawl.insertKey(key);
            }
            crawl=crawl.getNode(key);
        }
        crawl.setEndOfWord();
    }

    Boolean Search(String word){
        Node crawl = root;
        for (int i = 0; i < word.length(); i++) {
            char key = word.charAt(i);
            if(!crawl.containsKey(key)){
                return false;
            }
            crawl=crawl.getNode(key);
        }
        return crawl.isEndOfWord;
    }

    Boolean startsWith(String prefix){
        Node crawl=root;

        for (int i = 0; i < prefix.length(); i++) {
            Character key=prefix.charAt(i);
            if(!crawl.containsKey(key)){
                return false;
            }
            crawl=crawl.getNode(key);
        }
        return true;
    }

    static class Node{
        private Map<Character, Node> nodeMap;
        Boolean isEndOfWord;

        public Node() {
            this.isEndOfWord = false;
            this.nodeMap = new HashMap<>();
        }

        Boolean containsKey(Character key) {
            return nodeMap.containsKey(key);
        }

        Node getNode(Character key) {

            return nodeMap.get(key);
        }

        void insertKey(Character key) {
            nodeMap.put(key, new Node());
        }

        Boolean isEndOfWord() {
            return isEndOfWord;
        }

        public void setEndOfWord() {
            isEndOfWord = true;

        }
    }

}
