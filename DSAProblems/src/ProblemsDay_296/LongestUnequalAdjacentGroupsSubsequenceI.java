package ProblemsDay_296;

import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequenceI {

//https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/?envType=problem-list-v2&envId=string
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int last = -1;
        for (int i = 0; i < words.length; i++) {
            if (groups[i] != last) {
                result.add(words[i]);
                last = groups[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
