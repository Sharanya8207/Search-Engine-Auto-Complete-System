import java.util.List;

public class Main {
    public static void main(String[] args) {

        SearchEngine engine = new SearchEngine();

        // Insert words
        engine.addWord("java");
        engine.addWord("java");
        engine.addWord("java");
        engine.addWord("javascript");
        engine.addWord("javac");
        engine.addWord("python");
        engine.addWord("python");
        engine.addWord("pytorch");
        engine.addWord("php");

        System.out.println("Suggestions for prefix 'jav':");
        List<String> result1 = engine.getSuggestions("jav", 3);
        System.out.println(result1);

        System.out.println("\nSuggestions for prefix 'py':");
        List<String> result2 = engine.getSuggestions("py", 2);
        System.out.println(result2);
    }
}
