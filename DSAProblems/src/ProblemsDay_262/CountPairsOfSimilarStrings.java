package ProblemsDay_262;

import java.util.*;

public class CountPairsOfSimilarStrings {

    //https://leetcode.com/problems/count-pairs-of-similar-strings/?envType=problem-list-v2&envId=string
    public int similarPairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Set<Character> set = new HashSet<>();
            for (char c : word.toCharArray()) {
                set.add(c);
            }
            char[] letters = new char[set.size()];
            int i = 0;
            for (char c : set) {
                letters[i] = c;
                i++;
            }
            Arrays.sort(letters);
            String str = new String(letters);
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        int count = 0;
        for (int freq : map.values()) {
            count += freq * (freq - 1) / 2;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
