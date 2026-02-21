package ProblemsDay_258;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountCommonWordsWithOneOccurrence {

    public int countWords(String[] words1, String[] words2) {

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String str : words1) {
            map1.put(str, map1.getOrDefault(str, 0) + 1);
        }

        for (String str : words2) {
            map2.put(str, map2.getOrDefault(str, 0) + 1);
        }

        Set<String> result = new HashSet<>();

        for (String key : map1.keySet()) {
            if (map1.get(key) == 1 && map2.getOrDefault(key, 0) == 1) {
                result.add(key);
            }
        }


        return result.size();


    }
    public static void main(String[] args) {

    }
}
