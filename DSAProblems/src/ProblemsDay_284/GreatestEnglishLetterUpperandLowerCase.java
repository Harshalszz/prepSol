package ProblemsDay_284;

public class GreatestEnglishLetterUpperandLowerCase {
//https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/?envType=problem-list-v2&envId=string
    public String greatestLetter(String s) {

        for (int i = 'z'; i >= 'a'; i--) {
            String lower = Character.toString(i);
            String upper = Character.toString(i - 32);
            if (s.contains(lower) && s.contains(upper)) {
                return upper;
            }
        }

        return "";
    }
    public static void main(String[] args) {

    }
}
