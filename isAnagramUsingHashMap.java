import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        String secondString = scanner.next();
        scanner.close();
        
        boolean result = checkAnagram(firstString, secondString);
        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }

    private static boolean checkAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : a.toLowerCase().toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : b.toLowerCase().toCharArray()) {
            if (!frequencyMap.containsKey(ch) || frequencyMap.get(ch) == 0) {
                return false;
            }
            frequencyMap.put(ch, frequencyMap.get(ch) - 1);
        }

        return true;
    }
}