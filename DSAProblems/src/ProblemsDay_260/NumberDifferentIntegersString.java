package ProblemsDay_260;

import java.util.HashSet;
import java.util.Set;

public class NumberDifferentIntegersString {

    //https://leetcode.com/problems/number-of-different-integers-in-a-string/?envType=problem-list-v2&envId=string
    public int numDifferentIntegers(String word) {
        char[] chars = word.toCharArray();
        int n = chars.length;
        int start = 0;
        int end = 0;
        Set<String> uniqueIntegers = new HashSet<>();
        boolean foundDigit = chars[0] >= '0' && chars[0] <= '9';
        boolean isDigit = false;

        for (int i = 0; i < n; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                if (!isDigit && chars[i] == '0') {
                    start = i + 1;
                } else {
                    isDigit = true;
                }
                end = i + 1;
                foundDigit = true;
            } else {
                if (foundDigit) {
                    if (start == end) {
                        uniqueIntegers.add("0");
                    } else {
                        uniqueIntegers.add(word.substring(start, end));
                    }
                    foundDigit = false;
                }
                isDigit = false;
                start = i + 1;
            }
        }
        if (start == end) {
            uniqueIntegers.add("0");
        } else if (start < end) {
            uniqueIntegers.add(word.substring(start, end));
        }
        return uniqueIntegers.size();
    }
    public static void main(String[] args) {

    }
}
