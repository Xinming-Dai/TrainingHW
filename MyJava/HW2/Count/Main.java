package HW2.Count;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE";
        Map<String, Integer> wordCountMap = countWordOccurrences(input);
        System.out.println(wordCountMap);
    }

    public static Map<String, Integer> countWordOccurrences(String input) {
        String[] words = input.toLowerCase().split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
