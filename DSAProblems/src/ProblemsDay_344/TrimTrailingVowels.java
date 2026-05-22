package ProblemsDay_344;

public class TrimTrailingVowels {
//https://leetcode.com/problems/trim-trailing-vowels/?envType=problem-list-v2&envId=string

    public String trimTrailingVowels(String s) {
        int i = s.length() - 1;

        while (i >= 0 &&
                (s.charAt(i) == 'a' ||
                        s.charAt(i) == 'e' ||
                        s.charAt(i) == 'i' ||
                        s.charAt(i) == 'o' ||
                        s.charAt(i) == 'u')) {
            i--;
        }

        return s.substring(0, i + 1);
    }

    public static void main(String[] args) {

    }
}
