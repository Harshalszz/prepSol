package ProblemsDay_291;

import java.util.ArrayList;
import java.util.List;

public class WordsWithinTwoEditsDictionary {
//https://leetcode.com/problems/words-within-two-edits-of-dictionary/?envType=problem-list-v2&envId=string

    private int diff(String a, String b) {
        int n = a.length();
        int same = 0;
        for(int i = 0; i < n; i++) {
            if(a.charAt(i) == b.charAt(i)){
                same++;
            }
        }
        int count = n -same;
        return count;
    }

    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (String query : queries) {
            for (String word : dictionary) {
                int diff = diff(query, word);
                if (diff <= 2) {
                    ans.add(query);
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
