package ProblemsDay_278;

public class CountingWordsWithGivenPrefix {

    //https://leetcode.com/problems/counting-words-with-a-given-prefix/?envType=problem-list-v2&envId=string
    public int prefixCount(String[] words, String pref) {
        int c = 0;
        int n = pref.length();
        for (String w : words) {
            if (w.length() >= n && w.startsWith(pref)) {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {

    }
}
