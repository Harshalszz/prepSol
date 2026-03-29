package ProblemsDay_294;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowelsString {
//https://leetcode.com/problems/sort-vowels-in-a-string/?envType=problem-list-v2&envId=string

    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels.add(c);
            }
        }

        Collections.sort(vowels);

        StringBuilder result = new StringBuilder();
        int vIndex = 0;
        for (char c : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                result.append(vowels.get(vIndex++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

    }
}
