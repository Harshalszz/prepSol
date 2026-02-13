package ProblemsDay_250;

public class CheckNumbersAreAscendinginaSentence {

    //https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/?envType=problem-list-v2&envId=string
    public boolean areNumbersAscending(String s) {
        String[] parts = s.split(" ");
        int prev = -1;
        for (String part : parts) {
            if (part.matches("\\d+")) {
                int num = Integer.parseInt(part);
                if (num <= prev) return false;
                prev = num;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
