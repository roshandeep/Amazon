class Trie {

    class TrieNode{
        TrieNode arr[];
        boolean isEnd;
        char val;

        public TrieNode(){
            this.arr=new TrieNode[26];
            this.isEnd=false;
        }
    }

    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.arr[ch-'a']==null){
                node.arr[ch-'a']=new TrieNode();
            }
            node=node.arr[ch-'a'];
        }
        node.isEnd=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.arr[ch-'a']==null){
                return false;
            }
            node=node.arr[ch-'a'];
        }
        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(node.arr[ch-'a']==null){
                return false;
            }
            node=node.arr[ch-'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie obj = new Trie();
        String word="apple";
        String prefix="app";
        obj.insert(word);
        boolean param_2 = obj.search(word);
        boolean param_3 = obj.startsWith(prefix);
        System.out.println(param_2);
        System.out.println(param_3);
    }
}



