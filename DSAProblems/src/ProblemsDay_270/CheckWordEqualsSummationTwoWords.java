package ProblemsDay_270;

public class CheckWordEqualsSummationTwoWords {

//https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/?envType=problem-list-v2&envId=string
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        return getInt(firstWord.toCharArray()) + getInt(secondWord.toCharArray()) == getInt(targetWord.toCharArray());
    }

    private int getInt(char[] chars) {
        int rez = 0;

        for (char ch : chars) {
            rez = rez * 10 + (ch - 'a');
        }

        return rez;
    }
    public static void main(String[] args) {

    }
}
