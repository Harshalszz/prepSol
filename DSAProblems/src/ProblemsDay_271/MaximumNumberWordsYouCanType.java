package ProblemsDay_271;

public class MaximumNumberWordsYouCanType {

    //https://leetcode.com/problems/maximum-number-of-words-you-can-type/?envType=problem-list-v2&envId=string
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean canType = true;
            for (char c : brokenLetters.toCharArray()) {
                if (word.indexOf(c) != -1) {
                    canType = false;
                    break;
                }
            }
            if (canType) count++;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
