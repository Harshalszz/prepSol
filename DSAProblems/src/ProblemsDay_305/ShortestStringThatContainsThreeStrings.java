package ProblemsDay_305;

import java.util.ArrayList;
import java.util.Collections;

public class ShortestStringThatContainsThreeStrings {

//https://leetcode.com/problems/shortest-string-that-contains-three-strings/?envType=problem-list-v2&envId=string
    public static String mergeStrings(String a, String b) {
        String commonCharacters = "";
        int minLength = Math.min(a.length(), b.length());

        // Find common characters at the end of string 'a' and the beginning of string 'b'
        for (int i = 1; i <= minLength; i++) {
            if (a.substring(a.length() - i).equals(b.substring(0, i))) {
                commonCharacters = a.substring(a.length() - i);
            }
        }

        // Merge the strings by removing the common characters
        String mergedString = a + b.substring(commonCharacters.length());

        return mergedString;
    }
    public String shortestSuperstring(String a, String b, String c){
        String s = a.contains(b) ? a : mergeStrings(a, b);
        return s.contains(c) ? s : mergeStrings(s, c);

    }
    public String minimumString(String a, String b, String c) {
        // a + b + c,
        // a + c + b,
        // b + a + c,
        // b + c + a,
        // c + a + b,
        // c + b + a

        ArrayList<String> ls = new ArrayList<>();
        ls.add(shortestSuperstring(a, b, c));
        ls.add(shortestSuperstring(a, c, b));
        ls.add(shortestSuperstring(b, a, c));
        ls.add(shortestSuperstring(b, c, a));
        ls.add(shortestSuperstring(c, a, b));
        ls.add(shortestSuperstring(c, b, a));

        System.out.println(ls);

        Collections.sort(ls, (p, q) -> {
            if (p.length() != q.length()) {
                return p.length() - q.length();
            } else {
                return p.compareTo(q);
            }
        });


        return ls.get(0);
    }

    public static void main(String[] args) {

    }
}
