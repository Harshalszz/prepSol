package ProblemsDay_260;

import java.util.HashMap;
import java.util.List;

public class EvaluatetheBracketPairsString {

//https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/?envType=problem-list-v2&envId=string
    public String evaluate(String s, List<List<String>> knowledge) {
        // Build knowledge map for O(1) lookup
        HashMap<String, String> map = new HashMap<>();
        for (List<String> l : knowledge) {
            map.put(l.get(0), l.get(1));
        }

        // StringBuilder for efficient string building
        StringBuilder sbr = new StringBuilder();
        int replace = 0;  // Start position of current key in StringBuilder
        int index = 0;     // Current end position in StringBuilder

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                // Extract key from StringBuilder (from replace to index)
                String key = sbr.substring(replace);
                // Lookup value, use "?" if not found
                String value = map.getOrDefault(key, "?");
                // Replace the key with value
                sbr.replace(replace, index, value);
                // Update index to end of StringBuilder
                index = sbr.length();
            } else if (s.charAt(i) == '(') {
                // Mark where the new key starts
                replace = index;
            } else {
                // Regular character: append to StringBuilder
                sbr.append(s.charAt(i));
                index++;
            }
        }

        return sbr.toString();
    }
    public static void main(String[] args) {

    }
}
