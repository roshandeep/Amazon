import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        if (!wordDict.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        int level = 1;
        queue.add(beginWord);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current_word = queue.poll();
                char word_char[] = current_word.toCharArray();
                for (int j = 0; j < word_char.length; j++) {
                    char originalChar = word_char[j];
                    for (char k = 'a'; k <= 'z'; k++) {
                        if (word_char[j] == k) {
                            continue;
                        }
                        word_char[j] = k;
                        String new_word = String.valueOf(word_char);

                        if (new_word.equals(endWord)) {
                            level = level + 1;
                            return level;
                        }

                        if (wordDict.contains(new_word)) {
                            queue.add(new_word);
                            wordDict.remove(new_word);
                        }
                    }
                    word_char[j] = originalChar;
                }
            }
            level = level + 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        WordLadder obj = new WordLadder();
//        Set<String> wordDict = new HashSet<String>();
//        wordDict.add("poon");
//        wordDict.add("plee");
//        wordDict.add("same");
//        wordDict.add("poie");
//        wordDict.add("plie");
//        wordDict.add("poin");
//        wordDict.add("plea");
//        String beginWord = "toon";
//        String endWord = "plea";

        Set<String> wordDict = new HashSet<String>();
        wordDict.add("hot");
        wordDict.add("dot");
        wordDict.add("dog");
        wordDict.add("lot");
        wordDict.add("log");
        wordDict.add("cog");
        String beginWord = "hit";
        String endWord = "cog";

        int res = obj.ladderLength(beginWord, endWord, wordDict);
        System.out.print(res);
    }
}
