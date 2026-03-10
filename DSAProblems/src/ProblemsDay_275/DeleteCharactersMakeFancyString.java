package ProblemsDay_275;

public class DeleteCharactersMakeFancyString {

//https://leetcode.com/problems/delete-characters-to-make-fancy-string/?envType=problem-list-v2&envId=string
    public String makeFancyString(String s) {

        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            int n = res.length();

            if (n >= 2 && res.charAt(n - 1) == c && res.charAt(n - 2) == c) {
                continue; // skip if it would create 3 consecutive characters
            }

            res.append(c);
        }

        return res.toString();
    }

    public static void main(String[] args) {

    }
}
