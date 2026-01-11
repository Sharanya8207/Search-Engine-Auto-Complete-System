import java.util.*;

public class SearchEngine {

    private Trie trie;
    private Map<String, Integer> frequencyMap;

    public SearchEngine() {
        trie = new Trie();
        frequencyMap = new HashMap<>();
    }

    // Add search word
    public void addWord(String word) {
        word = word.toLowerCase();
        trie.insert(word);
        frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
    }

    // Auto-complete suggestions
    public List<String> getSuggestions(String prefix, int k) {
        prefix = prefix.toLowerCase();
        TrieNode node = trie.searchPrefix(prefix);

        List<String> result = new ArrayList<>();
        if (node == null)
            return result;

        PriorityQueue<String> maxHeap = new PriorityQueue<>(
                (a, b) -> frequencyMap.get(b) - frequencyMap.get(a)
        );

        dfs(node, prefix, maxHeap);

        while (!maxHeap.isEmpty() && k-- > 0) {
            result.add(maxHeap.poll());
        }

        return result;
    }

    // DFS traversal to collect words
    private void dfs(TrieNode node, String word, PriorityQueue<String> heap) {
        if (node.isEndOfWord) {
            heap.add(word);
        }

        for (char ch : node.children.keySet()) {
            dfs(node.children.get(ch), word + ch, heap);
        }
    }
}
