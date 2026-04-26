package ProblemsDay_319;

public class VowelsGameString {
//https://leetcode.com/problems/vowels-game-in-a-string/?envType=problem-list-v2&envId=string

    public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
