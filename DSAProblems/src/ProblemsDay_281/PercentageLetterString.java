package ProblemsDay_281;

public class PercentageLetterString {

//https://leetcode.com/problems/percentage-of-letter-in-string/?envType=problem-list-v2&envId=string
    public int percentageLetter(String s, char letter) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }

        int percentage = (count * 100) / s.length();
        return percentage;
    }
    public static void main(String[] args) {

    }
}
