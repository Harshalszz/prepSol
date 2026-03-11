package ProblemsDay_276;

public class NumberStringsThatAppearSubstringsWord {

//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/?envType=problem-list-v2&envId=string
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String p : patterns) {
            if (word.contains(p)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
