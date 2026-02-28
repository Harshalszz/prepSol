package ProblemsDay_265;

public class ChecktheSentencePangram {

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/?envType=problem-list-v2&envId=string
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
