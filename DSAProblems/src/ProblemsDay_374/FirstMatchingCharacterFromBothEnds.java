package ProblemsDay_374;

public class FirstMatchingCharacterFromBothEnds {

//https://leetcode.com/problems/first-matching-character-from-both-ends/?envType=problem-list-v2&envId=string
    public int firstMatchingIndex(String s) {
        int l = 0, h = s.length() - 1;

        while (l <= h) {
            if (s.charAt(l) == s.charAt(h)) {
                return l;
            }
            l++;
            h--;
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
